/**
*
*	PivskaSteklenicaTableModel.java
*	
*	Opis: Razred za prikaz delovanja tabel gui.
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
*
* Javni razred za strukturo tabele steklenic na mizi
*/
public class PivskaSteklenicaTableModel extends DefaultTableModel {
		
		
	
	/**
	 *	Javni konstruktor za ustvarjanje GUI s prikazom steklenic
	 */
		public PivskaSteklenicaTableModel () {
			//pokličemo konstruktor razreda
			super();
			
			// dodamo stolpce
			addColumn("znamka");
			addColumn("stopnja alkohola");
			
			//ustvarino prvi testni seznam objektov za dodajanje v tabelo
			Object[] vrstica = new Object[] {"testna znamka", "5.0"};
			
			//dodamo prvi testni vnos v tabelo
			addRow(vrstica);
			
						
}
		
		/**
		 *	Javni metoda, ki doda pivsko steklenico v tabelo
		 */

		public void addPivskaSteklenica(pivskasteklenica ps){
			
			//ustvarino seznam objektov za dodajanje v tabelo
			Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola()};
			
			//dodamo vrstico v tabelo
			addRow(vrstica);
			
		}


}