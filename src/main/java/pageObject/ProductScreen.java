package pageObject;

import generales.Utilities;

public class ProductScreen {

    String btnAddtoCart = "//span[@id='submit.add-to-cart']";

    public boolean btntnAddtoCartEnabled(){
        return Utilities.checkElementisEnabled(btnAddtoCart);
    }
}
