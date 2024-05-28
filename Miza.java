/**
*
*	Miza.java
*	
*	Opis: Javni razred za zagon grafičnega vmesnika.
*
* 	@author Luka Leben
*	@version Primer 20 (GUI)
*
*
*/

//uvozimo vse pakete za delo z V/I napravami
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;


/**
 * Javni razred za prikaz delovanja grafičnega vmesnika z mizo steklenic.
 */
public class Miza extends JFrame implements ActionListener {
		
		
	//dekleracija zasebnih lastnosti
	private JPanel povrsina;
	private JButton dodajButton;
	private JTextField znamkaVnos;
	private JTextField alkoholVnos;
	private JTable tabela;
	private PivskaSteklenicaTableModel modelTabele;
	
	/**
	 * Metoda main za zagon grafičnega vmesnika.
	 * 
	 * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa.
	 */
	
	public static void main(String[] args){
	
			
		// izpišemo pozdrav v konzolo
		System.out.println("Zaganja GUI ...");		
		
		//ustvarimo nov objekt tipa miza
		Miza m = new Miza();
		
	}	
	/**
	 * Javni konstruktor za ustvarjanje grafičnega vmesnika s prikazom steklenic.
	 */
		public Miza() {
			//pokličemo konstruktor razreda
			super("miza s steklenicami");
			
					
			//Nastavimo obnašanje križca x tako da konča aplikacijo
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			//nastavimo velikost okna
			setSize(800,600);
			
				
			//inicializiramo lastnosti
			povrsina = new JPanel();
			dodajButton = new JButton("dodaj steklenico");
			znamkaVnos = new JTextField(32);
			alkoholVnos = new JTextField(4);
			modelTabele = new PivskaSteklenicaTableModel();
			tabela = new JTable (modelTabele);
			
			//gumbu za dodajanje dodamo poslušalec
			dodajButton.addActionListener(this);
			
			//gumb dodamo na površino
			povrsina.add(dodajButton);
			
			//na povrsino dodamo tabelo
			povrsina.add(tabela);
			
			//na povrsino dodamo vnosna polja
			povrsina.add(new JLabel("znamka:"));
			povrsina.add(znamkaVnos);
			povrsina.add(new JLabel("stopnja alkohola:"));
			povrsina.add(alkoholVnos);
			
			//povrsino dodamo na okno
			add(povrsina);
			
			//napravimo okno vidno
			setVisible(true);
			
		}
		
		/**
		 * Metoda, ki izvaja aktivnosti glede na dogodke.
		 * 
		 * @param e Dogodek, ki je sprožil klicanje metode.
		 */
	
		public void actionPerformed(ActionEvent e) {
			// izpišemo indikator klika gumba
			System.out.println("dodajam steklenico ...");	
			System.out.println("znamka" + znamkaVnos.getText());
			System.out.println("stopnja alkohola" + alkoholVnos.getText());
			
			//ustvarimo spremenljivko za stopnjo alkohola
			double sa = Double.parseDouble(alkoholVnos.getText());
			
			
			//ustvarimo objekt PivskaSteklenica
			pivskasteklenica nova = new pivskasteklenica(znamkaVnos.getText(), 500);
			
			//pivsko steklenico dodamo v model tabele
			modelTabele.addPivskaSteklenica(nova);
		}
		
}