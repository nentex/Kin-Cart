package pageObject;

import generales.Utilities;

public class MainScreen {

    String iptSearch = "//input[@id='twotabsearchtextbox']",
            btnSubmit = "//div[@class='nav-search-submit nav-sprite']",
            btnSecondPage = "//li[@class='a-normal']//*[contains(text(),'2')]";

    public void typeAlexa(){
        Utilities.type(iptSearch, "Alexa");
    }

    public void clickSubmit(){
        Utilities.click(btnSubmit);
    }

    public void clickSecondPage(){
        Utilities.click(btnSecondPage);
    }
}
