package com.andor.springtutorial.ci;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andor.springtutorial.bean.Employee;
import com.andor.springtutorial.bean.Manager;

public class InjectConstructor {
public static void main(String[] args) {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextCI.xml");
	ctx.registerShutdownHook();
	Employee emp=(Employee) ctx.getBean("employee1");
	Manager manager=(Manager) ctx.getBean("manager1");
	System.out.println(manager);
	System.out.println(emp);
}
}
