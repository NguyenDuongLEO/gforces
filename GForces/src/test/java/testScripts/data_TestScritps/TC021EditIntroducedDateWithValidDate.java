package testScripts.data_TestScritps;

import org.testng.Assert;
import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TC021EditIntroducedDateWithValidDate extends BaseTest {
    @Test
    public void verifyIntroducedDateWithValidDateCorrectly() {
        getComputerNameText();
        getIntroducedText();
        getDiscontinuedText();
        getCompanyText();
        computerDatabase.selectAComputerName.click();
        computerDatabase.introducedDateTextbox.clear();
        computerDatabase.introducedDateTextbox.sendKeys("2018-01-01");
        computerDatabase.saveButton.click();
        checkingIntroducedDateAfterEditIsDisplayedCorrectly();
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
    public void checkingIntroducedDateAfterEditIsDisplayedCorrectly(){
        Assert.assertEquals(computerDatabase.selectAComputerName.getText(), getComputerNameText());
        Assert.assertEquals(computerDatabase.selectIntroduced.getText(), "2018-01-01");
        Assert.assertEquals(computerDatabase.selectDiscontinued.getText(), getDiscontinuedText());
        Assert.assertEquals(computerDatabase.selectCompany.getText(), getCompanyText());
    }
}
