/**
*
*	pivskasteklenica.java
*	
*	Opis: delo s pivskimi steklenicami
*
* 	@author Luka Leben
*	@version Primer 19a (vmesniki)
*
*
*/

/**
*
* Javni razred ki razširja razred steklenica in implementira vmesnik AlkoholnaPijača
*/

public class pivskasteklenica extends Steklenica implements AlkoholnaPijaca	{
	
	// vse lastnosti od nadrazreda se prenesejo
	//dekleriramo dodatne zasebene lastnosti, ki so značilne le za pivske steklenice
	private String znamka;
	private double temperatura; //podobno kot float ima 2 bajta (dvojna natančost)
	private double stopnjaAlkohola;
	
	//statična lastnost ki je enaka vsem pivskim steklenicam (vsem objektom razreda)
	private static String material = "Steklo"; //vse pivske steklenice so steklene
	
	  /**
     * Javni konstruktor za ustvarjanje novega objekta tipa pivskasteklenica.
     * @param z znamka piva  
     * @param k kapaciteta v mililitrih
     */
	
	public pivskasteklenica(String z, int k){
	
		// pokličem drug konstruktpor tega istega razreda
		this(z,k,4.5);
	}
	
	 /**
     * Javni konstruktor za ustvarjanje novega objekta tipa pivskasteklenica z določeno stopnjo alkohola.
     * @param z znamka piva  
     * @param k kapaciteta v mililitrih
     * @param s stopnja alkohola
     */
	
	public pivskasteklenica(String z, int k, double s){
	
		super(k, "Pivo");			//pokličemo konstruktor nadrazreda kot vhodni param prejme kapaciteto in vrsto vsebine (k,z) (pred super ne sme biti nič, uporablja se le kot prva vrstica v konstruktorju)
	
		//inicializiramo še dodatne lastnosti podrazreda
		znamka = z;
		temperatura = 5.0;
				
		//inicializiramo stonjo alkohola
		stopnjaAlkohola = s;
		
		//izpišemo podatke 
		System.out.println("Pivska steklenica je znamke " +z);
		
	}
	
	 /**
     * Vrne stopnjo alkohola v pivski steklenici.
     * @return stopnja alkohola
     */
	public double getStopnjaAlkohola() {
		//vrnemo stopnjo alkohola
		return stopnjaAlkohola;
	}
	 /**
     * Vrne znamko pivske steklenice.
     * @return znamka pivske steklenice
     */
	
	public String getZnamka() {
		//vrnemo stopnjo alkohola
		return znamka;
	}
	

}