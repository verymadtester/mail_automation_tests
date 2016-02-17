package Steps;


import Pages.SentLettersPage;
import Pages.WriteLetterPage;
import Utils.PageObjectFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.ContextConfiguration;


/**
 * Created by Sergei_Shatilov on 12/23/2015.
 */
@ContextConfiguration(locations = "/cucumber.xml")
public class WriteLetterStepdefs {

    @Autowired @Lazy
    WriteLetterPage writeLetterPage;
    @Autowired @Lazy
    SentLettersPage sentLettersPage;

    @Before
    public void initPage(){
        writeLetterPage = PageObjectFactory.getPageObject(WriteLetterPage.class);
        sentLettersPage = PageObjectFactory.getPageObject(SentLettersPage.class);
    }

    /**
     *@When user enter to writeLetterPage, fill all fields with valid data, and press sendButton
     * @throws Throwable
     */
    @When("^user send letter to \"([^\"]*)\"$")
    public void userSendLetterTo(String arg0) throws Throwable {
        writeLetterPage.pressWriteLetter();
        writeLetterPage.writeLetter(arg0, "autotest result", "If you read this letter - everything is ok");
    }

    /**
     *@Then user enter sentLettersPage, open first letter and check subject and letterBody
     * @throws Throwable
     */
    @Then("^letter should have been sent$")
    public void letter_should_have_been_sent() throws Throwable {
        sentLettersPage.openSentMails();
        sentLettersPage.openSentLetter();
        Assert.assertEquals(sentLettersPage.letterSubject.getValue(),"autotest result");
        Assert.assertEquals(sentLettersPage.letterBody.getValue(), "If you read this letter - everything is ok");
    }

}

