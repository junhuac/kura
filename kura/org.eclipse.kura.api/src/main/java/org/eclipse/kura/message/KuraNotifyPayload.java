/**
 * Copyright (c) 2011, 2014 Eurotech and/or its affiliates
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Eurotech
 */
package org.eclipse.kura.message;

import java.text.ParseException;

public class KuraNotifyPayload extends KuraPayload
{
	
	private static final String METRIC_CLIENT_ID = "client.id";
	private static final String METRIC_TRASNFER_SIZE = "dp.http.transfer.size";
	private static final String METRIC_TRANSFER_PROGRESS = "dp.http.transfer.progress";
	private static final String METRIC_TRANSFER_STATUS = "dp.http.transfer.status";
	private static final String METRIC_JOB_ID = "job.id";
	private static final String METRIC_ERROR_MESSAGE = "dp.http.transfer.error.message";
	
	public KuraNotifyPayload(String clientId) 
	{
		super();
		addMetric(METRIC_CLIENT_ID, clientId);		
	}
	

	public KuraNotifyPayload(KuraPayload kuraPayload)
	{
		for (String name : kuraPayload.metricNames()) {
			Object value = kuraPayload.getMetric(name);
			addMetric(name, value);
		}
		setBody(kuraPayload.getBody());
		setPosition(kuraPayload.getPosition());
		setTimestamp(kuraPayload.getTimestamp());
	}
	
	public void setClientId(String requesterClientId) {
		addMetric(METRIC_CLIENT_ID, requesterClientId);
	}
	
	public String getClientId() {
		return (String) getMetric(METRIC_CLIENT_ID);
	}
	
	public void setTransferSize(int trasnferSize){
		addMetric(METRIC_TRASNFER_SIZE, trasnferSize);
	}
	
	public int getTransferSize(){
		return (Integer) getMetric(METRIC_TRASNFER_SIZE);
	}
	
	public void setTransferProgress(int transferProgress){
		addMetric(METRIC_TRANSFER_PROGRESS, transferProgress);
	}
	
	public int getTransferProgress(){
		return (Integer) getMetric(METRIC_TRANSFER_PROGRESS);
	}
	
	public void setTransferStatus(String transferStatus){
		addMetric(METRIC_TRANSFER_STATUS, transferStatus);
	}
	
	public int getTransferStatus(){
		return (Integer) getMetric(METRIC_TRANSFER_STATUS);
	}	
	
	public static KuraNotifyPayload buildFromKuraPayload(KuraPayload payload) throws ParseException 
	{
		if (payload.getMetric(METRIC_CLIENT_ID) == null) {
			throw new ParseException("Not a valid notify payload", 0);
		}		
		KuraNotifyPayload notifyPayload = new KuraNotifyPayload(payload);
		return notifyPayload;
	}
	
	public void setJobId(long jobId) {
		addMetric(METRIC_JOB_ID, jobId);
	}
	
	public Long getJobId() {
		return (Long) getMetric(METRIC_JOB_ID);
	}
	
	public void setErrorMessage(String errorMessage) {
		addMetric(METRIC_ERROR_MESSAGE, errorMessage);
	}
	
	public String getErrorMessage() {
		return (String) getMetric(METRIC_ERROR_MESSAGE);
	}
	
}