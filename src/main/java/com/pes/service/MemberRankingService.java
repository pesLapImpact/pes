package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.MemberRankingResponseDto;
import com.pes.entity.MemberRanking;
import com.pes.repository.MemberRankingRepository;

@Service
public class MemberRankingService {
	
	@Autowired
    private MemberRankingRepository memberRankingRepository;

	@Transactional(readOnly = true)
    public List<MemberRankingResponseDto> findAll(){
		
		List<MemberRanking> MemberRankingList = memberRankingRepository.findAll();
		List<MemberRankingResponseDto> dtoList = new ArrayList<MemberRankingResponseDto>();
		
		for (MemberRanking MemberRanking : MemberRankingList) {
			MemberRankingResponseDto dto = new MemberRankingResponseDto(MemberRanking);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}