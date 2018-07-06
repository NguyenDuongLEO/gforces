package core.pageobject.computerdatabase;

import core.manage.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerDatabase {

    WebDriver driver = DriverFactory.getDriver();

    //===Title Web Element===
    @FindBy(xpath = "//title[contains(text(),'Computers database')]")
    public WebElement title;

    //===Top Bar Web Element===
    @FindBy(xpath = "//h1/a[contains(text(),'Play sample application — Computer database')]")
    public WebElement topBar;

    //===Main Web Element===
    @FindBy(xpath = "//input[@id='searchbox']")
    public WebElement filterTextBox;
    @FindBy(xpath = "//input[@id='searchsubmit']")
    public WebElement filterButton ;
    @FindBy(xpath = "//a[@id='add']")
    public WebElement addNewComputerButton;
    @FindBy(xpath = "//th/a[contains(text(),'Computer name')]")
    public WebElement computerNameColumn;
    @FindBy(xpath = "//th/a[contains(text(),'Introduced')]")
    public WebElement introducedColumn;
    @FindBy(xpath = "//th/a[contains(text(),'Discontinued')]")
    public WebElement discontinuedColumn;
    @FindBy(xpath = "//th/a[contains(text(),'Company')]")
    public WebElement companyColumn;

    //===Selected Row Element===
    @FindBy(xpath = "//a[@href='/computers/501']")
    public WebElement selectAComputerName;
    @FindBy(xpath = "//a[@href='/computers/501']/../../td[2]")
    public WebElement selectIntroduced;
    @FindBy(xpath = "//a[@href='/computers/501']/../../td[3]")
    public WebElement selectDiscontinued;
    @FindBy(xpath = "//a[@href='/computers/501']/../../td[4]")
    public WebElement selectCompany;

    //===Pagination Web Element===
    @FindBy(xpath = "//div[@id='pagination']//a[contains(text(),'← Previous')]")
    public WebElement previousArrow;
    @FindBy(xpath = "//div[@id='pagination']//a[contains(text(),'← Previous')]/..")
    public WebElement previousArrowIsDisabled;
    @FindBy(xpath = "//div[@id='pagination']//a[contains(text(),'Next →')]")
    public WebElement nextArrow;
    @FindBy(xpath = "//div[@id='pagination']//a[contains(text(),'Next →')]/..")
    public WebElement nextArrowIsDisabled;
    @FindBy(xpath = "//div[@id='pagination']//li[@class='current']/a")
    public WebElement currentDisplay;

    //===Edit/Add computer Web Element===
    @FindBy(xpath = "//label[@for='name']")
    public WebElement computerNameLabel;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement computerNameTextbox;
    @FindBy(xpath = "//input[@id='name']/../span")
    public WebElement computerNameHelp;
    @FindBy(xpath = "//label[@for='introduced']")
    public WebElement introducedDateLabel;
    @FindBy(xpath = "//input[@id='introduced']")
    public WebElement introducedDateTextbox;
    @FindBy(xpath = "//input[@id='introduced']/../span")
    public WebElement introducedDateHelp;
    @FindBy(xpath = "//label[@for='discontinued']")
    public WebElement discontinuedDateLabel;
    @FindBy(xpath = "//input[@id='discontinued']")
    public WebElement discontinuedDateTextbox;
    @FindBy(xpath = "//input[@id='discontinued']/../span")
    public WebElement discontinuedDateHelp;
    @FindBy(xpath = "///label[@for='company']")
    public WebElement companyLabel;
    @FindBy(xpath = "//select[@id='company']")
    public WebElement companyDropDownList;
    @FindBy(xpath = "//input[@type='submit' and @value='Save this computer']")
    public WebElement saveButton;
    @FindBy(xpath = "//a[@href='/computers']")
    public WebElement cancelButton;
    @FindBy(xpath = "//input[@type='submit' and @value='Delete this computer']")
    public WebElement deleteButton;
    @FindBy(xpath = "//input[@type='submit' and @value='Create this computer']")
    public WebElement createButton;

    public ComputerDatabase(WebDriver driver){
        this.driver = driver;
    }
}
