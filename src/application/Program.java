package application;

import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {

		Printer p = new Printer("2008");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		Scanner s = new Scanner("2010");
		s.processDoc("My Document");
		System.out.println("Scan processing: " + s.scan());
	}

}
