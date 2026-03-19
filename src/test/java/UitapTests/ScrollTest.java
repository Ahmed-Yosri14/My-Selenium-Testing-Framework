package UitapTests;

import UitapTests.Base.BaseTest;
import com.uitap.pages.ScrollPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollTest extends BaseTest {
    ScrollPage scrollPage;
    @BeforeMethod
    public void setUpTest() {
        scrollPage = homePage.clickScrollSection();
    }

    @Test
    public void testScrollToElement() throws InterruptedException {
        scrollPage.clickHidingButton();
        Assert.assertTrue(scrollPage.isHidingButtonVisible());
    }
}