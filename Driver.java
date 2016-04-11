package homeworkassigment14;

public class Driver
	{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "e13phant";
		Driver.removedigits(s2);
	}
	//returns a new String with all of the vowels 
	//removed form the parameter String 
	//"hello" -> hll 
	static void removeVowels(String s) 
	{ 
		for(int p = 0; p < s.length(); p = p + 1)
		{
			
			char a;
			char e;
			char i;
			char o;
			char u;
			if (s.charAt(p) == a) 
					System.out.print("");
					else if (s.charAt(p) == e) 
						System.out.print("");
						else if (s.charAt(p) == i) 
							System.out.print("");
							else if (s.charAt(p) == o) 
								System.out.print("");
								else if (s.charAt(p) == u) 
									System.out.print("");
									else 
										System.out.print(s.charAt(i));
		}
	System.out.println("");
	}

	//returns a new String with all of the consonants 
	//removed form the parameter String 
	//"hello" -> hll 
	static void removeconsonants(String s) 
	{ 
		for(int p = 0; p < s.length(); p = p + 1)
		{
			
			char a;
			char e;
			char i;
			char o;
			char u;
			if (s.charAt(p) == a) 
					System.out.print("a");
					else if (s.charAt(p) == e) 
						System.out.print("e");
						else if (s.charAt(p) == i) 
							System.out.print("i");
							else if (s.charAt(p) == o) 
								System.out.print("o");
								else if (s.charAt(p) == u) 
									System.out.print("u");
									else 
										System.out.print("");
		}
		System.out.println("");
	}

	//returns a new String with all of the digits 
	//removed form the parameter String 
	//"hello" -> hll 
	static void removedigits(String s) 
	{ 
		for(int p = 0; p < s.length(); p = p + 1)
		{
			
			if (s.charAt(p) == 1) 
					System.out.print("");
					else if (s.charAt(p) == 2) 
						System.out.print("");
						else if (s.charAt(p) == 3) 
							System.out.print("");
							else if (s.charAt(p) == 4) 
								System.out.print("");
								else if (s.charAt(p) == 5) 
									System.out.print("");
									else if (s.charAt(p) == 6) 
										System.out.print("");
										else if (s.charAt(p) == 7) 
											System.out.print("");
											else if (s.charAt(p) == 8) 
												System.out.print("");
												else if (s.charAt(p) == 9) 
													System.out.print("");
								
									else 
										System.out.print(s.charAt(p));
		}
	System.out.println("");
		}
	}
