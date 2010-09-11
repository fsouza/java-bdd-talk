package net.franciscosouza.steps;

import static cuke4duke.annotation.I18n.EN.*;
import com.thoughtworks.selenium.SeleneseTestCase;

import cuke4duke.annotation.After;
import cuke4duke.annotation.Before;

public class GoogleHomePageSteps extends SeleneseTestCase {
    
    @Before()
    public void setUpSelenium() throws Exception {
        this.setUp("http://www.google.com.br", "*chrome");
    }
    
    @Given("that I am on the browser start page")
    public void openBrowser() {
        this.selenium.open("/");
    }
    
    @When("I go to the website www.google.com.br")
    public void goToGoogle() {
        this.selenium.open("http://www.google.com.br");
    }
    
    @Then("the title of page should be \"(.*)\"")
    public void checkTitle(String title) {
        assertEquals(title, this.selenium.getTitle());
    }
    
    @After
    public void closeSelenium() {
        this.selenium.close();
    }
    
}
