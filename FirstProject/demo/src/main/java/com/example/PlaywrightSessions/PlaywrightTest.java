package com.example.PlaywrightSessions;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class PlaywrightTest {
    public static void main(String[] args) {
      Playwright playwright = Playwright.create();

      LaunchOptions launchOptions = new LaunchOptions();
      launchOptions.setChannel("chrome");
      launchOptions.setHeadless(false);
      Browser browser = playwright.chromium().launch(launchOptions);
      Page page = browser.newPage();
      page.navigate("https://www.amazon.com");

      String title = page.title();
      System.out.println("Page title is: " + title);
      String url = page.url();
      System.out.println("url is: " + url);

      browser.close();
      playwright.close();   
        }
    }

