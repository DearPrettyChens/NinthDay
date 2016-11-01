package edu.nju.hello;



import org.junit.Assert;
import org.junit.Test;



public class HelloTest {

	
	@Test
	public void testSayHello() {
		Hello hello=new Hello();
		Assert.assertEquals("hello", hello.sayHello());
//		fail("Not yet implemented");
	}

}
