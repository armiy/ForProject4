package DwebElementsProject4;

import Base3Project4.base4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webElementsProject4 extends base4 {

    WebDriver gdriver;

    public webElementsProject4(WebDriver ldriver){
        gdriver = ldriver;
        PageFactory.initElements(ldriver,this);
    }

    //Search a product Elements
    @FindBy(css = "#gh-ac") public WebElement searchField;
    @FindBy(css = "#gh-search-btn") public WebElement searchButtton;

    //WebElements for specific Items
    @FindBy(xpath = "//*[@id=\"item52ef30dd96\"]/div/div[2]/a") public WebElement searchSpecificShoes;


    //Action methods on webElements

    public void searchBoysShoes(String ItemName){
        searchField.sendKeys(ItemName);
        searchButtton.click();
    }
    public void searchSpecific(){
        searchSpecificShoes.click();
    }

}


