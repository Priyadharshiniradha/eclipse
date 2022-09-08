package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pageobjects.LoginPagebjects;

public class CeoStepDefinition {
  
LoginPagebjects lop=new LoginPagebjects(LoginPagebjects.driver);
@Given("^the user gets successfully logged in with$")
public void loggingIn(DataTable dt) {
	
	lop.launchbrowser();
	List<Map<Object, Object>> pair=dt.asMaps(String.class,String.class);
	Object un=pair.get(0).get("username");
	Object pswd=pair.get(0).get("password");
	lop.setUsername(un);
	lop.setPassword(pswd);
}
@When("^the user clicks the directory option$")
public void click_directory() {
	
}
@When("^the user selects the job title as \"(.*?)\" $")
public void selects_job_title(String title) {
	
}
@Then("^the user should see the CEO name as \"<CEO name>\"$")
public void ceoname_verify(String ceoName) {
	
}
}
