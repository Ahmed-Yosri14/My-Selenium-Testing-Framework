package UitapTests;

import UitapTests.Base.BaseTest;
import com.uitap.pages.ClassPage;
import com.uitap.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest extends BaseTest {
    ClassPage classPage ;
    @BeforeMethod
    public void setUpTest() {
        classPage = homePage.clickClassAttributeSection();
    }
    @Test
    public void testPrimaryButton() {
        classPage.clickPrimaryButton();
        Assert.assertEquals(switchToUtility.getAlertText(),"Primary button pressed");
    }
}
