package com.grup;

import org.testng.annotations.Test;

public class Grrouping {
	public class Ggroup {
		  @Test(groups="emp")
		  public void f() {
			  System.out.println("emmp");
		  }
		  
		  @Test(groups="emp")
		  public void f1() {
			  System.out.println("emp");
		  }
		  
		  @Test(groups="cus")
		  public void f2() {
			  System.out.println("cus");
		  }
		  
		  @Test(groups="cus")
		  public void f3() {
			  System.out.println("cus");
		  }
		  @Test(groups="admn")
		  public void f4() {
			  System.out.println("admin");
		  }
	}
}
