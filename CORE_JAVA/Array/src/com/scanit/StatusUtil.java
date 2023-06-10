package com.scanit;

import java.util.ArrayList;
import java.util.HashMap;

public class StatusUtil {
		
	public static final HashMap<String, Integer> statusIndexMap=new HashMap<String, Integer>();
	public static final HashMap<String, String> statusItemMap=new HashMap<String, String>();
//	public static final HashMap<String, String> manualStatusMap=new HashMap<String, String>();
//	public static final HashMap<String, String> autoManualStatusMap=new HashMap<String, String>();
	
	
	public static final ArrayList<String> eventList=new ArrayList<String>();
	
	public static String STATUS_PRE_BOOKING="PREBKG";
	public static String STATUS_PRELIMINSRY_BOOKING="PRELBKG";
	public static String STATUS_PICKUP_SCHEDULED="PUSCD";
	public static String STATUS_BOOKING_COMPLETE="BKGCOMP";
	public static String STATUS_CORGO_RECEIVED="CRGRCVD";
	public static String STATUS_SHIPMENT_READY_FOR_EXPORT="SHPEXP";
	
	
	static {
		initstatus();
		initItem();
	}
	
	public StatusUtil() {
		
	}
	
	public static void initstatus() {
		statusIndexMap.put("", -1);
		statusIndexMap.put("PREBKG", 0);
		statusIndexMap.put("PRELBKG", 1);
		statusIndexMap.put("PUSCD", 2);
		statusIndexMap.put("CRGRCVD", 3);

	}
	
	public static void initItem() {
		statusItemMap.put(STATUS_PRE_BOOKING, STATUS_BOOKING_COMPLETE);
	}
	
	public static HashMap<String, Integer> getStatusIndexMap() {
		return statusIndexMap;
		
	}
	
	public static HashMap<String, String> getStatusItemMap(){
		return statusItemMap;
	}
	

}
