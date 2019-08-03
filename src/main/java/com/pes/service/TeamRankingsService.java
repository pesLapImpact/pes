package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.TeamRankingResponseDto;
import com.pes.entity.TeamRankings;
import com.pes.repository.TeamRankingsRepository;

@Service
public class TeamRankingsService {
	
	@Autowired
    private TeamRankingsRepository TeamRankingRepository;

	@Transactional(readOnly = true)
    public List<TeamRankingResponseDto> findAll(){
		
		List<TeamRankings> TeamRankingList = TeamRankingRepository.findAll();
		List<TeamRankingResponseDto> dtoList = new ArrayList<TeamRankingResponseDto>();
		
		for (TeamRankings TeamRanking : TeamRankingList) {
			TeamRankingResponseDto dto = new TeamRankingResponseDto(TeamRanking);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}