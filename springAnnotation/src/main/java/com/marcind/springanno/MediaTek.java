package com.marcind.springanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor 
{

	public void process() 
	{
		// TODO Auto-generated method stub
		System.out.println("2nd best CPU");

	}

}
