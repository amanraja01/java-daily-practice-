package String;



public class Demo {

	public static void main(String[] args) {
		//charAt()Returns the char value at the specified index
		String s = ("aman");
		System.out.println(s.charAt(3));
		
		//equals()Compares this string to the specified object.
		String s1 = ("Aman");
		String s2=new String ("Aman");
		System.out.println(s1.equals(s2));
		
		//equalsIgnoreCase()=>is a String method in Java used to compare two strings for equality, ignoring case differences
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//intern()=>Returns a canonical representation for the string object
		String s4 =s1.intern();
		System.out.println(s1 == s4);
		
		//isEmpty()=>Returns true if, and only if, length() is 0
		String s5 = (" A ");
		System.out.println(s5.isEmpty());
		
		//trim()=> removes beginning and end whitespace from a string.
		System.out.println(s5.trim());
		
		//length()=> Returns the length of this string.
		System.out.println(s1.length());
		
		//endsWith()=>Tests if this string ends with the specified suffix
		System.out.println(s1.endsWith(s2));
		
		//split()=>splits a string into an array of substrings based on a given delimiter
		System.out.println(s1.split(s2));
		
		//valueOf()=> converts primitive data types or objects into their String representation.
		int num = 100 + 50;
		String str = String.valueOf(num);
		System.out.println(str);
		
		
	}
}