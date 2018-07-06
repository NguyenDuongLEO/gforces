package testScripts.data_TestScritps;

import org.testng.Assert;
import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TC003VerifyColumnHeaderAreDisplayedCorrectly extends BaseTest{
    @Test
    public void verifyColumnHeaderAreDisplayedCorrectly() {
        checkingColumnHeaderAreDisplayedCorrectly();
    }
    public void checkingColumnHeaderAreDisplayedCorrectly(){
        Assert.assertEquals(computerDatabase.computerNameColumn.getText(), computerDatabaseData.COLUMN1);
        Assert.assertEquals(computerDatabase.introducedColumn.getText(), computerDatabaseData.COLUMN2);
        Assert.assertEquals(computerDatabase.discontinuedColumn.getText(), computerDatabaseData.COLUMN3);
        Assert.assertEquals(computerDatabase.companyColumn.getText(), computerDatabaseData.COLUMN4);
    }
}
