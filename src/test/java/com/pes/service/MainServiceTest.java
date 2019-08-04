package com.pes.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pes.dto.TechResponseDto;
import com.pes.entity.Tech;
import com.pes.repository.TechRepository;
import com.pes.service.TechService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainServiceTest {

    @Autowired
    TechRepository TechRepository;
    @Autowired
    TechService mainService;

    @After
    public void cleanup() {
        TechRepository.deleteAll();
    }

//    @Test
//    public void findAll() {
//        //given
//    	Tech tech = new Tech(
//  			   "aws.png"
//    	      ,"Amazon Web Service"
//    	      ,"level"
//    	      ,"skill"
//  			);
//        
//        TechRepository.save(tech);
//
//        //when
//        List<TechResponseDto> dtoList = mainService.findAll();
//
//        //then
//        TechResponseDto dto = dtoList.get(0);
//        assertThat(dto.getImg_src(), is("aws_logo.png"));
//    }
    
}