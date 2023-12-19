package com.example.spingTest.service;

import com.example.spingTest.model.Entity.Movie;
import com.example.spingTest.model.Entity.Review;
import com.example.spingTest.model.MovieDto;
import com.example.spingTest.model.ReviewDto;
import com.example.spingTest.repo.MovieRepository;
import com.example.spingTest.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ReviewService {
    ReviewRepo reviewRepo;

    MovieRepository movieRepository;

    public ReviewService(ReviewRepo reviewRepo,MovieRepository movieRepository) {
        this.reviewRepo = reviewRepo;
        this.movieRepository = movieRepository;
    }

    public void create(Integer movieId,ReviewDto reviewDto) {

        //Movie movie = movieRepository.findById(reviewDto.getMovieId()).get();
        Movie movie = Movie.builder().id(movieId).build();
        Review review = Review.builder()
                .id(reviewDto.getId())
                .star(reviewDto.getStar())
                .text(reviewDto.getText())
                .movie(movie)
                .build();
        movie.getReviews().add(review);
        this.reviewRepo.save(review);

    }

    public List<ReviewDto> list(){
        List<Review> reviewList = reviewRepo.findAll();
        List<ReviewDto> reviewDtoList = new ArrayList<>();
        for (Review review:reviewList) {
            ReviewDto reviewDto = ReviewDto.builder()
                    .id(review.getId())
                    .star(review.getStar())
                    .text(review.getText())
                    .movieDto(MovieDto.builder()
                            .name(review.getMovie().getName())
                            .id(review.getMovie().getId())
                            .price(review.getMovie().getPrice())
                            .build())
                    .build();
            reviewDtoList.add(reviewDto);
        }

        return reviewDtoList;
    }
    public ReviewDto read(Integer id) {
        Optional<Review> result = this.reviewRepo.findById(id);
        if (result.isPresent()) {
            Review review = result.get();

            return ReviewDto.builder()
                    .id(review.getId())
                    .star(review.getStar())
                    .text(review.getText())
                    .build();
        } else {
            return null;
        }
    }
    public void update(ReviewDto reviewDto) {
        this.reviewRepo.save(Review.builder()
                .id(reviewDto.getId())
                .star(reviewDto.getStar())
                .text(reviewDto.getText())
                .build());
    }
    public void delete(Integer id) {
        this.reviewRepo.delete(Review.builder().id(id).build());
    }
}
