package fikt.oop.inki895.zadaca2;
import java.util.HashMap;
import java.util.Map;

public class Recnik {
	Map<String, String> recnik = new HashMap<String, String>();

	public void vnesiMapa() {
		recnik.put("Strawberry", "Јагода");
		recnik.put("Apple", "Јаболко");
		recnik.put("Bluberry", "Боровница");
		recnik.put("Pear", "Круша");
		recnik.put("Raspberry","Малина");
	}
	public void translate (String s) {
		if (recnik.containsKey(s)) 
		{
			System.out.println(recnik.get(s));
		} 
		else
			System.out.println("Не постои таков збор во речникот");
	}
}
