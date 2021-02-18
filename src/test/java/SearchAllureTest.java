import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import steps.BaseSteps;

import static helpers.TestHelper.BING_PAGE;

public class SearchAllureTest {
    final BaseSteps steps = new BaseSteps();

    @Test
    public void checkAppiumInSearchResult() {
        steps.openSearchPage(BING_PAGE);
        steps.setTextSearch("allure qa", By.cssSelector("#sb_form_q"));
        steps.checkResult("allure.qatools.ru", By.cssSelector("#b_results"));
    }
}
