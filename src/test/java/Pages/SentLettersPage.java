package Pages;

import Controllers.Link;
import Controllers.Textbox;
import Utils.CustomFieldDecorator;
import Utils.PageObjectFactory;
import Utils.WebDiverConfig;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
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

import java.io.IOException;

/**
 * Created by Sergei_Shatilov on 11/12/2015.
 */
@Component
public class SentLettersPage extends BasePage{

    public SentLettersPage(WebDriver driver){
        PageFactory.initElements(new CustomFieldDecorator(this, driver), this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[contains(@href, '#/folder/SentBox/')]")
    public Link sentLetters;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'messagesWrap')]//a[contains(@title, 'autotest result')]")
    public WebElement sentLetter;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'messageSubjectValue')]")
    public Textbox letterSubject;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'messageBody isFormattedText')]")
    public Textbox letterBody;

    @FindBy(how = How.XPATH, using = "//a[contains(@href, '#/folder/Trash/')]")
    public WebElement trashLetters;

    public void openSentMails(){
        sentLetters.click();
        waitForJStoLoad();
    }

    public void openSentLetter(){
        sentLetter.click();
        waitForJStoLoad();
        letterSubject.isVisible();
    }

    public void moveElement(){

        new Actions(driver).dragAndDrop(sentLetter, trashLetters).build().perform();
    }

}
