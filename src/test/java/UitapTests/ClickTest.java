package UitapTests;

import UitapTests.Base.BaseTest;
import com.uitap.pages.ClickPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickTest extends BaseTest {
    ClickPage clickPage;
    @BeforeMethod
    public void setUpTest() {
        clickPage= homePage.clickClickSection();
    }

    @Test
    public void testClickButtons() {
        clickPage.clickButton();
        Assert.assertTrue(clickPage.isButtonClicked());
    }
}
