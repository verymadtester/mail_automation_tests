package Pages;

import Controllers.Link;
import Utils.CustomFieldDecorator;
import Utils.PageObjectFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Sergei_Shatilov on 11/23/2015.
 */
@Component
public class LogoutPage extends BasePage{

    public LogoutPage(WebDriver driver){
        PageFactory.initElements(new CustomFieldDecorator(this, driver), this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'b-rambler-topline-user__authorized js-backurl')]")
    public Link username;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'b-rambler-topline-user-dropdown__underuser-item b-rambler-topline-user-dropdown__underuser-item_logout js-backurl')]")
    public Link logout;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'b-rambler-topline__logo')]")
    public Link logo;

    public void openUserProfile(){
        username.click();
    }

    public void clickLogout(){
        logout.click();
        waitForJStoLoad();
        logo.isVisible();
    }

}
