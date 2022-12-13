package com.slesha.planms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class InsurancePlan {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer planId;
    private String planName;
    private String planArea;
    private Integer averagePremium;
    private Integer maximumCoverage;
    
}