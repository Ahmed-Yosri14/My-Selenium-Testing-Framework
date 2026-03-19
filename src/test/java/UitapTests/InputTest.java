package UitapTests;

import UitapTests.Base.BaseTest;
import com.uitap.pages.InputPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {
    InputPage inputPage;
    @BeforeMethod
    public void setUpTest() {
        inputPage = homePage.clickInputSection();
    }
    @Test
    public void testUpdateButton() {
        String test = "Test";
        inputPage.setInputField(test);
        inputPage.clickUpdateButton();
        Assert.assertEquals(inputPage.getButtonText(),test);
    }
}
