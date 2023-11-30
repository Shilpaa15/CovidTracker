package com.mindtree.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import covid.analysis.model.CovidData;
import covid.analysis.service.CovidService;

@Repository
public interface CovidDao extends JpaRepository<CovidData, Integer> {


	
	
}
