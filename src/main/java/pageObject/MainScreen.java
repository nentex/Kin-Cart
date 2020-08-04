package pageObject;

import generales.Utilities;

public class MainScreen {

    String iptSearch = "//input[@id='twotabsearchtextbox']",
            btnSecondPage = "//li[@class='a-normal']//*[contains(text(),'2')]";

    public void typeAlexa(){
        Utilities.type(iptSearch, "Alexa");
    }

    public void clickSecondPage(){
        Utilities.click(btnSecondPage);
    }
}
