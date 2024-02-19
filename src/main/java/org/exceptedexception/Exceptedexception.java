package org.exceptedexception;

import org.testng.annotations.Test;

public class Exceptedexception {
  @Test(expectedExceptions =NullPointerException.class )
  public void f() {
	  String s=null;
	  int length = s.length();
	  System.out.println(length);
  }
}
