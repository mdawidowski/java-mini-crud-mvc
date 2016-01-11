package mvc;
import javax.swing.SwingUtilities;
import GUI.Interfejs;
public class Start

{

	public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {    
            	GUI.Interfejs interfejs = new GUI.Interfejs();
            	model.Funkcje funkcje = new model.Funkcje(); 

               controler.Kontroler kontroler = new controler.Kontroler(interfejs,funkcje);
               Interfejs okno = new GUI.Interfejs();


               kontroler.wyswietl();
               kontroler.szukaj();
               kontroler.dodaj();
               kontroler.usun();
               kontroler.edytuj();
               okno.setVisible(true);              
            }

			
        });  
    }
}