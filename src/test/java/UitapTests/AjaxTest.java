package UitapTests;

import UitapTests.Base.BaseTest;
import com.uitap.pages.AJAXPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxTest extends BaseTest {
    AJAXPage ajaxPage;

    @BeforeMethod
    public void setUpTest() {
        // BaseTest.setUp() is already executed by TestNG.
        ajaxPage = homePage.clickAjaxSection();
    }

    @Test
    public void testAjax() {
        ajaxPage.clickButton();
        Assert.assertEquals("Data loaded with AJAX get request.", ajaxPage.getMessageText());
    }
}
