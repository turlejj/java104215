
public class Zadanie1 {
	public static void main(String[] args) {
		System.out.println("Liczby podzielne przez 3 wynikaj�ce z 5 zakres�w: ");
		
		Divisibility a = new Divisibility(0,100);		
		a.start();
		
		Divisibility b = new Divisibility(101,200);	
		b.start();
		
		Divisibility c = new Divisibility(201,300);	
		c.start();
		
		Divisibility d = new Divisibility(301,400);	
		d.start();
		
		Divisibility e = new Divisibility(401,500);	
		e.start();
	}

}
