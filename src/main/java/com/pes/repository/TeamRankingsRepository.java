package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.entity.TeamRankings;

public interface TeamRankingsRepository extends JpaRepository<TeamRankings, Long>{}
