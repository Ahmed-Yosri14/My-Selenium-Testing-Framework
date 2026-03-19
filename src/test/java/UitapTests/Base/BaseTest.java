package UitapTests.Base;

import com.uitap.pages.HomePage;
import com.utilities.Actions.ActionsUtility;
import com.utilities.Switch.SwitchToUtility;
import com.utilities.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected SwitchToUtility switchToUtility;
    protected ActionsUtility actionsUtility;
    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestingplayground.com/home");
        homePage = new HomePage(driver);
        switchToUtility = new SwitchToUtility(driver);
        actionsUtility= new ActionsUtility(driver);
        homePage = goToHomePage();
    }
    protected HomePage goToHomePage() {
        driver.get("http://uitestingplayground.com/home");
        return new HomePage(driver);
    }
    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}