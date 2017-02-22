package com.example;

import java.time.LocalDateTime;

public class MachineData {
	private String machineId;
	private String tag;
	private LocalDateTime timestamp;
	private Double value;
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "MachineData [machineId=" + machineId + ", tag=" + tag + ", timestamp=" + timestamp + ", value=" + value
				+ "]";
	}
	public MachineData(String machineId, String tag, LocalDateTime timestamp, Double value) {
		super();
		this.machineId = machineId;
		this.tag = tag;
		this.timestamp = timestamp;
		this.value = value;
	}
	public MachineData() {
		super();
	}
	
}
