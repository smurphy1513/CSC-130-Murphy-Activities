
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int currentYear;
		int retireYear;
		
		age = 20;
		currentYear = 2018;
		retireYear = 2063;
		
System.out.println("Hello, World!!!");
System.out.println("********");
System.out.println("********");
System.out.println("********");
System.out.println("********");
System.out.println("********");
System.out.println("********");
System.out.println("How old are you?");
System.out.println("I am " + age + " years old.");
System.out.println("How may years until you retire?");
/*I decided to first do the retirement age minus my age and then do the year I will probably retire minus the current year*/
System.out.println("I will retire in " + (65 - age) + " years.");
System.out.println("I will retire in " + (retireYear - currentYear) + " years.");
	}

}
