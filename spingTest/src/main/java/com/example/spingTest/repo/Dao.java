package com.example.spingTest.repo;

import com.example.spingTest.model.BrandDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class Dao {
    private JdbcTemplate jdbcTemplate;

    public Dao(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean insert(BrandDto brandDto){
        String sql = "INSERT INTO `lonua`.`brand`(" +
                "`brand_id`," +
                "`brand_pw`," +
                "`brand_photo`," +
                "`brand_introduction`," +
                "`brand_style`," +
                "`phone_number`," +
                "`business_registration`," +
                "`mail_order_business_report_card`," +
                "`bank_account_number`," +
                "`return_address`," +
                "`return_cost`," +
                "`return_courier`," +
                "`business_address`," +
                "`creation_date`," +
                "`modification_date`," +
                "`status`)" +
                "VALUES(" +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?," +
                "?);";
        Objects[] args = new Objects[]{};
        jdbcTemplate.update(sql,args);
        return true;
    }
}
