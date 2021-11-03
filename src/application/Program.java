package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("2008");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2010");
		s.processDoc("My Document");
		System.out.println("Scan processing: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2032");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scanning result: " + c.scan());
	}

}
