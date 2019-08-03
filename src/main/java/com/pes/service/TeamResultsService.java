package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.TeamResultResponseDto;
import com.pes.entity.TeamResults;
import com.pes.repository.TeamResultsRepository;

@Service
public class TeamResultsService {
	
	@Autowired
    private TeamResultsRepository teamResultRepository;

	@Transactional(readOnly = true)
    public List<TeamResultResponseDto> findAll(){
		
		List<TeamResults> TeamResultList = teamResultRepository.findAll();
		List<TeamResultResponseDto> dtoList = new ArrayList<TeamResultResponseDto>();
		
		for (TeamResults TeamResult : TeamResultList) {
			TeamResultResponseDto dto = new TeamResultResponseDto(TeamResult);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}