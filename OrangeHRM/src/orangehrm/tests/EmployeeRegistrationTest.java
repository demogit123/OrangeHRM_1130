package orangehrm.tests;

import Utils.AppUtils;
import orangeHrm_Library.Employee;
import orangeHrm_Library.LoginScrip_OrangeHrms;

public class EmployeeRegistrationTest {

	public static void main(String[] args)  {
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginScrip_OrangeHrms lgn=new LoginScrip_OrangeHrms();
		lgn.loginAsAdmin("Admin", "Qedge123!@#");
		
		
		
		Employee emp=new Employee();
		boolean res=emp.addEmployee("Rahim", "qedge");
		if(res)
		{
			System.out.println("employee test case passs ");
		}
		else
		{
			System.out.println("test case fail");
		}
		
		

	}

}
