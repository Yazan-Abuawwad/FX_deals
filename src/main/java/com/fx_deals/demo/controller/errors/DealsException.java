package com.fx_deals.demo.controller.errors;

import com.fx_deals.demo.entity.DealsDeteilsEntity;
import org.springframework.beans.factory.annotation.Autowired;


public class DealsException  extends  RuntimeException{



    private final DealsDeteilsEntity dealsDeteilsEntity ;


    public DealsException(String message, DealsDeteilsEntity dealsDeteilsEntity) {
        super(message);
        this.dealsDeteilsEntity = dealsDeteilsEntity;
    }



    public DealsException(String message, Throwable cause) {
        super(message, cause);
        dealsDeteilsEntity = new DealsDeteilsEntity();
    }

    public DealsException(Throwable cause) {
        super(cause);
        dealsDeteilsEntity = new DealsDeteilsEntity();
    }

    public DealsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {

        super(message, cause, enableSuppression, writableStackTrace);
        dealsDeteilsEntity = new DealsDeteilsEntity();
    }

    public DealsDeteilsEntity getDealsDeteilsEntity() {
        return dealsDeteilsEntity;
    }
}
