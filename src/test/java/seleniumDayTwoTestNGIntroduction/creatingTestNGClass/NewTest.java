package seleniumDayTwoTestNGIntroduction.creatingTestNGClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

    @Test
    public void newMethod(){
        System.out.println("hi");
    }


  @Test
  public void f() {
	  System.out.println("in F");
  }
  
  @Test
  public void f1() {
	  System.out.println("in F1");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in after class");
  }

}
