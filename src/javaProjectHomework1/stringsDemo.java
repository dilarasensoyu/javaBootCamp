package javaProjectHomework1;

public class stringsDemo {

	public static void main(String[] args) {
	String mesaj = "bugun hava çok güzel";
	System.out.println(mesaj);
//		
//		System.out.println("eleman sayısı : "+mesaj.length());
//		System.out.println("5.eleman : "+mesaj.charAt(4));
//		System.out.println(mesaj.concat(" yaşasın!"));   //concat birleştirmek demek
//			
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 0, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("av"));  //arama
//		System.out.println(mesaj.lastIndexOf("a")); //sondan arama
		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(mesaj);
		System.out.println(mesaj.substring(2,5));
		
		
		for (String kelime : mesaj.split(" ")) {  //ayırma
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
