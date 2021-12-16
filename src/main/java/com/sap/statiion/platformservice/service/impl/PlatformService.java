package com.sap.statiion.platformservice.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sap.statiion.platformservice.common.PlatformCommonUtils;
import com.sap.statiion.platformservice.dto.StationDto;
import com.sap.statiion.platformservice.service.IPlarformService;

@Service
public class PlatformService  implements IPlarformService{

	
	@Autowired
	PlatformCommonUtils platformUtillity;
	
	public Integer fetchMinimumPlatforRequired(StationDto stationDto) {
		
		//Fetch All Train coming to station and iterate to create a list of arrivals and departures at station
		
		List<Integer> arrivalTime = platformUtillity.convertToIntegerList(stationDto.getArrivalTime());
		List<Integer> departureTime = platformUtillity.convertToIntegerList(stationDto.getDepartureTime());
		Collections.sort(arrivalTime);
		Collections.sort(departureTime);
		int  minPlatformRequired = calcultatePlatformRequired(arrivalTime,departureTime);
		
		return minPlatformRequired;
	}

	private int calcultatePlatformRequired(List<Integer> arrivalTime, List<Integer> departureTime) {
		
		int maxPlatform = 0;
		
		int arrivalPointer = 0;
		
		int departurePointer = 0;
		
		int platformRequired  = 0;
		
		while(arrivalPointer < arrivalTime.size() && departurePointer < departureTime.size()) {
			
			if(arrivalTime.get(arrivalPointer) < departureTime.get(departurePointer)) {
				platformRequired++;
				arrivalPointer++;
				if(platformRequired > maxPlatform) {
					maxPlatform = platformRequired;
				}
			}
			else {
				platformRequired--;
				departurePointer++;
			}
			
		}
		
		return maxPlatform;
	}

}
