package UitapTests;

import UitapTests.Base.BaseTest;
import com.uitap.pages.DelayPage;
import com.uitap.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DelayTest extends BaseTest {
    DelayPage delayPage;
    @BeforeMethod
    public void setUpTest() {
        delayPage= homePage.clickDelaySection();
    }
    @Test
    public void testDelayButton() {
        Assert.assertTrue(delayPage.isDelayButtonDisplayed());
    }

}
