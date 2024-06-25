package com.mohyla;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://quizlet.com/ua");
    }

        @AfterEach
        void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

    @Test
    void checkMainHeader() {
        WebElement header = driver.findElement(By.cssSelector("h1"));
        assertThat(header.getText()).isEqualTo("Легко освоюйте складні предмети за допомогою карток і пробних тестів");
    }

    @Test
    void checkSignUpButton() {
        WebElement signUpButton = driver.findElement(By.cssSelector("a[data-testid='signup-button']"));
        assertThat(signUpButton.getText()).contains("Зареєструватися");
    }

    @Test
    void checkFooterText() {
        WebElement footer = driver.findElement(By.cssSelector("footer"));
        assertThat(footer.getText()).contains("© 2024 Quizlet, Inc.");
    }

}
