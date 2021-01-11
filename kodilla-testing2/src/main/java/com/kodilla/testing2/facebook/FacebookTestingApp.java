package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String COOKIE_ACCEPT = "//button[contains(@id, \"u_0_h\")]";
    public static final String CREATE_NEW_ACCOUNT = "//form[contains(@class, \"_featuredLogin__formContainer\")]/div[5]/a";
    public static final String FIRST_NAME_FIELD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input";
    public static final String LAST_NAME_FIELD = "//input[contains(@id, \"u_2_d\")]";
    public static final String PHONE_FIELD = "//input[contains(@id, \"u_2_g\")]";
    public static final String PASSWORD_FIELD = "//input[contains(@id, \"password_step_input\")]";
    public static final String BIRTH_DAY_FIELD = "//form[contains(@id, \"reg\")]/div/div[5]/div[2]/span/span/select";
    public static final String BIRTH_MONTH_FIELD = "//form[contains(@id, \"reg\")]/div/div[5]/div[2]/span/span/select[2]";
    public static final String BIRTH_YEAR_FIELD = "//form[contains(@id, \"reg\")]/div/div[5]/div[2]/span/span/select[3]";
    public static final String FEMALE_CHECKBOX = "//span[contains(@id, \"u_2_o\")]/span/input";
    public static void main (String [] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        WebElement cookieAccept = driver.findElement(By.xpath(COOKIE_ACCEPT));
        cookieAccept.click();
        WebElement createNewAccount = driver.findElement(By.xpath(CREATE_NEW_ACCOUNT));
        createNewAccount.click();

        Thread.sleep(1000);

        WebElement firstNameField = driver.findElement(By.xpath(FIRST_NAME_FIELD));
        firstNameField.sendKeys("Test FirstName");
        WebElement lastNameField = driver.findElement(By.xpath(LAST_NAME_FIELD));
        lastNameField.sendKeys("Test LastName");
        WebElement phoneNoField = driver.findElement(By.xpath(PHONE_FIELD));
        phoneNoField.sendKeys("123456789");
        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_FIELD));
        passwordField.sendKeys("TEST PASSWORD");
        WebElement selectDay = driver.findElement(By.xpath(BIRTH_DAY_FIELD));
        Select selectedDay = new Select(selectDay);
        selectedDay.selectByIndex(5);
        WebElement selectMonth = driver.findElement(By.xpath(BIRTH_MONTH_FIELD));
        Select selectedMonth = new Select(selectMonth);
        selectedMonth.selectByIndex(5);
        WebElement selectYear = driver.findElement(By.xpath(BIRTH_YEAR_FIELD));
        Select selectedYear = new Select(selectYear);
        selectedYear.selectByIndex(30);
        WebElement selectFemale = driver.findElement(By.xpath(FEMALE_CHECKBOX));
        selectFemale.click();
    }
}
