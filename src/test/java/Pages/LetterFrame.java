package Pages;

import Controllers.Button;
import Controllers.Textbox;
import Utils.CustomFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Sergei_Shatilov on 11/12/2015.
 */
@Component
public class LetterFrame extends BasePage{

    public LetterFrame(WebDriver driver){
        PageFactory.initElements(new CustomFieldDecorator(this, driver), this);
        this.driver = driver;
        setFrame(new Frame(letterFrame));
    }
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'uiTextarea composeTextarea')]//iframe")
    public WebElement letterFrame;

    @FindBy(how = How.XPATH, using = "//body[contains(@id, 'tinymce')]")
    public Textbox letterField;

   public void setLetterBody(String text){
       toFrame();
       letterField.setValue(text);
       toDefault();
   }
}
