import generales.Launcher;
import pageObject.Screens;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Launcher.navigate();

        Screens.main.typeAlexa();
        Screens.main.clickSubmit();
        Screens.main.clickSecondPage();
        Thread.sleep(1000);
        Screens.main.clickThirdElement();

        try{
            Screens.product.clickAddToCart();
        }catch (Exception e){
            System.out.println("El producto no se puede comprar");
        }


    }
}
