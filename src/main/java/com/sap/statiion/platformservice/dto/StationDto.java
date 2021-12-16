package com.sap.statiion.platformservice.dto;

import java.sql.Time;
import java.util.List;

public class StationDto {
	
	private String stationId;
	
	private String stationName;
	
	private List<TrainDto> trainList;
	
    private List<String> arrivalTime;
    
    private List<String> departureTime;

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public List<TrainDto> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<TrainDto> trainList) {
		this.trainList = trainList;
	}

	public List<String> getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(List<String> arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public List<String> getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(List<String> departureTime) {
		this.departureTime = departureTime;
	}
    
    
    

}
