package maratonBildIt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Zadatak7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("imena.txt"));
		ArrayList<String> imena = new ArrayList<>();
		
		String linija;
		while((linija = br.readLine()) != null) {
			imena.add(linija);
		}
		
		Collections.sort(imena);
		
		for (int i = 0; i < imena.size(); i++) {
			System.out.println(imena.get(i));
		}
		
		br.close();
	}

}
