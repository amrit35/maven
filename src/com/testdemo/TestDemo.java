package com.testdemo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.BaseTest;
import com.pomdemo.POMfbLofin;

public class TestDemo extends BaseTest
{
	    @Test
		public void Signup1() throws InterruptedException, IOException
		{
	    	POMfbLofin signup=new POMfbLofin(driver);
			signup.signupMethod();
		}

	}


