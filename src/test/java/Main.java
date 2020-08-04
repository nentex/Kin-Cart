import generales.Launcher;
import pageObject.Screens;

public class Main {

    public static void main(String[] args) {

        Launcher.navigate();

        Screens.main.typeAlexa();
        Screens.main.clickSubmit();
        Screens.main.clickSecondPage();

    }
}
