package com.marcind.demospring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	public void drive()
	{
		System.out.println("Chal raha hai..");
	}
}
