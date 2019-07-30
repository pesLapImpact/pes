package com.pes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pes.dto.MainMenuResponseDto;
import com.pes.entity.MainMenu;
import com.pes.repository.MainMenuRepository;

@Service
public class MainMenuService {
	
	@Autowired
    private MainMenuRepository mainMenuRepository;

	@Transactional(readOnly = true)
    public List<MainMenuResponseDto> findAll(){
		
		List<MainMenu> MainMenuList = mainMenuRepository.findAll();
		List<MainMenuResponseDto> dtoList = new ArrayList<MainMenuResponseDto>();
		
		for (MainMenu mainMenu : MainMenuList) {
			MainMenuResponseDto dto = new MainMenuResponseDto(mainMenu);
			dtoList.add(dto);
		}
		
        return dtoList;
    }
}