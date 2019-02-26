package com.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resource.model.AccountDetails;

public interface AccountRepository extends JpaRepository<AccountDetails, Integer> {

}
