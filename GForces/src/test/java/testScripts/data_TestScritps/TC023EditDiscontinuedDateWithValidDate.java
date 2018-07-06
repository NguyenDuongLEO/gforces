package testScripts.data_TestScritps;

import org.testng.Assert;
import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TC023EditDiscontinuedDateWithValidDate extends BaseTest {
    @Test
    public void verifyDiscontinuedDateWithValidDateCorrectly() {
        getComputerNameText();
        getIntroducedText();
        getDiscontinuedText();
        getCompanyText();
        computerDatabase.selectAComputerName.click();
        computerDatabase.discontinuedDateTextbox.clear();
        computerDatabase.discontinuedDateTextbox.sendKeys("2018-01-01");
        computerDatabase.saveButton.click();
        checkingDiscontinuedDateAfterEditIsDisplayedCorrectly();
    }
    public String getComputerNameText(){
        String computerNameText = computerDatabase.selectAComputerName.getText();
        return computerNameText;
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
    public void checkingDiscontinuedDateAfterEditIsDisplayedCorrectly(){
        Assert.assertEquals(computerDatabase.selectAComputerName.getText(), getComputerNameText());
        Assert.assertEquals(computerDatabase.selectIntroduced.getText(), getIntroducedText());
        Assert.assertEquals(computerDatabase.selectDiscontinued.getText(), "2018-01-01");
        Assert.assertEquals(computerDatabase.selectCompany.getText(), getCompanyText());
    }
}
