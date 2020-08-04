package pageObject;

import generales.Utilities;

public class MainScreen {

    String inputSearch = "//input[@id='twotabsearchtextbox']",
            btnSubmit = "//div[@class='nav-search-submit nav-sprite']",
            btnSecondPage = "//li[@class='a-normal']//*[contains(text(),'2')]",
            elmThird = "(//div[@class='sg-col-inner']//div[@data-index='2']//div[@class='sg-col-inner']//div)[9]";


    public void typeAlexa(){
        Utilities.type(inputSearch, "Alexa");
    }

    public void clickSubmit(){
        Utilities.click(btnSubmit);
    }

    public void clickSecondPage(){
        Utilities.click(btnSecondPage);
    }

    public void clickThirdElement(){
        Utilities.click(elmThird);
    }
}
