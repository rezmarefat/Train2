package run;
import common_1.NewTest;
import org.testng.annotations.Test;

import com.pages.home;

import common_1.NewTest;

import com.pages.home;
public class HOME_SITE1 extends NewTest {
  @Test
  public void f() {
	 home obj=new home(Driver);
	 obj.email("rezmarefat@gmail.com");
	 obj.pass("12346");
	  obj.login();
 Driver.navigate().back();
	  
	  
  }
}
