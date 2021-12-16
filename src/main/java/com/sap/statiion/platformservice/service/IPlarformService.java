package com.sap.statiion.platformservice.service;

import org.springframework.stereotype.Service;

import com.sap.statiion.platformservice.dto.StationDto;

@Service
public interface IPlarformService {

	Integer fetchMinimumPlatforRequired(StationDto stationDto);
	
}
