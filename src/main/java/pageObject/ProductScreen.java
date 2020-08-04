package pageObject;

import generales.Utilities;

public class ProductScreen {

    String btnAddtoCart = "//span[@id='submit.add-to-cart']";

    public void clickAddToCart(){
        Utilities.recognizeElement(btnAddtoCart,10);
    }
}
