package Controllers;

import Pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Created by Sergei_Shatilov on 11/17/2015.
 */
public class Textbox extends BaseElement {

    public Textbox(WebElement webElement) {
        super(webElement);
    }

    @Override
    public void setValue(String value) {
        if (isEnable()) {
            try {
                clearText();
                click();
                webElement.sendKeys(value);
            } catch (NoSuchElementException e) {
                e.getLocalizedMessage();
            }
        } else {
            throw new NoSuchElementException("Element is disable");
        }
    }

    @Override
    public String getValue() {
       return webElement.getText();
    }

    @Override
    public String getText(String value) {
        return value;
    }

    public void clearText() {
        if (isEnable()) {
            webElement.sendKeys(Keys.CONTROL + "a");
            webElement.sendKeys(Keys.DELETE);
        }
    }

}
