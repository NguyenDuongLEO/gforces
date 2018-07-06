package testScripts.data_TestScritps;

import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TC001SelectTopBarHyperlinkToReload extends BaseTest {
    @Test
    public void verifyMainPageDisplayCorrectly() {
        computerDatabase.topBar.click();
        checkingMainPageDisplayCorrectly();
    }
}
