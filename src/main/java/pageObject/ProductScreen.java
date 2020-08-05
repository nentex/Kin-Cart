package pageObject;

import generales.Utilities;

public class ProductScreen {

    String btnAddtoCart = "//span[@id='submit.add-to-cart']";

    public void recognizeAddToCart(){
        Utilities.recognizeElement(btnAddtoCart,10);
    }

    public void btntnAddtoCartEnabled(){
        Utilities.checkElementisEnabled(btnAddtoCart);
    }
}
