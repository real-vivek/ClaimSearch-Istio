package com.real.vivek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.real.vivek.model.ClaimInfo;

@Component
public interface ClaimRepoDAO extends JpaRepository<ClaimInfo, Integer>{

}
