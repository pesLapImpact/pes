package com.pes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.entity.Tech;

public interface TechRepository extends JpaRepository<Tech, Long>{
	
	List<Tech> findBySkill (String skill);
	
}
