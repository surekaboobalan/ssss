package com.parmeterized;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class ParametrizedTest {
	
  @Test
  @Parameters({"user","pass"})
  public void f(String user,String pass) {
	  System.out.println("user="+user);
	  System.out.println("pass="+pass);
	  
  }
  }
