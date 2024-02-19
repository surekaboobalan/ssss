package org.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderr {
  @Test(dataProvider = "parmvalue")
  public void login(String user,String pass) {
	  System.out.println(user);
	  System.out.println(pass);
	  
  }
  
  @Test
  @DataProvider
  public Object[][] parmvalue() {
	  return new Object[][] {{"sureka","123"},{"bala","456"},{"kirishi","789"}};
  }

}
