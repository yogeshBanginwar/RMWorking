package com.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resource.model.DemandDetails;

public interface DemandRepository extends JpaRepository<DemandDetails, Integer> {

}
