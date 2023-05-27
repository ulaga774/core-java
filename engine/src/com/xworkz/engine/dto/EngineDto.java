package com.xworkz.engine.dto;

import javax.management.ConstructorParameters;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@ToString

public class EngineDto {
	
	private String engine_name;
	private String model;
	private String engine_type;
	private long serialNumber;
	private int engine_Capacity;
	
	public EngineDto(String engine_name, String model, String engine_type, long serialNumber, 
			int engine_Capacity) {
		super();
		this.engine_name = engine_name;
		this.model = model;
		this.engine_type = engine_type;
		this.serialNumber = serialNumber;
		this.engine_Capacity = engine_Capacity;
	}
	public String getEngine_name() {
		return engine_name;
	}
	public void setEngine_name(String engine_name) {
		this.engine_name = engine_name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngine_type() {
		return engine_type;
	}
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getEngine_Capacity() {
		return engine_Capacity;
	}
	public void setEngine_Capacity(int engine_Capacity) {
		this.engine_Capacity = engine_Capacity;
	}
	@Override
	public String toString() {
		return "EngineDto [engine_name=" + engine_name + ", model=" + model + ", engine_type=" + engine_type
				+ ", serialNumber=" + serialNumber + ", engine_Capacity=" + engine_Capacity + "]";
	}
	
	

}

