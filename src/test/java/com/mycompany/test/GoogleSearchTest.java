package com.mycompany.test;

import org.testng.annotations.Test;

import com.mycompany.myproject.sample.GoogleSearchPage;
import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.html.TextField;

public class GoogleSearchTest {
    @WebTest
    @Test
    public void performGoogleSearch() {
        Grid.driver().get("http://www.google.com");
        System.out.println(Grid.driver().getCapabilities().getCapability("log"));
        GoogleSearchPage g = new GoogleSearchPage();
        TextField googleSearchTextField = g.getSearchTextField();
        googleSearchTextField.type("WebDriver");
        g.getSearchButton().click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
