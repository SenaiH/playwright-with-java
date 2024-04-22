package com.cydeo.tests.day_01.pac_01_playwright_intro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class P02_BasicNavigation {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch
                // if you want to see browser pass this line
                        (new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/");

        page.waitForTimeout(3000);

        page.navigate("https://google.com");

        page.waitForTimeout(2000);

        page.goBack();

        page.waitForTimeout(2000);

        page.goForward();

        page.waitForTimeout(3000);

        page.reload();

        page.close();
        browser.close();
        playwright.close();

    }

}
