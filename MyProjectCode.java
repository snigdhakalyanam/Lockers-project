package Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

	
       // Sort files in ascending order..


  public class MyProjectCode {
	
	public static void SortAscending() {
        File fileDir = new File("/Users/eclipse-workspace/phase1oops/MyFolder/");
        if(fileDir.isDirectory()){
            List <String>listFile = Arrays.asList(fileDir.list());
            Collections.sort(listFile);
            System.out.println("**************************");
            System.out.println("Sorting by filename in ascending order");
            for(String s:listFile){
                System.out.println(s);
            }}
            else {
            	System.out.println(fileDir.getAbsolutePath() + " is not a directory");
            }MyProjectCode.Selection();

        }
            

	
	// Add a file to the Folder called "MyFolder"//
	
	
	public static void createFile() { 
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name you want to create:");
		
		 String name =sc.nextLine();
	
		
		File file = new File("/Users/eclipse-workspace/phase1oops/MyFolder/"+name);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File Created :");
				MyProjectCode.Selection();
			}else {
				System.out.println("File already exists:");
				MyProjectCode.Selection();
			}
				
		}catch(Exception e) {
			System.out.println(e);
		}
}
		
	
	// Delete a File from the Folder called "MyFolder"//

	
	
	public static void Delmethod() {
		
		String filename;
	   
		Scanner scan = new Scanner(System.in);
			System.out.println("enter the name of file that you want to delete: ");
			
			filename= scan.nextLine();
		
		File file = new File("/Users/eclipse-workspace/phase1oops/MyFolder/"+filename);

		if(file.delete()) {
			System.out.println("File deleted successfully");
			MyProjectCode.Selection();
			
		}
		else {
			System.out.println("Sorry.... file not found!");
			MyProjectCode.Selection();
		}

			}
	
	
	// User searching for a file in the folder called "MyFolder" //
				
	
		
	public static void Searchmethod() {
		System.out.println("Enter the name of the file to search");
		Scanner s1 = new Scanner(System.in);
			String folderName = s1.next();
			File file = new File("/Users/eclipse-workspace/phase1oops/MyFolder/"+folderName);

			if(file.exists()) {
				System.out.println("yep! file found");
				System.out.println(file.getAbsolutePath());
				MyProjectCode.Selection();
			}else {
				System.out.println("Sorry!!!!! File is not here(FILE NOT FOUND)");
				MyProjectCode.Selection();
				}
			
			
			
			try {
				PrintWriter pw=new PrintWriter(file);
				pw.println("saved");
				pw.close();
			}catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
			
		
		
		
		


	public static void Selection() {
	System.out.println("please select one of the following options:");
	System.out.println("1 Return files in Ascending order");
	System.out.println("2 For your Business Operations");
	System.out.println("3 Close the Application");
	
	}
	
	private static void Businessops() {

		System.out.println("Please choose one of the following options:");
		System.out.println("1. Add or Create a file to the existing directory list");
		System.out.println("2. Delete a user specified file from the existing directory list");
		System.out.println("3. Search a user specified file from the main directory");
		System.out.println("4. Revert to Navigate option");
		
		Scanner sc2 = new Scanner(System.in);
			
		try {
		int choice=sc2.nextInt();
			
		switch(choice) {
		case 1: 
			System.out.println("you have selected to Add/Create a file");
			
			createFile();
			break;
			
		case 2:
			System.out.println("You have selected a Delete file");
			Delmethod();
			break;
			
		case 3:
			System.out.println("You have Selected to search file");
			Searchmethod();
			break;
			
		case 4:
			System.out.println("Revert to main menu called Selection");
			MyProjectCode.Selection();
			break;
			
		}
		
		
		}catch(Exception e) {
			System.out.println("Wrong number entered, try to choose correct number from the options:");
		
		MyProjectCode.Selection();
		}
		
	}
			
		public static void main(String[] args) throws IOException {
		System.out.println(" \t ###################### \n");
		
		System.out.println(" \t Welcome to Lockers Pvt Ltd"+ '\n' + "\t Developed by Snigdha \n");
	
	    System.out.println("\t ###################### \n");
	
	     Scanner sc = new Scanner(System.in);
		
	
	   MyProjectCode.Selection();
		while(true) {
			
			try {
				int option=sc.nextInt();
				switch(option) {
				
				case 1:
					System.out.println("Sorted files in Ascending order");
			
					SortAscending();
					break;
					
				case 2:
					MyProjectCode.Businessops();
		                   break;
				case 3:
				
					System.out.println("Thanks for choosing Locker.you have chosen to close the Application");
					System.out.println("* Application is closed *");
					
					System.exit(option);
					break;
					
					default:
						System.out.println("Please try again!! something went wrong :(");
				}
			}catch(Exception e) {
				System.out.println("Oops enter Valid number");
		}

		}
	}
}





