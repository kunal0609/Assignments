package Class;

public class NewClass {
	String name; 
	int division; 
	int age; 
	String city; 
 
	public NewClass(String name, int division, 
				int age, String city) 
	{ 
		this.name = name; 
		this.division = division; 
		this.age = age; 
		this.city = city; 
	} 

	@Override
	public String toString() 
	{ 
		return("Hi my name is "+name+ 
			".\nMy division,age and city are " +division+"," +age+ 
			","+city); 
	} 

	public static void main(String[] args) 
	{ 
		NewClass N1 = new NewClass("Tushar",9, 15, "Nashik"); 
		NewClass N2 = new NewClass("Samir",8, 14, "Malegaon"); 
		NewClass N3 = new NewClass("Amar",10, 16, "Satana"); 
		
		System.out.println(N1.toString());
		System.out.println(N2.toString());
		System.out.println(N3.toString());
	} 
} 
