package Assignments;

public class Assigment6 {

	public static void main(String[] args) {
		String [] Names = {"Suresh","Mahesh","Naresh"};
		int [] Marks = {75,80,82};
	
		int [] updatedMarks = new int[3];
		
		updatedMarks [0] = Marks[0]  + 10 ; 
		updatedMarks [1] = Marks[1]  + 10 ; 
		updatedMarks [2] = Marks[2]  + 10 ; 
		
		double average = (updatedMarks [0] + updatedMarks [1] + updatedMarks [2])/ 3 ;
		
		System.out.println(Names[0] + ":" +updatedMarks [0] );
		System.out.println(Names[1] + ":" +updatedMarks [1] );
		System.out.println(Names[2] + ":" +updatedMarks [2] );
		System.out.println("Average Marks " + average );
		
		
		
		
		
		
		

	}

}