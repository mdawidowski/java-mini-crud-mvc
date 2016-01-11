package GUI;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Interfejs extends JFrame

{	



public static  JTextField nazwastara = new JTextField();
public static  JTextField nazwa_towar = new JTextField();
public static  JTextField Kod_towaru = new JTextField();
public static  JTextField cena = new JTextField();
public static  JTextArea pole = new JTextArea();
public static JButton guzikwyswietlenie = new JButton("wyœwietl wszystkie");
public static JButton guzikszukaj = new JButton("Szukaj");
public static JButton guzikdodanie = new JButton("dodaj");
public static JButton guzikusuniecie = new JButton("usuñ");
public static JButton guzikedytowanie = new JButton("edytuj");

public JButton getguzikwyswietlenie(){
    return guzikwyswietlenie;
}
public JButton getguzikszukaj(){
	return guzikszukaj;
}
public JButton getguzikdodanie(){
    return guzikdodanie;
}
public JButton getguzikusuniecie(){
    return guzikusuniecie;
}
public JButton getguzikedytowanie(){
    return guzikedytowanie;
}
public Interfejs()
{


JPanel northPanel = new JPanel();
northPanel.setLayout(new GridLayout(6,2));
northPanel.add(new JLabel("Nazwa towaru:",SwingConstants.CENTER));
northPanel.add(nazwa_towar);
northPanel.add(new JLabel("Kod towaru:",SwingConstants.CENTER));
northPanel.add(Kod_towaru);
northPanel.add(new JLabel("Cena:",SwingConstants.CENTER));
northPanel.add(cena);
northPanel.add(new JLabel("Co chcesz usun¹c lub edytowac:",SwingConstants.CENTER));
northPanel.add(nazwastara);

JPanel centerPanel = new JPanel();
centerPanel.setLayout(new GridLayout(1,1));
centerPanel.add(pole);

JPanel southrPanel = new JPanel();


southrPanel.setLayout(new FlowLayout (1,25,10));
southrPanel.add(guzikwyswietlenie);
southrPanel.add(guzikszukaj);
southrPanel.add(guzikdodanie);
southrPanel.add(guzikusuniecie);
southrPanel.add(guzikedytowanie);

Font czcionka = new Font("Arial", Font.BOLD, 14);
pole.setFont(czcionka);

TitledBorder ramka = new TitledBorder("Dane");
northPanel.setBorder(ramka);
centerPanel.setBorder(new LineBorder(Color.white, 10));

try {
	UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (UnsupportedLookAndFeelException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

SwingUtilities.updateComponentTreeUI(centerPanel);
SwingUtilities.updateComponentTreeUI(southrPanel);
add(northPanel, BorderLayout.NORTH);
add(centerPanel, BorderLayout.CENTER);
add(southrPanel, BorderLayout.SOUTH);


Toolkit ekran = Toolkit.getDefaultToolkit();
Dimension rozmiar = ekran.getScreenSize();
int wysokosc = rozmiar.height;
int szerokosc = rozmiar.width;
setSize(szerokosc /4, wysokosc / 2);
setLocationByPlatform(true);
setTitle("Start");
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
