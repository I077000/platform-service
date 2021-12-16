package com.sap.statiion.platformservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.statiion.platformservice.dto.StationDto;
import com.sap.statiion.platformservice.service.IPlarformService;

@RestController
@RequestMapping("/api/v1")
public class PlatformController {
	
	
	
	@Autowired
	IPlarformService platformService;
	
	@GetMapping("/platform-service")
	public ResponseEntity<Integer> getMinimumPlatformRequired(@RequestBody StationDto stationDto){
		
		int minimumPlatform = 0;
		
		minimumPlatform = platformService.fetchMinimumPlatforRequired(stationDto);
		
		return new ResponseEntity<Integer>(minimumPlatform, HttpStatus.OK);
		
	}

}
