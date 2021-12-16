package com.sap.statiion.platformservice.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PlatformCommonUtils {
	
	public List<Integer> convertToIntegerList(List<String> timeList){
		
		List<Integer> convArrivalTime = new ArrayList<Integer>();
		
		timeList.stream().forEach(data -> {
			
			String[] hourminArray =  data.split(":");
			data =hourminArray[0].concat(hourminArray[1]);
			Integer hrmin = Integer.parseInt(data);
			convArrivalTime.add(hrmin);
		});
		
		return convArrivalTime;
	}

}
