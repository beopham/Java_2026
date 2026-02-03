package HashMap;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> danhsachtraicay = new HashMap<>();

		danhsachtraicay.put(1, "nam");
		danhsachtraicay.put(2, "lan");
		danhsachtraicay.put(3, "khoa");

		danhsachtraicay.forEach((key, value) -> {
			System.out.println("Key: " + key + " - Value: " + value);
		});

		System.out.println(danhsachtraicay.get(1));
		System.out.println(danhsachtraicay.keySet());

		for (Integer key : danhsachtraicay.keySet()) {
			String value = danhsachtraicay.get(key);
			System.out.println("Key: " + key + " - Value: " + value);
		}
		if (danhsachtraicay.containsKey(1)) {
			System.out.println("ok");
		} else {

			System.out.println("Ko");
		}
		 if(danhsachtraicay.containsValue("nam"))
	      {
	    	  System.out.println("ok");
	      }
	      else {
			
	    	  System.out.println("Ko");
		}
	}

}
