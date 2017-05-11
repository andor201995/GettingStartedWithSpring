package com.andor.springtutorial.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SampleConfig {
	@Autowired
	Sample sampleImplCopy;
	
	public void Tester(){
		sampleImplCopy.disp();
	}

}
