package Pages;

import Controllers.IElement;
import Controllers.Link;
import Utils.WebDiverConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Sergei_Shatilov on 11/17/2015.
 */
public class BasePage implements InitializingBean {

    @PostConstruct

    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }
    /**
     *
     * @param inputData позволяет заполнять определенные элементы страницы значениями в соответствии с мапой
     */
    public void fillForm(Map<IElement, String> inputData){
        toFrame();
        for (IElement element: elements){

            String value = inputData.get(element);
            if (element != null){
                if (value != null) {
                    element.setValue(value);
                }
            } else {
                throw new IllegalArgumentException("Arguments can't be null");
            }

        }
        toDefault();

    }

    public void moveElements(Link webElement, Link webElement1){
        new Actions(WebDiverConfig.setFirefoxPofile()).clickAndHold((WebElement) webElement).moveToElement((WebElement) webElement1).release().build().perform();
    }

    protected void toFrame(){
        if (frame != null) {
           frame.toFrame();
        }
    }

    protected void toDefault(){
        if (frame != null) {
            frame.toDefault();
        }
    }

    public void pressEnterKey(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public boolean waitForJStoLoad() {

        WebDriverWait wait = new WebDriverWait(WebDiverConfig.setFirefoxPofile(), 30);
        JavascriptExecutor jse = (JavascriptExecutor) WebDiverConfig.setFirefoxPofile();
        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long)jse.executeScript("return jQuery.active") == 0);
                }
                catch (Exception e) {
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return jse.executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }

    public void setFrame(Frame frame){
        this.frame = frame;
    }

    public Frame getFrame(){
        return frame;
    }

    public List<IElement> getElements(){
        return elements;
    }

    public void setElements(){
        this.elements = elements;
    }

    private List<IElement> elements = new ArrayList<>();
    private Frame frame;

    @Override
    public void afterPropertiesSet() throws Exception {
        customInit();
    }
}
