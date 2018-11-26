package com.bean.springAOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice
{
	//after returning method will invoked by the spring container always once the business logic has executed
	//spring bean object has return the value(business logic)
	//call to its target services from another spring bean to perform the next business logic
	public void afterReturning(Object returnValue, Method m,Object args[],Object target)throws Exception
	{
		System.out.println("Am from AfterAdvice to "+m.getName());
	}

}
