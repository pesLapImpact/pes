package com.pes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.ReportsResponseDto;
import com.pes.entity.Comments;
import com.pes.entity.Reports;
import com.pes.repository.CommentsRepository;
import com.pes.repository.ReportsRepository;

@Service
public class ReportsService {
	
	@Autowired
    private ReportsRepository reportsRepository;
	@Autowired
    private CommentsRepository commentsRepository;

	@Transactional(readOnly = true)
    public List<ReportsResponseDto> findReportById(Long result_id){
		
		List<ReportsResponseDto> reportsList = new ArrayList<ReportsResponseDto>(); 
		
		List<Reports> reports_list = reportsRepository.findByResultId(result_id)
				.collect(Collectors.toList());
		
		Reports report = reports_list.get(0);
		
		List<Comments> commentList = commentsRepository.findByResultId(result_id);
		ReportsResponseDto dto = new ReportsResponseDto(report, commentList);
		
		reportsList.add(dto);
		
        return reportsList;
    }
}