package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.CupResponseDto;
import com.pes.entity.Cup;
import com.pes.repository.CommentsRepository;
import com.pes.repository.CupRepository;

@Service
public class CupService {
	
	@Autowired
    private CupRepository cupRepository;
	@Autowired
    private CommentsRepository commentsRepository;

	@Transactional(readOnly = true)
    public List<CupResponseDto> findAll(){
		
		List<Cup> cupList = cupRepository.findAll();
		List<CupResponseDto> dtoList = new ArrayList<CupResponseDto>();
		
		for (Cup cup : cupList) {
			Long id = cup.getId();
			int commentCount = commentsRepository.findCommentCount(id);
			CupResponseDto dto = new CupResponseDto(cup, commentCount);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}