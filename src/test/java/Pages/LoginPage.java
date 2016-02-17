package Pages;

import Controllers.Button;
import Controllers.Link;
import Controllers.Textbox;
import Utils.Configuration;
import Utils.CustomFieldDecorator;
import Utils.PageObjectFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by Sergei_Shatilov on 11/5/2015.
 */
@Component
public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        PageFactory.initElements(new CustomFieldDecorator(this, driver), this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'form-input form-input_login')]")
    public Textbox loginField;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'form-input form-input_w-icon')]")
    public Textbox passField;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'form-button form-button_submit')]")
    public Button loginButton;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'b-rambler-topline__logo')]")
    public Link logo;

    protected Configuration getConfig() {
        return Configuration.getInstance();
    }

    public void loadPage() {
        driver.get(getConfig().getBase());
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://mail.rambler.ru/"));
        driver.manage().window().maximize();
    }

    public void clickLogin(){
        loginButton.click();
        waitForJStoLoad();
        logo.isVisible();
    }

}
