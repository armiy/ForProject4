package CsearchAndverifyStepsProject3;

import Base3Project4.base4;
import DwebElementsProject4.webElementsProject4;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class searchAndVerifySteps extends base4 {

    public static webElementsProject4 elements;
    public static webElementsProject4 getElements(){
        elements = new webElementsProject4(driver);
        return elements;
    }
@Before
public void setUp() throws MalformedURLException {
        WebDriverSetup(false,"browserstack",
                "chrome","116",
                "windows","https://www.ebay.com");

}

    @When("users search for this {} in the search field")
    public void searchingBrand(String BrandName){
        getElements().searchBoysShoes(BrandName);
    }
    @And("users search for this Specific Product among list of products")
    public void searchingSpecifcProduct(){
        getElements().searchSpecific();

    }
    @Then("users land on this {} with a list of the selected product")
    public void verifyPage(String PageTitle){
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.endsWith(PageTitle));

    }
}
