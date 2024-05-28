/**
*
*	HelloWorld.java
*	
*	Opis: Program, ki v ukazno konzolo izpiše "pozdravljen svet"
*
* 	@author Luka Leben
*	@version Primer 19 (array seznami)
*
*
*/

//uvozimo vse pakete za delo z V/I napravami
import java.io.*;
import java.util.*;

/**
*
* Javni razred za prikaz delovanja jave
*/
public class HelloWorld {
		
		//deklariramo statične lastnost
		private static BufferedReader in;
		
		//deklariramo lastnosti abstraktnega seznama PivskaSteklenica
		private static ArrayList<pivskasteklenica> pivskeSteklenice;
	
		/**
		 * Javna statična metoda, ki se izvede ob zagonu programa
		 * 
		 * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa 
		 */
	public static void main(String[] args){
	
		//inicializiramo statično lastnost za vnos iz tipkovnice
		//konstruktro kot vhodni parameter prejme anonimni objekt razreda InputStreamReader
		in = new BufferedReader(new InputStreamReader(System.in));
	
		//inicializiramo seznam pivskih steklenic
		pivskeSteklenice = new ArrayList<pivskasteklenica>();
		
		// izpišemo pozdrav v konzolo
		System.out.println("pozdravljen svet");		
		
		//ustvarimo dva objekta tipa Steklenica
		Steklenica zganje = new Steklenica(50, "žganje");
		Steklenica voda = new Steklenica(500, "voda");
		
		//dekleriramo in inicializiramo spremenljivko za količino vode
		int kv = 0;
		
		//poskusimo prebrati niz s tipkovnice
		try {
			System.out.print("koliko vode naj natočim v steklenico"); 
			
			//niz vnešen preko tipkovnice preberemo v spremenljivko
			String kolicinaVode = in.readLine();
			
			//niz zapišemo v celo število
			kv = Integer.parseInt(kolicinaVode);
			System.out.println("v kozarec bom natočil" +kolicinaVode + "ml vode");
		}
		catch(Exception e) {
			System.out.println("prišlo je do napake pri vnostu" +e);
		}
	
		
		//iz steklenice za vodo poskusimo izprazniti, toliko kot smo vnesli v konzolo 
		//kličemo metodo izprazni objekt voda
		try {
		voda.odpri();
		String vsebinaKozarca = voda.izprazni(kv);
		System.out.println("Vsebina kozarca je " + vsebinaKozarca);
		}
		catch(Exception e) {
			System.out.println("prišlo je do napake pri vnostu" +e);	
		}
		//odpremo steklenico z žganjem
		zganje.odpri();
		
		//iz steklenice z žganjem poskusiom napraviti požirek
		try {
		String pozirek = zganje.izprazni(20);
		System.out.println("naredili smo en požirek" + pozirek);
		}
		catch(Exception e) {
			System.out.println("prišlo je do napake pri vnostu" +e);	
		}
		
		//ustvarimo tri vrste pivske steklenice
		pivskasteklenica velikoLasko = new pivskasteklenica("Laško", 500);
		pivskasteklenica maliUnion = new pivskasteklenica("Union", 330);
		pivskasteklenica heineken = new pivskasteklenica("Heineken",330);
		
		//steklenice dodamo v seznam
		pivskeSteklenice.add(velikoLasko);
		pivskeSteklenice.add(heineken);
		pivskeSteklenice.add(maliUnion);
		
		//dodamo novo brezalkoholno pivo
		pivskeSteklenice.add(new pivskasteklenica ("laško malt ", 500, 0.0));
		
		
		//odpremo vse steklenice v seznamu
		for(int c=0;c<pivskeSteklenice.size(); c++){
			
			if(pivskeSteklenice.get(c).odpri()){
				System.out.println("steklenica št." + c + "uspešno odprta");
			}
		}
		
		//kličemo metode, ki so bile deklarirane že v nadrazredu
		try {
		velikoLasko.odpri();
		System.out.println("Naredili smo požirek " + velikoLasko.izprazni(50));
		}
		catch(Exception e) {
			System.out.println("prišlo je do napake pri vnostu" +e);	
		}
	}
	
}