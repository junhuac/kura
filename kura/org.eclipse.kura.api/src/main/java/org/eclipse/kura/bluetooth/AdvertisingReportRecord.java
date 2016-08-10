package org.eclipse.kura.bluetooth;

public class AdvertisingReportRecord {
	private int eventType;
	private int addressType;
	private String address;
	private byte [] reportData;
	private int length;
	
	public AdvertisingReportRecord() {

	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public int getAddressType() {
		return addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte [] getReportData() {
		return reportData;
	}

	public void setReportData(byte [] reportData) {
		this.reportData = reportData;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
