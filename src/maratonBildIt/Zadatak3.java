package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("maraton.txt"));
		Scanner input = new Scanner (System.in);
		System.out.print("Unesite ime ucesnika cije vrijeme zelite da vidite: ");
		String ime = input.nextLine();
		
		String linija;
		String imeUcesnika;
		String vrijemeKojeJeOstvario;
		boolean prelaz;
		
		//Petlja koja prolazi kroz sve linije tekstualnog fajla
		while((linija = br.readLine()) != null) {
			imeUcesnika = "";
			vrijemeKojeJeOstvario = "";
			prelaz = false;
			//Petlja koja odvaja ime ucesnika i vrijeme koje je ostvario
			for (int i = 0; i < linija.length(); i++) {
				if(linija.charAt(i) == ' ')
					prelaz = true;
				else
					if(prelaz)
						vrijemeKojeJeOstvario += linija.charAt(i);
					else
						imeUcesnika += linija.charAt(i);
			}
			if(ime.equalsIgnoreCase(imeUcesnika)) {
				System.out.println("\nVrijeme: "+vrijemeKojeJeOstvario);
				break;
			}
		}
		
		input.close();
		br.close();
	}

}
