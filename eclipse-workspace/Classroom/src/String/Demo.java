package String;

public class Demo {
	public static void main(String[] args) {
		        String s = " Java Programming ";

		        //length()
		        System.out.println(s.length());

		        //toUpperCase()
		        System.out.println(s.toUpperCase());

		        //toLowerCase()
		        System.out.println(s.toLowerCase());

		        //trim()
		        System.out.println(s.trim());
                //charAt()
		        System.out.println(s.charAt(2));

		        //contains()
		        System.out.println(s.contains("Java"));

		        //equals()
		        System.out.println(s.equals("Java Programming"));

		        //equalsIgnoreCase()
		        System.out.println(s.equalsIgnoreCase(" java programming "));

		        //substring()
		        System.out.println(s.substring(1, 5));

		        //replace()
		        System.out.println(s.replace("Java", "Core Java"));

		        //indexOf()
		        System.out.println(s.indexOf("P"));

		        //lastIndexOf()
		        System.out.println(s.lastIndexOf("a"));

		        //startsWith()
		        System.out.println(s.startsWith(" Java"));

		        //endsWith()
		        System.out.println(s.endsWith(" "));

		        //split()
		        String[] arr = s.split(" ");
		        for (String word : arr) {
		            System.out.println(word);
	}
	   }
}