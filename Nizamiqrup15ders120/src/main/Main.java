package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	System.out.println("File in icersinda olan olkeler:");
		File file = new File("/Users/apple/Desktop/Nizamiqrup15ders120/bin/main/countries.txt");
		Scanner sc = new Scanner(file);
		OutputStream out = new FileOutputStream(file);
		out.write("Iran\n".getBytes());
		out.write("Azerbaycan\n".getBytes());
		out.write("Ozbekistan\n".getBytes());
		out.write("Qazaxistan\n".getBytes());
		out.write("Rusiya\n".getBytes());
		out.write("Canada\n".getBytes());
		out.write("Amerika\n".getBytes());
		out.write("Turkiye\n".getBytes());
		out.write("Cin\n".getBytes());
		out.write("Yapona\n".getBytes());
		while (sc.hasNext()) {
			String file2 = sc.nextLine();
			System.out.println(file2);
		}

	}

}
