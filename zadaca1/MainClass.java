package fikt.oop.inki895.zadaca1;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		Map<String, String> recnik=new HashMap<String, String>();
		recnik.put("Apple", "Јаболко");
		recnik.put("hi","Здраво");
		recnik.put("Strawberry","Јагода");
		recnik.put("Pear","Круша");
		recnik.put("Blueberry","Боровница");
		System.out.println("Keys:"+recnik.keySet());
		System.out.println("Values:"+recnik.values());
		for(Map.Entry<String,String> entry:recnik.entrySet()) {
			System.out.println(entry.getKey()+" | "+entry.getValue());
		}
		if(recnik.containsKey("hi"))
			System.out.println("Вредноста за зборот 'hi' на македонски е:"+recnik.get("hi"));
		else
			System.out.println("Не постои таков збор");
	}
}
