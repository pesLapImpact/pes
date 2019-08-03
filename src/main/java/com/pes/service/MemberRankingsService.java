package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.MemberRankingResponseDto;
import com.pes.entity.MemberRankings;
import com.pes.repository.MemberRankingsRepository;

@Service
public class MemberRankingsService {
	
	@Autowired
    private MemberRankingsRepository memberRankingRepository;

	@Transactional(readOnly = true)
    public List<MemberRankingResponseDto> findAll(){
		
		List<MemberRankings> MemberRankingList = memberRankingRepository.findAll();
		List<MemberRankingResponseDto> dtoList = new ArrayList<MemberRankingResponseDto>();
		
		for (MemberRankings MemberRanking : MemberRankingList) {
			MemberRankingResponseDto dto = new MemberRankingResponseDto(MemberRanking);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}