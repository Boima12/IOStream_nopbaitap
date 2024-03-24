import java.io.*;
import java.util.*;

public class bai2 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		String cf;
		System.out.println("input file path to delete it: ");
		cf = input.nextLine();
		
		File cf_file = new File(cf);
		
		// check if the file is exist or not
		if (!cf_file.exists()) {
			System.out.println(cf + " isn't a valid file path!");
			return;
		}
		
		cf_file.delete();
		System.out.println(cf + " deleted!.");
	}
}