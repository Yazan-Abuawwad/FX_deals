package com.fx_deals.demo.controller;

import com.fx_deals.demo.controller.errors.DealsException;
import com.fx_deals.demo.entity.DealsDeteilsEntity;
import com.fx_deals.demo.service.DealsDeteilsService;


import org.apache.tomcat.util.http.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.net.URI;
import java.net.URISyntaxException;


@RestController
@RequestMapping("/api")
public class DealsDeteilsResource {



    @Autowired
    private DealsDeteilsService dealsService;

    private final Logger logger= LoggerFactory.getLogger(DealsDeteilsResource.class);

    @PostMapping(value ="/deal")
    public ResponseEntity<DealsDeteilsEntity> createDeal(@RequestBody DealsDeteilsEntity deal)throws URISyntaxException  {

        logger.debug("REST request to save Deal Deteil : {}", deal);

        DealsDeteilsEntity  result = dealsService.create(deal);


        if (deal.getAmount()==null){
            throw new DealsException("amount not found" ,result);
        }
        if (deal.getFromCIC()==null){
            throw new DealsException("From Currency ISO Code not found" ,result);
        }
        if (deal.getToCIC()==null){
            throw new DealsException(" To Currency ISO Code not found" ,result);
        }



        return  ResponseEntity.created(new URI("/api/deal/" + result.getDealId()))
                .header("DealsDeteilsEntity",result.getDealId().toString())
                .body(result);
    }






}
