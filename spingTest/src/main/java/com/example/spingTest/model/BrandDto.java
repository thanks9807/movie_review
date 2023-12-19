package com.example.spingTest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Builder
public class BrandDto {
    int brand_idx;
    String brand_id;
    String brand_pw;
    String brand_photo;
    String brand_introduction;
    int brand_style;
    String phone_number;
    String business_registration;
    String mail_order_business_report_card;
    String bank_account_number;
    String return_address;
    int return_cost;
    String return_courier;
    String business_address;
    Date creation_date;
    Date modification_date;
    int status;
}
