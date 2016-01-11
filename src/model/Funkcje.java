package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import GUI.Interfejs;
import model.baza;

public class Funkcje{
	public static baza b = new baza();
	 public static void Dodaj() throws SQLException{
		 String nazwa_towar = Interfejs.nazwa_towar.getText();
		 String Kod_towaru = Interfejs.Kod_towaru.getText();
		 String cena = Interfejs.cena.getText();

		 PreparedStatement zadanie = b.conn.prepareStatement("insert into Towar values (?, ?, ?);");		 
		 zadanie.setString(1,  nazwa_towar);
		 zadanie.setString(2, Kod_towaru);
		 zadanie.setString(3, cena);
		 zadanie.execute();
			Interfejs.nazwa_towar.setText(null);
			Interfejs.Kod_towaru.setText(null);
			Interfejs.cena.setText(null);	
	 }
	 public static boolean Usun() throws SQLException{
		 try{
		 String nazwa_towar = Interfejs.nazwastara.getText();

		PreparedStatement zadanie = b.conn.prepareStatement("DELETE FROM Towar where nazwa_towar=?;");
		zadanie.setString(1, nazwa_towar);
		zadanie.execute();
	    Interfejs.nazwastara.setText(null);
	        } catch (SQLException e) {
	            System.err.println("Blad przy usuwaniu");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }

	 public static boolean Edytuj() throws SQLException{
		 try {
			 String nazwa_towar = Interfejs.nazwa_towar.getText();
			 String Kod_towaru = Interfejs.Kod_towaru.getText();
			 String cena = Interfejs.cena.getText();
			 String nazwastara = Interfejs.nazwastara.getText();
			 
	            PreparedStatement zadanie = b.conn.prepareStatement("UPDATE Towar SET nazwa_towar=(?),Kod_towaru=(?),cena=(?) WHERE nazwa_towar=(?);");
	            zadanie.setString(1, nazwa_towar);
	            zadanie.setString(2, Kod_towaru);
	            zadanie.setString(3, cena);
	            zadanie.setString(4, nazwastara);
	            zadanie.execute();
	            Interfejs.nazwa_towar.setText(null);
				Interfejs.Kod_towaru.setText(null);
				Interfejs.cena.setText(null);
				Interfejs.nazwastara.setText(null);
	        } catch (SQLException e) {
	            System.err.println("Blad przy edytowaniu");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	
	 public static void Wyswietl(){
		 List<String> towar = new ArrayList<String>();
	        try {
	        	Interfejs.pole.setText(null);	
	            ResultSet wynik = b.stat.executeQuery("SELECT * FROM Towar");
	             while(wynik.next()) {
	                String nazwa_towar = wynik.getString("nazwa_towar");
	                String Kod_towaru = wynik.getString("Kod_towaru");
	                String cena = wynik.getString("cena");
					towar.add(nazwa_towar);
					towar.add(Kod_towaru);
					towar.add(cena);
					Interfejs.pole.append(nazwa_towar+"--"+Kod_towaru+"--"+cena + "\n");
	            }  
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return;
	        }
	        return;
	        
		
		 }
	 public static void Szukaj() throws SQLException{
		 List<String> towar = new ArrayList<String>();
	        try {
	        	String nazwa_towar = Interfejs.nazwa_towar.getText();
	        	ResultSet wynik = b.stat.executeQuery("SELECT * FROM Towar Where nazwa_towar=(?);");
	             while(wynik.next()) {
	                String nazwa_towa = wynik.getString("nazwa_towar");
	                String Kod_towaru = wynik.getString("Kod_towaru");
	                String cena = wynik.getString("cena");
					towar.add(nazwa_towar);
					towar.add(Kod_towaru);
					towar.add(cena);
					
	            }
	        Interfejs.pole.setText(towar + "\n"); 
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return;
	        }
	        return;
	        
		
		 }
	 }
	