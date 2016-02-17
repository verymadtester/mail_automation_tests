package Pages;

import Utils.WebDiverConfig;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Sergei_Shatilov on 11/25/2015.
 */
@Component
public class Frame {

    WebElement frame;

    public Frame(WebElement frame){
        this.frame = frame;
    }

    public void toFrame(){
        WebDiverConfig.setFirefoxPofile().switchTo().frame(frame);
        WebDiverConfig.setFirefoxPofile().switchTo().activeElement();
    }

    public void toDefault(){
        WebDiverConfig.setFirefoxPofile().switchTo().defaultContent();
    }
}
