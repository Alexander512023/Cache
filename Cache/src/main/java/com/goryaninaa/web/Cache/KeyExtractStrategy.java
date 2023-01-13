package com.goryaninaa.web.Cache;

public interface KeyExtractStrategy {

	Object extractKey(Object entity);
	
	String getStrategy();
	
}
