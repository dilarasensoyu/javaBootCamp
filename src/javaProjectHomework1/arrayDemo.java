package javaProjectHomework1;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ogrenci1 = "Dilara";
		String ogrenci2 = "Emir";
		String ogrenci3 = "Bihter";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("----------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="dilara";
		ogrenciler[1]="emir";
		ogrenciler[2]="bihter";
		
		
		for(int i=0;i<ogrenciler.length;i++ ) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
				

		
		
		
		
		
	}

}
