package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Zadatak5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("maraton.txt"));
		PrintWriter pr = new PrintWriter("najboljiMaratonci.txt");
		
		String linija;
		String vrijemeKojeJeOstvario;
		boolean prelaz;
		
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
			if(Integer.parseInt(vrijemeKojeJeOstvario) < 300)
				pr.println(linija);
		}
		
		pr.close();
		br.close();
	}

}
