package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCH_FIELD_COOKIE_ACCEPT = "//html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span";
    public static final String SEARCH_FIELD = "//html/body/div[2]/div[2]/form/div[2]/div/div/div/div[2]/input";
    public static final String SEARCH_FIELD_SUBMIT = "//html/body/div[2]/div[2]/form/div[2]/div/div[3]/center/input";
    public static void main (String [] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://consent.google.com?hl=pl&origin=https://www.google.com&continue=https://www.google.com/&if=1&m=0&pc=s&wp=-1&gl=PL");
        WebElement searchFieldCookieAccept = driver.findElement(By.xpath(SEARCH_FIELD_COOKIE_ACCEPT));
        searchFieldCookieAccept.submit();
        driver.get("https://google.pl");
        WebElement searchField = driver.findElement((By.xpath(SEARCH_FIELD)));
        searchField.sendKeys("Kodilla");
        WebElement searchFieldSubmit = driver.findElement((By.xpath(SEARCH_FIELD_SUBMIT)));
        searchFieldSubmit.submit();


    }
}
