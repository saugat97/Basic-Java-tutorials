package classesWithMethodsAndInstances;

public class Name {
	
	private String friendName;         //private: only methods inside this class can use this variable
	
	public Name(String name) {		   //Use of Constructor
		friendName = name;			   //Constructor allows us to initialize the variable as soon as it is created. 
									   //Also, constructor doesn't return value
		
	}
	
	public void setName(String name) {
		friendName = name;
	}
	
	public String getName() {
		return friendName;
	}
	
	public void print() {
		System.out.printf("Your first friend was %s \n\n", getName());    //printf (common in C)
	}
	
	public void print2() {
		System.out.printf("Your second friend was %s", getName());    //printf (common in C)
	}
}


//Instance variable: they are outside the method but within the class