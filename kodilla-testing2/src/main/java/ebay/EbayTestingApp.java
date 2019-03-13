package ebay;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {
    public static final String SEARCHFIELD = "gh-tb";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.co.uk");

        WebElement searchField = driver.findElement(By.className(SEARCHFIELD));
        searchField.sendKeys("laptop");
        searchField.submit();
    }
}
