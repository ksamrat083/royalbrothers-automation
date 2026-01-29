package base;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    public static Page initBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        page = browser.newPage();
        return page;
    }
}
