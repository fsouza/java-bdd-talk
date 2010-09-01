package net.franciscosouza.selenium;

import com.thoughtworks.selenium.*;

public class TestGoogleHomePage extends SeleneseTestCase {
    
    public void setUp() throws Exception {
        setUp("http://www.google.com.br/", "*chrome");
    }
    
    public void testGoogleTitle() throws Exception {
        selenium.open("http://www.google.com.br");
        assertEquals("Google", selenium.getTitle());
    }
}
