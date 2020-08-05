import generales.Launcher;
import generales.Utilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.Screens;

import java.io.IOException;

public class Main {

    private boolean purchasable;

    @BeforeMethod
    public void navigate(){
        Launcher.navigate();
    }

    @Test
    public void testCase(){

        try{
            Screens.main.typeAlexa();
            Screens.main.clickSubmit();
            Screens.main.clickSecondPage();
            Screens.main.clickThirdElement();

            purchasable = Screens.product.btntnAddtoCartEnabled();

            Assert.assertTrue(purchasable,"You can not purchase this prodcut");
            System.out.println("\nYou can purchase this product");

        }catch (Exception e){
            System.err.println("ERROR");

        }

    }

    @AfterMethod
    public void quitDirver() throws IOException {
        Utilities.quitDriver();
    }
}
