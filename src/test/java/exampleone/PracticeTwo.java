package exampleone;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTwo {
	
	@Test
	public void testcasefour() {
		
		System.out.println("this is testcase_four");
	
}
	@Test
	public void testcasefive() {
		
		System.out.println("this is testcase_five");
		Assert.assertTrue(false);
	
}
	@Test(dependsOnMethods = "testcasefive")
	public void testcasesix() {
		
		System.out.println("this is testcase_six");
	
}

}
