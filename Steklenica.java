/**
*
*	steklenica.java
*	
*	Opis: delo s steklenicami
*
* 	@author Luka Leben
*	@version Primer 19 (array seznami)
*
*
*/

/**
 * Razred, ki predstavlja steklenico.
 */

public class Steklenica{
	
	//dekleriramo zaseben lastnosti steklenice
	private String znamka;
	private int prostornina;
	private int kapaciteta; //v mililitrih
	private boolean jeOdprta;
	private String vrstaVsebine;
	private int kolicinaVsebine; //v mililitrih
	
	 /**
     * Konstruktor za ustvarjanje nove steklenice.
     * 
     * @param k           Kapaciteta.
     * @param v           Vrsta vsebine.
     */
	
	public Steklenica (int k, String v){
	
		//inicializiramo lastnosti
		kapaciteta = k;
		jeOdprta = false;
		vrstaVsebine = v;
		kolicinaVsebine = k;
		
		//izpišemo podatke 
		System.out.println("UStvarjam objekt tipa Steklenica kapacitete " +k+ "in za vsebino " + v);
		
	}


	/**
     * Izprazni steklenico.
     * 
     * @param k Količina za izpraznjenje.
     * @return Besedilni opis izpraznjenja.
     * @throws Exception Vrže izjemo, če je steklenica zaprta.
     */
	public String izprazni(int k) throws Exception {
	
	//če je steklenica odprta
			if(jeOdprta){
				
				//zmanjšamo količino vsebine za iztočeno količino
				System.out.println(" količina pred praznjenjem: " + kolicinaVsebine);
				kolicinaVsebine = kolicinaVsebine - k;
				System.out.println(" količina po praznjenju: " + kolicinaVsebine);
					
				
				//vrnemo vrsto vsebine
				return vrstaVsebine;
							
			}
			//če je steklenica zaprta, vrne izjemo
			else{
				throw new Exception("ne morem izprazniti steklenice ker je zaprta");
				
				
			}
			
	}
	
	 /**
     * Odpre steklenico.
     * 
     * @return Vrne true, če je odpiranje uspešno; sicer false.
     */
	
	public boolean odpri() {
		
		//če je stekelenica že  odprta 
		if(jeOdprta) {
			
			//vrnemo false ker je bila že odprta
			return false;
		}
		//če je steklenica zaprta spremenimo lastnost
		else{
			jeOdprta = true;
			
			return true;
		}
		
		
	}
	
	
	/** Javna metoda ki vrne količino vsebine
	*	@return vrne količino vsebine steklenice
	*
	*/
	
	public int getKolicinavsebine() {
		//vrnemo količino vsebine
		return kolicinaVsebine;
		
	}
}