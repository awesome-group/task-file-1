package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileProject {

	public static void main(String[] args) throws IOException {
		
		File countries=new File("D:\\countries.txt");
		if(!countries.exists()) {
			System.out.println("file creating...");
			countries.createNewFile();
			System.out.println("file creating");
		}
		try (OutputStream out=new FileOutputStream(countries)){
			System.out.println("Information is being written...");
			out.write(" Azerbaijan".getBytes());
			out.write("\n Turkish".getBytes());
			out.write("\n Russia".getBytes());
			out.write("\n Jermany".getBytes());
			out.write("\n Iran".getBytes());
			out.write("\n Georgia".getBytes());
			out.write("\n Europa".getBytes());
			out.write("\n U.S.A".getBytes());
			out.write("\n France".getBytes());
			out.write("\n Italy".getBytes());
			System.out.println("Information was written");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		try {
			Scanner sc = new Scanner(countries);
			for(int i = 0;i < 10;i++) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
	}

}
