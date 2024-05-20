package com.myProj.company.helper;

import org.springframework.beans.BeanUtils;

public class CommonHelper {

	private CommonHelper() {
		throw new UnsupportedOperationException(getClass().getCanonicalName() + " is Helper Class");
	}
	
	public static void updateEntityProperties(Object pojo, Object entity) {
		
		if(entity != null && pojo != null) {
			BeanUtils.copyProperties(pojo, entity);
		}
		
	}
}
