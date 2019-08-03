package com.pes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.MemberResultResponseDto;
import com.pes.entity.MemberResults;
import com.pes.entity.Members;
import com.pes.repository.CommentsRepository;
import com.pes.repository.MemberResultsRepository;
import com.pes.repository.MembersRepository;

@Service
public class MemberResultsService {
	
	@Autowired
    private MemberResultsRepository memberResultRepository;
	@Autowired
    private MembersRepository membersRepository;
	@Autowired
    private CommentsRepository commentsRepository;

	@Transactional(readOnly = true)
    public List<MemberResultResponseDto> findAll(){
		
		List<MemberResults> memberResulstList = memberResultRepository.findAll();
		List<MemberResultResponseDto> dtoList = new ArrayList<MemberResultResponseDto>();
		
		for (MemberResults MemberResult : memberResulstList) {
			Long memberResultId = MemberResult.getId();
			int commentCount = commentsRepository.findCommentCount(memberResultId);
			
			Long homeMemberId = MemberResult.getHome_member_id();
			Long awayMemberId = MemberResult.getAway_member_id();
			Optional<Members> homeMember = membersRepository.findById(homeMemberId);
			Optional<Members> awayMember = membersRepository.findById(awayMemberId);
			int homeRating = homeMember.orElse(null).getRating();
			int awayRating = awayMember.orElse(null).getRating();
			
			MemberResultResponseDto dto = new MemberResultResponseDto(MemberResult, homeRating, awayRating, commentCount);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}