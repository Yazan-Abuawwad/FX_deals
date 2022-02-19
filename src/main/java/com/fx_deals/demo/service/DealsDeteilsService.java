package com.fx_deals.demo.service;

import com.fx_deals.demo.controller.DealsDeteilsResource;
import com.fx_deals.demo.entity.DealsDeteilsEntity;
import com.fx_deals.demo.repository.DealsDeteilsRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import java.util.List;

@Service
public class DealsDeteilsService {

    @Autowired
    private DealsDeteilsRepo dealsRepo;


    private final Logger logger= LoggerFactory.getLogger(DealsDeteilsResource.class);


    public DealsDeteilsEntity create(DealsDeteilsEntity deals) {

        logger.debug("Request to save Deal Deteil  : {}", deals);




        return dealsRepo.save( deals);
    }

}
