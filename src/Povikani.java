import java.util.Scanner;
public class Povikani {

	public static void main(String[] args) {
			Zadadeni b = new Zadadeni();
			Scanner tastatura =  new Scanner(System.in);
			int a;
			int b2;
			System.out.print("Vnesi vrednost za a= ");
			a = tastatura.nextInt();
			System.out.print("Vnesi vrednost za b= ");
			b2 = tastatura.nextInt();
			b.setA(a);
			b.setB(b2);
			b.setC(b.getA()+b.getB());
			// c - rezultat //
			System.out.println( "Vkupniot zbir na dvete vrednosti e: " + b.getC());
	}

}
