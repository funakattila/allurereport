import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormPage {

    WebDriver driver;

    private final String url = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By messageBox = By.xpath("//input[@id=\"user-message\"]");
    private final By showMessageButton = By.xpath("//*[@id=\"get-input\"]//button");
    private final By message = By.xpath("//*[@id=\"display\"]");

    private final By closePopUp = By.id("at-cv-lightbox-close");

    public SimpleFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(url);
        driver.findElement(closePopUp).click();
    }

    public String getMessage(String msg) {
        driver.findElement(messageBox).sendKeys(msg);
        driver.findElement(showMessageButton).click();
        String returnMessage = driver.findElement(message).getText();
        return returnMessage;
    }
}
