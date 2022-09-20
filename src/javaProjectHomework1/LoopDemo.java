package javaProjectHomework1;

public class LoopDemo {

	public static void main(String[] args) {
		//for
		for(int i=1;i<10;i+=2) { //i++ i'iy birer birer arttır demek
			System.out.println(i);
			
		}
		System.out.println("For Döngüsü Bitti");
		
		int i=1;
		//while 
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//do-while 
		int j = 2;
		do {
			System.out.println(j);
			

		j+=2;
		}while(j<10);
		System.out.println("Do-While DÖngüsü Bitti");
		
	}

}
