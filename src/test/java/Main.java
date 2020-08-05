import generales.Launcher;
import generales.Utilities;
import pageObject.Screens;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        Launcher.navigate();

        Screens.main.typeAlexa();
        Screens.main.clickSubmit();
        Screens.main.clickSecondPage();
        Thread.sleep(1000);
        Screens.main.clickThirdElement();

        try{
            Screens.product.recognizeAddToCart();
            Screens.product.btntnAddtoCartEnabled();
            System.out.println("\nYou can purchase this product");

        }catch (Exception e){
            System.err.println("\nYou can not purchase this product");

        }

        Utilities.quitDriver();

    }
}
