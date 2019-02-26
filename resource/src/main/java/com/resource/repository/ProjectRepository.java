package com.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resource.model.ProjectDetails;


public interface ProjectRepository extends JpaRepository<ProjectDetails	,Integer> {

}
