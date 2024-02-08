package webautomationv1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGExamples {
@Test (priority = 1)
	public void testExample() {
		System.out.println("Test Example");
	}
@Test (priority = 0)
public void testExample2() {
	System.out.println("Test Example 2");
}

@Test (priority = 2)
public void testExample3() {
	System.out.println("Test Example 3");
}



@BeforeSuite
public void beforeSuiteEx() {
	System.out.println("before Suite Example");
}

@AfterSuite
public void afterSuiteEx() {
	System.out.println("After Suite Example");
}

@BeforeTest
public void beforeTestEx() {
	System.out.println("Before Test Example");
}

@AfterTest
public void afterTestEx() {
	System.out.println("After Test Example");
}

@BeforeClass
public void beforeClassEx() {
	System.out.println("Before Class Example");
}

@AfterClass
public void afterClassEx() {
	System.out.println("After Class Example");
}

@BeforeMethod
public void beforeMethodEx() {
	System.out.println("before Method example");
}

@AfterMethod
public void afterMethodEx() {
	System.out.println("After Method example");
}



}
