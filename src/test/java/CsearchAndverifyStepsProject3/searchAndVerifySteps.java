package CsearchAndverifyStepsProject3;

import Base3Project3.base3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchAndVerifySteps extends base3 {


    @When("users search for this {} in the search field")
    public void searchingBrand(String BrandName){

    }
    @And("users search for this {} among list of products")
    public void searchingSpecifcProduct(String ItemName){

    }
    @Then("users land on this {} with a list of the selected product")
    public void verifyPage(String PageTitle){

    }
}
