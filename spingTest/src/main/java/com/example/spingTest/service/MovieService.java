package com.example.spingTest.service;

import com.example.spingTest.model.Entity.Movie;
import com.example.spingTest.model.Entity.Review;
import com.example.spingTest.model.MovieDto;
import com.example.spingTest.model.ReviewDto;
import com.example.spingTest.repo.MovieRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void create(MovieDto movieDto) {

        movieRepository.save(Movie.builder()
                .name(movieDto.getName())
                .price(movieDto.getPrice())
                .build());
    }

    public List<MovieDto> list() {
        List<Movie> movieList = movieRepository.findAll();
        List<MovieDto> result = new ArrayList<>();
        for (Movie movie:movieList) {
            List<ReviewDto> reviewDtos = new ArrayList<>();
            for (Review reveiw:movie.getReviews()) {
                ReviewDto reviewDto = ReviewDto.builder()
                        .id(reveiw.getId())
                        .star(reveiw.getStar())
                        .text(reveiw.getText())
                        .build();
                reviewDtos.add(reviewDto);
            }

            result.add(MovieDto.builder()
                            .id(movie.getId())
                            .name(movie.getName())
                            .price(movie.getPrice())
                            .reviews(movie.getReviews())
                    .build());
        }
        return result;
    }

    public MovieDto read(Integer id) {
        Optional<Movie> result = movieRepository.findById(id);
        if (result.isPresent()) {
            Movie movie = result.get();

            return MovieDto.builder()
                    .id(movie.getId())
                    .price(movie.getPrice())
                    .name(movie.getName())
                    .reviews(movie.getReviews())
                    .build();
        } else {
            return null;
        }
    }

    public void update(MovieDto movieDto) {
        movieRepository.save(Movie.builder()
                .id(movieDto.getId())
                .name(movieDto.getName())
                .price(movieDto.getPrice())
                .build());
    }

    public void delete(Integer id) {
        movieRepository.delete(Movie.builder().id(id).build());
    }
}
