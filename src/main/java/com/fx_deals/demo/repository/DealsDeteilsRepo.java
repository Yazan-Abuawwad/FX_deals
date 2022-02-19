package com.fx_deals.demo.repository;

import com.fx_deals.demo.entity.DealsDeteilsEntity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealsDeteilsRepo extends JpaRepository<DealsDeteilsEntity,Long> {


}
