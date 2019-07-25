package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pes.entity.Tech;

public interface TechRepository extends JpaRepository<Tech, Long>{}
