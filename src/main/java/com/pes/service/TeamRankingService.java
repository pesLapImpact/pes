package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.TeamRankingResponseDto;
import com.pes.entity.TeamRanking;
import com.pes.repository.TeamRankingRepository;

@Service
public class TeamRankingService {
	
	@Autowired
    private TeamRankingRepository TeamRankingRepository;

	@Transactional(readOnly = true)
    public List<TeamRankingResponseDto> findAll(){
		
		List<TeamRanking> TeamRankingList = TeamRankingRepository.findAll();
		List<TeamRankingResponseDto> dtoList = new ArrayList<TeamRankingResponseDto>();
		
		for (TeamRanking TeamRanking : TeamRankingList) {
			TeamRankingResponseDto dto = new TeamRankingResponseDto(TeamRanking);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}