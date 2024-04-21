package com.cydeo.tests.day_01.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P02_ClickLinkWithText {

    @Test
    void test() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch
                // if you want to see browser pass this line
                        (new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/");

        // page.waitForTimeout(3000);
       // page.setViewportSize(1080,1920);

        page.click("text=Autocomplete");

        page.waitForTimeout(3000);

        System.out.println(page.title());

       //  Assertions.assertTrue(page.title().contains("XXX"));

        page.close();
        browser.close();
        playwright.close();
    }

}
