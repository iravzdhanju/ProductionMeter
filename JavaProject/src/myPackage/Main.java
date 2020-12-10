package myPackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		MyList<String> str1 = new MyList<String>(new String[] {"RA","VI","DH"});
		
		System.out.println(" Test of Second Constructor and to Array Method ");
		
		System.out.println(" List of String No 1. : "+Arrays.deepToString(str1.toArray()));
		
		System.out.println(" List of String No 1."+" Has "+str1.size()+" Elements ");
		
		System.out.println();
		
		MyList<String> str2 = str1.tail();
		
		System.out.println(" The Tail of this List is: "+Arrays.deepToString(str2.toArray()));
		
		System.out.println();
		
		str2.append("AN");
		
		System.out.println(" Tail of the List After Appending is: "+Arrays.deepToString(str2.toArray()));
		
		System.out.println();
		
		
		System.out.println(" List of String No 1."+" After Appending is: "+Arrays.deepToString(str1.toArray()));
		
		System.out.println();
		
		MyList<Integer> int1 = new MyList<Integer>();
		
		int1.append(17);
		
		int1.append(41);
		
		int1.append(78);
		
		System.out.println(" Test of First Constructor and toArray Method:- ");
		
		System.out.println(" The List of Integer : "+Arrays.deepToString(int1.toArray()));
		
		System.out.println(" The List of Integer No 1."+" Has :"+int1.size()+" Elements ");
		
		System.out.println();
		
		MyList<Integer> int2 = int1.tail();
		
		System.out.println(" The Tail Of This List is: "+Arrays.deepToString(int2.toArray()));
		
		System.out.println();
		
		int2.append(82);
		
		int2.append(870);
		
		System.out.println(" The Tail of this List After Appending is: "+Arrays.deepToString(int2.toArray()));
		
		System.out.println();
		
		System.out.println(" The List of Integer No 1 After Appending is: "+Arrays.deepToString(int1.toArray()));
		
		System.out.println();
		

		MyList<String> str3 = new MyList<String>("ThisIsListOfString");
		
		System.out.println(" This is Test of Second Constructor and toArray Method:- ");
		
		System.out.println(" List of String  : "+ Arrays.deepToString(str3.toArray()));
		
		System.out.println(" List of String   Has :"+ str3.size()+" elements ");
		
		System.out.println();
		
		MyList<Integer> int3 = new MyList<Integer>(1234567890);
		
		System.out.println(" This is Test of Second Constructor and toArray Method:- ");
		
		System.out.println(" The List of Integer is: "+Arrays.deepToString(int3.toArray()));
		
		System.out.println(" This List of Integer Has :"+int3.size()+" elements ");
		
		System.out.println();
	}
	
}
