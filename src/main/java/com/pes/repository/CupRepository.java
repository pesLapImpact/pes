package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.entity.Cup;

public interface CupRepository extends JpaRepository<Cup, Long>{}
