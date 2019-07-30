package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.entity.MemberRanking;

public interface MemberRankingRepository extends JpaRepository<MemberRanking, Long>{}
