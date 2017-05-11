package com.andor.springtutorial.annotation;

import org.springframework.stereotype.Component;

@Component
public class SampleImplCopy implements Sample {
	@Override
	public void disp() {
		System.out.println("SampleImplCopy");
	}
	

}
