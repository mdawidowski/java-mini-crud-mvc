package controler;

import model.Funkcje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Kontroler {
private GUI.Interfejs interfejs;
private ActionListener akcja;
public Kontroler(GUI.Interfejs interfejs, model.Funkcje funkcje){
    this.interfejs = interfejs;

}
public void wyswietl(){        
	akcja = new ActionListener() {
	public void actionPerformed(ActionEvent event)
	{
		Funkcje.Wyswietl();
	}
	};            
    interfejs.getguzikwyswietlenie().addActionListener(akcja);   
}

public void szukaj(){
	akcja = new ActionListener(){
	public void actionPerformed(ActionEvent event)
	{
		try{
			Funkcje.Szukaj();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	};
	interfejs.getguzikszukaj().addActionListener(akcja);
}
public void dodaj(){        
	akcja = new ActionListener() {
	public void actionPerformed(ActionEvent event)
	{
		try {
			Funkcje.Dodaj();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	};            
    interfejs.getguzikdodanie().addActionListener(akcja);   
}
public void usun(){        
	akcja = new ActionListener() {
	public void actionPerformed(ActionEvent event)
	{
		try {
			Funkcje.Usun();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	};            
    interfejs.getguzikusuniecie().addActionListener(akcja);   
}
public void edytuj(){        
	akcja = new ActionListener() {
	public void actionPerformed(ActionEvent event)
	{
		try {
			Funkcje.Edytuj();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	};            
    interfejs.getguzikedytowanie().addActionListener(akcja);   
}
}
