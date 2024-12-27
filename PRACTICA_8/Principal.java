package PRACTICA_8;

public class Principal {

	public static void main(String[] args) {
		
		//
		Cafetera cafetera1=new Cafetera();
		
		Cafetera cafetera2=new Cafetera(200);
		
		Cafetera cafetera3=new Cafetera(300,100);
		
		cafetera1.llenarCafetera();
		System.out.println(cafetera1.ServirTaza(500));
		System.out.println(cafetera1.agregarCafe(77));
		cafetera1.vaciarCafetera();
		
		System.out.println();
		System.out.println("--------------------------------------");
		cafetera2.llenarCafetera();
		System.out.println(cafetera2.ServirTaza(33));
		System.out.println(cafetera2.agregarCafe(10));
		cafetera2.vaciarCafetera();
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println(cafetera3.ServirTaza(22));
		System.out.println(cafetera3.agregarCafe(15));
		cafetera3.vaciarCafetera();
		System.out.println();
	}

}
