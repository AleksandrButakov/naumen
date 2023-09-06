package tests.naumen;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.BrowserConfig;
import config.RemoteDriverConfig;
import config.WebDriverConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sessionId;
import static helpers.AllureAttachments.*;
import static java.lang.System.*;

class BaseTest {

    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, getProperties());
        baseUrl = webDriverConfig.getWebDriverBaseUrl();

        BrowserConfig browserConfig = ConfigFactory.create(BrowserConfig.class, System.getProperties());
        browser = browserConfig.getBrowserType();
        browserVersion = browserConfig.getBrowserVersion();
        browserSize = browserConfig.getBrowserSize();

        RemoteDriverConfig remoteDriverConfig = ConfigFactory.create(RemoteDriverConfig.class, System.getProperties());
        remote = remoteDriverConfig.getRemoteDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", new HashMap<String, Object>() {{
            /* How to add test badge */
            put("name", "My tests https://smartdeal.pro");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            /* How to set timezone */
            put("env", new ArrayList<String>() {{
                add("TZ=UTC");
            }});

            put("console", true);

            /* How to enableVNC */
            put("enableVNC", true);

            /* How to enable video recording */
            put("enableVideo", true);

        }});
        browserCapabilities = capabilities;
    }

    @AfterEach
    public void afterEach() {
//        String sessionId = sessionId().toString(); //getSessionId();
//        attachScreenshot("Last screenshot");
//        attachPageSource();
//        browserConsoleLogs();
//        attachVideo(sessionId);
        closeWebDriver();
    }

}