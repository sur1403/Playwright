package com.example.makemytrip;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://www.makemytrip.com/");
      page.getByLabel("FromDEL, Delhi Airport India").click();
      page.getByPlaceholder("From").dblclick();
      page.getByText("Bangkok", new Page.GetByTextOptions().setExact(true)).click();
      page.getByText("BLR, Bengaluru International").click();
      page.getByText("Bangkok, Thailand").click();
      page.getByText("Search").click();
      page.getByLabel("ToBKK, Bangkok Thailand").click();
      page.getByText("Mumbai, India").click();
      page.getByLabel("Wed Jul 10").getByText("10").click();
      page.getByText("Search").click();
    }
  }
}