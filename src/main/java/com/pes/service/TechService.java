package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.TechResponseDto;
import com.pes.entity.Tech;
import com.pes.repository.TechRepository;

@Service
public class TechService {
	
	@Autowired
    private TechRepository techRepository;

	@Transactional(readOnly = true)
    public List<TechResponseDto> findAll(){
		
		List<Tech> TechList = techRepository.findAll();
		
		List<TechResponseDto> dtoList = new ArrayList<TechResponseDto>();
		
		for (Tech Tech : TechList) {
			TechResponseDto dto = new TechResponseDto(Tech);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
	
	@Transactional(readOnly = true)
    public List<TechResponseDto> findBySkill(String skill){
		
		List<Tech> TechSkillList = techRepository.findBySkill(skill);
		
		List<TechResponseDto> dtoList = new ArrayList<TechResponseDto>();
		
		for (Tech Tech : TechSkillList) {
			TechResponseDto dto = new TechResponseDto(Tech);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}