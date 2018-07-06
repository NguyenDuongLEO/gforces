package testScripts.data_TestScritps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TC019EditComputerNameWithValidName extends BaseTest {
    @Test
    public void verifyEditComputerNameWithValidNameCorrectly() {
        getIntroducedText();
        getDiscontinuedText();
        getCompanyText();
        computerDatabase.selectAComputerName.click();
        computerDatabase.computerNameTextbox.clear();
        computerDatabase.computerNameTextbox.sendKeys("1111");
        computerDatabase.saveButton.click();
        checkingComputerNameAfterEditIsDisplayedCorrectly();
    }
    public String getIntroducedText(){
        String introducedText = computerDatabase.selectIntroduced.getText();
        return introducedText;
    }
    public String getDiscontinuedText(){
        String discontinuedText = computerDatabase.selectDiscontinued.getText();
        return discontinuedText;
    }
    public String getCompanyText(){
        String companyText = computerDatabase.selectCompany.getText();
        return companyText;
    }
    public void checkingComputerNameAfterEditIsDisplayedCorrectly(){
        Assert.assertEquals(computerDatabase.selectAComputerName.getText(), "1111");
        Assert.assertEquals(computerDatabase.selectIntroduced.getText(), getIntroducedText());
        Assert.assertEquals(computerDatabase.selectDiscontinued.getText(), getDiscontinuedText());
        Assert.assertEquals(computerDatabase.selectCompany.getText(), getCompanyText());
    }
}
