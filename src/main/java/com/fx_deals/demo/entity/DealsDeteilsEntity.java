package com.fx_deals.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name="deals_deteils")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
@Entity
public class DealsDeteilsEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deal_id")
    private  Long dealId ;



    @Column(name = "amount")
    private Integer amount ;


    @Column(name = "from_CIC")
    private Integer fromCIC;

    @Column(name = "to_CIC")
    private Integer toCIC;



    @Column(name = "deal_time")
    private LocalDateTime  dealTime ;










}
