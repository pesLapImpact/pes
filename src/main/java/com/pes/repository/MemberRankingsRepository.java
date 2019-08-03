package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.entity.MemberRankings;

public interface MemberRankingsRepository extends JpaRepository<MemberRankings, Long>{}
