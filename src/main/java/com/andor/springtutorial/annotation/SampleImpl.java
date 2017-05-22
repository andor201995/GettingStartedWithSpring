package com.andor.springtutorial.annotation;

import org.springframework.stereotype.Component;

@Component
public class SampleImpl implements Sample{

	@Override
	public String disp() {
		return "SampleImpl";
	}
	
	

}
