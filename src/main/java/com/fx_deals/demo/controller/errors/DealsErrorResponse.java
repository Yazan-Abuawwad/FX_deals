package com.fx_deals.demo.controller.errors;

import com.fx_deals.demo.entity.DealsDeteilsEntity;
import lombok.Data;

import javax.swing.text.html.parser.Entity;

@Data
public class DealsErrorResponse {


    private int status;
    private String message;
    private long timeStamp;
    private   DealsDeteilsEntity entity;



}
