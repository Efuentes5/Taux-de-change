package gui;

/**
 * Created by Fuentes Enzo on 02/12/2015.
 */
public class MVCTauxDeChange {

        public static void main(String[] args) {

            TauxDeChangeView theView = new TauxDeChangeView();

            TauxDeChangeApp theModel = new TauxDeChangeApp();

            TauxDeChangeController theController = new TauxDeChangeController(theView,theModel);

            theView.setVisible(true);

        }
}
