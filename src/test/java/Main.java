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
        Launcher.navigate(); /*Open the browser (in this case i am only using chromedriver), and navigate to amazon*/
    }

    @Test
    public void testCase(){

        try{
            Screens.main.typeAlexa(); /*Type alexa*/
            Screens.main.clickSubmit(); /*Click on the search buttom*/
            Screens.main.clickSecondPage(); /*Look for the second page (specified in the xpath)*/
            Screens.main.clickThirdElement(); /*Click the third element (also specified in the xpath)*/

            /*Here, i check if the buttom 'Add to Cart' exists, if it exists, it check if is enabled, Otherwise return false*/
            purchasable = Screens.product.btntnAddtoCartEnabled();

            Assert.assertTrue(purchasable,"You can not purchase this prodcut");
            System.out.println("\nYou can purchase this product");

        }catch (Exception e){
            System.err.println("ERROR");

        }

    }

    @AfterMethod
    public void quitDirver() throws IOException {
        Utilities.quitDriver(); /*Quit the driver AND finish the process*/
    }
}
