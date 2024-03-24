import java.io.*;
import java.util.*;

public class bai1 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		String cf;
		System.out.println("input file path to check its size: ");
		cf = input.nextLine();
		
		File cf_file = new File(cf);
		System.out.println(cf_file.length());
	}
}