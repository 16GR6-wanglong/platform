package com.uccfocus.callout.importdata.filters;

public interface FilterDto {
	    public String get(String key) throws Exception;
	    public void put(String key,String value) throws Exception;
}
