package ngpackage;

import org.testng.annotations.Test;

public class NewTestNg {
	@Test(groups = {"testCase"},priority = 1,enabled = false)
	public void testCase1() {
	System.out.println("This is the Test Case 1");
	}
	@Test(groups = {"testCase"},priority = 2)
	public void testCase2() {
	System.out.println("This is the Test Case 2");
	}
	@Test(groups = {"data"},priority = 3)
	public void data() {
	System.out.println("This is the data");
	}
	@Test(groups = {"data"},priority = 4)
	public void dataa1() {
	System.out.println("This is the data");
	}
	@Test(groups = {"testCase"},priority = 5)
	public void testCase5() {
	System.out.println("This is the Test Case 5");
	}
	@Test(groups = {"testCase"},priority = 6)
	public void testCase6() {
	System.out.println("This is the Test Case 6");
	}
}
