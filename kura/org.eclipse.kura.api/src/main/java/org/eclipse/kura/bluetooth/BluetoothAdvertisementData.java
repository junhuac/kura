package org.eclipse.kura.bluetooth;

import java.util.ArrayList;
import java.util.List;

public class BluetoothAdvertisementData {
	private byte[] rawData;
	private byte packetType;
	private byte eventType;
	private int parameterLength;
	private byte subEventCode;
	private int numberOfReports;
	
	private List<AdvertisingReportRecord> reportRecords;
	
	public byte[] getRawData() {
		return rawData;
	}
	
	public void setRawData(byte[] rawData) {
		this.rawData = new byte[rawData.length];
		System.arraycopy(rawData, 0, this.rawData, 0, rawData.length);
	}
	
	public byte getPacketType() {
		return packetType;
	}
	
	public void setPacketType(byte packetType) {
		this.packetType = packetType;
	}

	public byte getEventType() {
		return eventType;
	}
	
	public void setEventType(byte eventType) {
		this.eventType = eventType;
	}

	public int getParameterLength() {
		return parameterLength;
	}
	
	public void setParameterLength(int parameterLength) {
		this.parameterLength = parameterLength;
	}

	public byte getSubEventCode() {
		return subEventCode;
	}
	
	public void setSubEventCode(byte subEventCode) {
		this.subEventCode = subEventCode;
	}
	
	public int getNumberOfReports() {
		return numberOfReports;
	}
	
	public void setNumberOfReports(int numberOfReports) {
		this.numberOfReports = numberOfReports;
	}
	
	public List<AdvertisingReportRecord> getReportRecords() {
		return reportRecords;
	}
	
	public void addReportRecord(AdvertisingReportRecord advertisingReportRecord) {
		if (this.reportRecords == null) {
			this.reportRecords = new ArrayList<AdvertisingReportRecord>();
		}
		this.reportRecords.add(advertisingReportRecord);
	}
}
