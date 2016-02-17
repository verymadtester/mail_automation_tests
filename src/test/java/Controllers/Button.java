package Controllers;

import org.openqa.selenium.WebElement;

/**
 * Created by Sergei_Shatilov on 11/17/2015.
 */
public class Button extends BaseElement {

    public Button(WebElement webElement) {
        super(webElement);
    }

    @Override
    public void setValue(String value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getValue() {
        return webElement.getAttribute("value");
    }

    @Override
    public String getText(String value) {
        return value;
    }
}
