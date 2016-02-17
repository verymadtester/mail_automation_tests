package Controllers;

import org.openqa.selenium.WebElement;

/**
 * Created by Sergei_Shatilov on 11/18/2015.
 */
public class RadioButton extends BaseElement {

    public RadioButton(WebElement webElement) {
        super(webElement);
    }

    public void setOption(boolean value) {
        if (value != isChecked()) {
            click();
        }
    }

    public boolean isChecked() {
        return webElement.isSelected();
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
