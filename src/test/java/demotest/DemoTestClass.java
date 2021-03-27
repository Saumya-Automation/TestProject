package demotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestClass {
	
	@Test
	public void add()
	{
		System.out.println("SUM");
		int a = 3;
		int b = 5;
		Assert.assertEquals(8, a+b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("SUB");
		int a = 3;
		int b = 5;
		Assert.assertEquals(2, b-a);
	}
	
	@Test
	public void mul()
	{
		System.out.println("MUL");
		int a = 3;
		int b = 5;
		Assert.assertEquals(15, a*b);
	}

	@Test
	public void div()
	{
		System.out.println("DIV");
		int a = 10;
		int b = 5;
		Assert.assertEquals(15, a/b);
	}

}
