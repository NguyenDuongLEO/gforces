package testScripts.data_TestScritps;

import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TC016SelectCancelInEditComputerPage extends BaseTest {
    @Test
    public void selectCancelInEditComputerPageAndNavigateToMainPage() {

        computerDatabase.selectAComputerName.click();
        computerDatabase.cancelButton.click();
        checkingMainPageDisplayCorrectly();
    }
}
