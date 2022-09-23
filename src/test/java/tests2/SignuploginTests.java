package tests2;

import org.testng.annotations.Test;
import pages2.RegisterUser;

public class SignuploginTests extends BaseTests_Parent2 {

@Test
public void RegisteUser ()
{

    RegisterUser regist = new RegisterUser(driver);
    regist.NewUserSignupVisible("New User Signup!");
    regist.enternameemail("ohood","msohood@gmail.com");
    regist.AccountInformation("ENTER ACCOUNT INFORMATION");



}

}
