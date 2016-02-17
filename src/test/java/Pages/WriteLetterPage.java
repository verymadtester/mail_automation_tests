package Pages;

import Controllers.*;
import Controllers.Button;
import Utils.CustomFieldDecorator;
import Utils.PageObjectFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Sergei_Shatilov on 11/12/2015.
 */
@Component
public class WriteLetterPage extends BasePage{

    public WriteLetterPage(WebDriver driver){
        PageFactory.initElements(new CustomFieldDecorator(this, driver), this);
        this.driver = driver;
        letterFrame = new LetterFrame(driver);
    }
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[contains(@title, 'Написать письмо')]")
    public Button writeButton;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'uiAutocompleteTextInput')]")
    public Textbox toField;

    @FindBy(how = How.XPATH, using = "//input[contains(@id, 'subject')]")
    public Textbox subjectField;

    @FindBy(how = How.XPATH, using = "//button[contains(@title, 'Отправить письмо')]")
    public Button pressSend;

    public LetterFrame letterFrame;

    public void pressWriteLetter(){
       writeButton.click();
        waitForJStoLoad();
    }

    public void writeLetter(String getter, String subject, String letterBody){

        toField.setValue(getter);
        pressEnterKey();
        subjectField.setValue(subject);
        letterFrame.setLetterBody(letterBody);
        pressSend.click();
        waitForJStoLoad();
        writeButton.isVisible();

    }
}
