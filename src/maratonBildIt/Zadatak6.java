package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zadatak6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("astronau.txt"));

		String linija;
		int brojac = 0;
		
		while((linija = br.readLine()) != null) {
			brojac++;
		}
		
		System.out.println("Broj linija u fajlu: "+brojac);
		br.close();
	}

}
