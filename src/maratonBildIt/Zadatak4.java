package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zadatak4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("maraton.txt"));
		
		String linija;
		String vrijemeKojeJeOstvario;
		boolean prelaz;
		double prosjecnoVrijeme = 0;
		
		//Petlja koja prolazi kroz sve linije tekstualnog fajla
		while((linija = br.readLine()) != null) {
			vrijemeKojeJeOstvario = "";
			prelaz = false;
			//Petlja koja odvaja ime ucesnika i vrijeme koje je ostvario
			for (int i = 0; i < linija.length(); i++) {
				if(linija.charAt(i) == ' ')
					prelaz = true;
				else
					if(prelaz)
						vrijemeKojeJeOstvario += linija.charAt(i);
			}
			prosjecnoVrijeme = (prosjecnoVrijeme + Double.parseDouble(vrijemeKojeJeOstvario)) / 2;
		}
		
		System.out.println("Prosjecno vrijeme: "+prosjecnoVrijeme);
		
		br.close();
	}

}
