package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.entity.Members;

public interface MembersRepository extends JpaRepository<Members, Long>{}
