package com.token.booking.api.queue;

import java.util.HashMap;
import java.util.Map;

public class QueueInfoController {
	//TODO: using filter , we can remove the api at the first place
	 // whole thing can just be in groovy 
	//// format : /api/{location}/{userid}/
	public Map<String,String> getQueueDetails(String payload){
		Map<String,String> newPayload = new HashMap<String,String>();
		String[] temp = payload.split("/"); 
		if(null!=temp && temp.length > 1 ){
			newPayload.put("location", temp[1]);
		}
		if(null!=temp&&temp.length > 2){
			newPayload.put("userId", temp[2]);
		}
		return newPayload;
	}
}
