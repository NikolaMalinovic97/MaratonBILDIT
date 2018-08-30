package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("maraton.txt"));
		ArrayList<String> listaImena = new ArrayList<>();
		ArrayList<String> listaVremena = new ArrayList<>();
		
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
			listaImena.add(imeUcesnika);
			listaVremena.add(vrijemeKojeJeOstvario);
		}
		
		//Petlja koja ispisuje
		int index = 0;
		int najbrzeVrijeme;
		while(! listaVremena.isEmpty()) {
			najbrzeVrijeme = Integer.MAX_VALUE;
			//Petlja koja trazi narednog najbrzeg ucesnika
			for (int i = 0; i < listaVremena.size(); i++) {
				if(Integer.parseInt(listaVremena.get(i)) < najbrzeVrijeme) {
					index = i;
					najbrzeVrijeme = Integer.parseInt(listaVremena.get(i));
				}
			}
			System.out.println(listaImena.get(index)+" "+listaVremena.get(index));
			listaImena.remove(index);
			listaVremena.remove(index);
		}
		
		br.close();
	}

}
