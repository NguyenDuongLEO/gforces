package testScripts;

import core.pageobject.computerdatabase.ComputerDatabase;
import data.ComputerDatabaseData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest{
    protected static WebDriver driver;
    protected static ComputerDatabase computerDatabase;
    protected static ComputerDatabaseData computerDatabaseData;

    @BeforeMethod
    public void setUpMethod(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        computerDatabase = PageFactory.initElements(driver, ComputerDatabase.class);
        driver.get(computerDatabaseData.URL);
        driver.manage().window().maximize();
    }

    public void checkingMainPageDisplayCorrectly(){
        Assert.assertEquals(driver.getTitle(), computerDatabaseData.TITLE);
        Assert.assertEquals(computerDatabase.topBar.getText(), computerDatabaseData.TOPBAR);
        Assert.assertEquals(computerDatabase.filterButton.getAttribute("value"), computerDatabaseData.FILTERBYNAME);
        Assert.assertEquals(computerDatabase.addNewComputerButton.getText(), computerDatabaseData.ADDANEWCOMPUTER);
        Assert.assertEquals(computerDatabase.computerNameColumn.getText(), computerDatabaseData.COLUMN1);
        Assert.assertEquals(computerDatabase.introducedColumn.getText(), computerDatabaseData.COLUMN2);
        Assert.assertEquals(computerDatabase.discontinuedColumn.getText(), computerDatabaseData.COLUMN3);
        Assert.assertEquals(computerDatabase.companyColumn.getText(), computerDatabaseData.COLUMN4);
        Assert.assertEquals(computerDatabase.previousArrow.getText(), computerDatabaseData.PREVIOUSARROW);
        Assert.assertEquals(computerDatabase.nextArrow.getText(), computerDatabaseData.NEXTARROW);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
