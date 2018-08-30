package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zadatak1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("maraton.txt"));
		
		String linija;
		String imeUcesnika;
		String vrijemeKojeJeOstvario;
		boolean prelaz;
		int najboljeVrijeme = 0;
		String imeNajboljeg = null;
		
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
			if(Integer.parseInt(vrijemeKojeJeOstvario) > najboljeVrijeme) {
				najboljeVrijeme = Integer.parseInt(vrijemeKojeJeOstvario);
				imeNajboljeg = imeUcesnika;
			}
				
		}
		
		System.out.println("Najbrzi ucesnik: "+imeNajboljeg);
		System.out.println("Vrijeme: "+najboljeVrijeme);
		
		br.close();
	}

}
