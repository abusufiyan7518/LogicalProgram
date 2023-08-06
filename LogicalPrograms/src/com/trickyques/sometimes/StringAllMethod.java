package com.trickyques.sometimes;

public class StringAllMethod {
	public static void main(String[] args) {

		String s = "Bagh";
		char c = s.charAt(2);
		System.out.println(c);

		String str = "Welcome to Javatpoint portal";
		int strLength = str.length();
		System.out.println(strLength);
		System.out.println("Character at 0 index is: " + str.charAt(0));
		System.out.println("Character at last index is: " + str.charAt(strLength - 2));

		String name = "what do you know about me";
		System.out.println(name.contains("what do you know about me"));
		String str1 = "To learn Java visit Javatpoint.com";

		if (str1.contains("Javatpoint.com")) {

			System.out.println("This string contains javatpoint.com");
		} else
			System.out.println("Result not found");

		String string = "Buniyaad";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);

		String s1 = "java by javatpoint world";
		System.out.println(s1.endsWith("d"));

		String str2 = "Welcome to Javatpoint.com";
		System.out.println(str2.endsWith("point"));

		if (str2.endsWith(".com")) {

			System.out.println("String ends with .com");
		} else
			System.out.println("It does not end with .com");

		String u = "Mubassir";
		String u1 = "Sufiyan";
		String u2 = "mUbassir";

		System.out.println(u.equals(u1));

		System.out.println(u.equalsIgnoreCase(u2));

		String name1 = "sonoo"; // literal
		String sf1 = String.format("name is %s", name1);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %32.10f", 32.33434); // 12.8467352542
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);

		String str7 = new String("hello javatpoint how r u");
		char[] ch = new char[10];
		try {
			str7.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch (Exception e) {
			System.out.println(e);
		}

		String s5 = "this is index of example";

		int a = s5.indexOf("is");
		int b = s5.indexOf("index");
		System.out.println(b + "  " + a);

		int index3 = s5.indexOf("i", 5);
		System.out.println(index3);

		int index4 = s5.indexOf('i');
		System.out.println(index4);

		String s11 = "";
		String s2 = "javatpoint";
		System.out.println(s11.isEmpty());
		System.out.println(s2.isEmpty());

		String joinString1 = String.join("-", "welcome", "to", "javatpoint");
		System.out.println(joinString1);

		String s111 = "this is index of example";
		int index1 = s111.lastIndexOf('e');
		System.out.println(index1);

		String s12 = "AbuSufiyan Please Change this String in LowerCase by  Program ";
		String s1lower = s12.toLowerCase();
		System.out.println(s1lower);

		{
			int lines = 10;
			int i = 1;
			int j = 1;
			for (i = 1; i <= lines; i++) {
				for (j = 1; j <= i; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println("");
			}

			{
				int lines1 = 10;
				int i1 = 1;
				int j1 = 1;
				for (i1 = 1; i1 <= lines1; i1++) {
					for (j1 = 1; j1 <= i1; j1++) {
						System.out.print(i1 * j1 + " ");
					}
					System.out.println("");
				}
			}

			String k1 = "jevetpoint is e very good website";

			String replaceString = k1.replaceAll("jevetpoint", "Test");

			System.out.println(replaceString);

			String j12 = "jevetpoint is E very good website";

			String replaceString1 = j12.replace('e', 'a');
			System.out.println(replaceString1);

			String m1 = "java string split method by javatpoint";

			String[] words = m1.split("method");
			for (String w : words) {
				System.out.println(w);
				String h1 = "java string split method by javatpoint";

				System.out.println(h1.startsWith("ja"));

				System.out.println(h1.startsWith("java string"));
				System.out.println(h1.startsWith("java string"));

				String str8 = "xokyo Olympics";

				if (str8.startsWith("x")) {
					System.out.println("The string starts with the empty string.");
				} else {
					System.out.println("The string does not start with the empty string.");
				}

				String str9 = "Hello";
				String str10 = "Javatpoint";
				String str11 = "Reader";

				String str4 = str9.concat(str10);
				System.out.println(str11);

				String str5 = str9.concat(str10).concat(str11);
				System.out.println(str5);
				String s9 = "javatpoint";

				System.out.println("string length is: " + s9.length());

				String a1 = "Hindustan Petroleum";
				String substr = a1.substring(0);
				System.out.println(substr);
				String substr2 = a1.substring(10, 16);
				System.out.println(substr2);
				try {
					String substr3 = a1.substring(5, 25);
				} catch (Exception e) {
					System.out.println("Finally Run");
					System.out.println(e);

				}

				String f1 = "Center Boys";
				System.out.println(f1.substring(1));
				System.out.println(f1.substring(2, 8));
				String f2 = "  hello center boys ";
				System.out.println(f1 + " are you fine");
				System.out.println(f1.trim() + " don't shy ");

				String s101 = "Paragon is a Company of Chappal";
				String w1upper = s101.toUpperCase();
				System.out.println(w1upper);
				int value = 30;
				String s10 = String.valueOf(value);
				System.out.println(s10 + 20);
			}
		}

	}
}
