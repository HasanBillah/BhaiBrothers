package Day35Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C {
	@BeforeClass
	public void bc() {
		System.out.println("bc");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("bm");
	}
	
	@Test
	public void test5() {
		System.out.println("test5");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("am");
	}
	
	@Test
	public void test6() {
		System.out.println("test6");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("ac");
	}
	
	@AfterTest
	public void at() {
		System.out.println("at");
	}

}
