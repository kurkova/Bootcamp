package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class,\"_5k_5\")]//select[@name=\"birthday_day\"]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class,\"_5k_5\")]//select[@name=\"birthday_month\"]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class,\"_5k_5\")]//select[@name=\"birthday_year\"]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_SELECT_DAY)).isDisplayed()) ;

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(26);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(7);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(29);
    }
}
