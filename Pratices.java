package com.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pratices {
         int num;
	 @Test
	      public void  sampleMethod1(){
		  num=10;  
		 System.out.println("sampleMethod1");
	 }
	  @Test(priority=2,dependsOnMethods="sampleMethod1")
	  public void sampleMethod(){
		  System.out.println(num);
		  System.out.println("sampleMethod");
	  }
	  @Test(priority=3,enabled=false,invocationCount=0)
	  public void sampleMethod2(){  
		  System.out.println("sampleMethod2");
	  }
	  @Test (dataProvider="Hi",retryAnalyzer=Retry.class)
	  
	  public void sampleMethod3(String val ,String val1){
		  System.out.println("sampleMethod3  -----> " + val  + "-----> " + val1);
	  }
	  @DataProvider(name = "Hi")
	  public Object[][] dataprov(){
		  Object[][] obArr = {{"Hello","Hi"},{"Hi","Heel"},{"World","data"}};
	        return obArr;
		  
	  }
	  
}
 