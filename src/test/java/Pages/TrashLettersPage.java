package Pages;

import Controllers.Link;
import Utils.CustomFieldDecorator;
import Utils.PageObjectFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Sergei_Shatilov on 11/12/2015.
 */
@Component
public class TrashLettersPage extends BasePage{

    public TrashLettersPage(WebDriver driver){
        PageFactory.initElements(new CustomFieldDecorator(this, driver), this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[contains(@href, '#/folder/Trash/')]")
    public Link trashLetters;

    @FindBy(how = How.XPATH, using = "//a[contains(@title, 'autotest result')]")
    public Link firstLetterSubject;

    public void openTrash(){
        trashLetters.click();
        waitForJStoLoad();
        firstLetterSubject.isVisible();
    }

}
