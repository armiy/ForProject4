package CsearchAndverifyStepsProject3;

import Base3Project4.base4;
import DwebElementsProject4.webElementsProject4;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class searchMultipleItemsSteps extends base4 {

    public static webElementsProject4 elements;
    public static webElementsProject4 getElements(){
        elements = new webElementsProject4(driver);
        return elements;
    }

    @When("users search for this {} on a search field")
    public void searchForItem(String ItemName){
        getElements().searchBoysShoes(ItemName);

    }
    @Then("users land on a page with this {}")
    public void verifyItemSearch(String pageTitle){
        String actualPageTitle = driver.getTitle();
        Assert.assertTrue(actualPageTitle.endsWith(pageTitle));

    }
}
