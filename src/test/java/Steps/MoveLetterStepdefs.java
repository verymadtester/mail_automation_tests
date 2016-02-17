package Steps;

import Controllers.IElement;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.SentLettersPage;
import Pages.TrashLettersPage;
import Utils.PageObjectFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import org.springframework.test.context.ContextConfiguration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Sergei_Shatilov on 12/24/2015.
 */
@ContextConfiguration(locations = "/cucumber.xml")
public class MoveLetterStepdefs {
    @Autowired @Lazy
    SentLettersPage sentLettersPage;
    @Autowired @Lazy
    TrashLettersPage trashLettersPage;
    @Autowired @Lazy
    LogoutPage logoutPage;
    @Autowired @Lazy
    LoginPage loginPage;

    @Before
    public void initPage(){
        loginPage = PageObjectFactory.getPageObject(LoginPage.class);
        logoutPage = PageObjectFactory.getPageObject(LogoutPage.class);
        sentLettersPage = PageObjectFactory.getPageObject(SentLettersPage.class);
        trashLettersPage = PageObjectFactory.getPageObject(TrashLettersPage.class);
    }

    /**
     * @When user open SentLettersPage and move first letter to TrashLettersPage
     */
    @When("^user move first sent letter to Trash$")
    public void userMoveFirstSentLetterToTrash() throws Throwable {
        sentLettersPage.openSentMails();
        sentLettersPage.moveElement();
    }

    /**
     * @Then user open TrashLettersPage, open first letter, check letter's subject and body
     */
    @Then("^user open Trash Page and check letter have been moved$")
    public void userOpenTrashPageAndCheckLetterHaveBeenMoved() throws Throwable {
        trashLettersPage.openTrash();
        sentLettersPage.openSentLetter();
        Assert.assertEquals(sentLettersPage.letterSubject.getValue(),"autotest result");
        Assert.assertEquals(sentLettersPage.letterBody.getValue(), "If you read this letter - everything is ok");
    }

    /**
     * @Then user logout from system
     */

    @Then("^user logout$")
    public void userLogout() throws Throwable {
        logoutPage.openUserProfile();
        logoutPage.clickLogout();
    }

    /**
     * @Given user login to mail-system with Example's parameters
     * @param arg0 user login
     * @param arg1 user password
     * @throws Throwable
     */

    @Given("^user login to url, with \"([^\"]*)\", and \"([^\"]*)\"$")
    public void userLoginToUrlWithAnd(String arg0, String arg1) throws Throwable {
        Map<IElement, String> map = new LinkedHashMap<>();
        map.put(loginPage.passField, arg1);
        map.put(loginPage.loginField, arg0);
        loginPage.loadPage();
        loginPage.fillForm(map);
        loginPage.clickLogin();
    }

}
