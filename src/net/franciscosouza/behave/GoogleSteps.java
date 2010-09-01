package net.franciscosouza.behave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.thoughtworks.selenium.SeleneseTestCase;

public class GoogleSteps extends SeleneseTestCase {

    @Given("that I am on the browser start page")
    public void openTheBrowser() throws Exception {
        this.setUp("http://www.google.com.br", "*chrome");
    }
    
    @When("I go to the website www.google.com.br")
    public void goToGoogleHomePage() {
        this.selenium.open("/");
    }
    
    @Then("the window title should be Google")
    public void testTitle() {
        assertEquals("Google", this.selenium.getTitle());
    }
    
}
