package Operations;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Menu {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		System.out.println("Lockedme.com -Aman Agrawal");
		System.out.println("Insert 1-Retrieving the sorted file names");
		System.out.println("Insert 2-Business-level operations");
		System.out.println("Insert 3-Close the application");
		
		Scanner option = new Scanner(System.in);
		String input;
		do
        {   
			File dir = new File("/Users/amanagrawal/eclipse-workspace/LockedMe.com/src/Main");
			System.out.println("Enter your option(1/2/3):");
			input = option.next();
        	
            if(input.equals("1"))
            {
                SortFileName();
                
                
            }
            else if(input.equals("2"))
            {
            	System.out.println("Options for Add/Delete/Search/Return to main");
            	System.out.println("Add-1/Delete-2/Search-3/Return-4");
            	Scanner choice = new Scanner(System.in);
            	System.out.println("Enter your choice(1/2/3/4):");
            	int choice1 = choice.nextInt();
            	
            
            switch (choice1) {
            	case 1://Add file 
            		try{
            			Scanner sc = new Scanner(System.in );   
            			System.out.print("Enter the file name: ");
            			String name = sc.nextLine();
            			String fname= dir+File.separator+name;
            			

            	        File file = new File(fname);
            	       
            	        file.createNewFile();
            		}
            		 catch(Exception e) {
            		      System.out.println("Exception Occurred:");
            		      e.printStackTrace();
            		 }
                    
            		break;   
                    
                case 2://Delete File
                	Scanner sc1 = new Scanner(System.in );   
        			System.out.print("Enter the file name to delete(Precisely): ");
        			String name = sc1.nextLine();
        			String fname1= dir+File.separator+name;
        			File file1 = new File(fname1);
        			if(file1.delete()) 
        	        { 
        	            System.out.println("File deleted successfully"); 
        	        } 
        	        else
        	        { 
        	            System.out.println("FNF (File not found)"); 
        	        } 
        	    
        			break;
            	case 3:
            		Scanner sc2 = new Scanner(System.in );   
        			System.out.print("Enter the file name to search(Precisely): ");
        			String name1 = sc2.nextLine();
        			String fname2= dir+File.separator+name1;
        			File file2 = new File(fname2);
            		
        
				try {
					if(file2.exists() && file2.getCanonicalPath().equals(fname2)){
            		    // file exists
            			System.out.println("File exists");
            			
            		}else{
            		    // file is not exist
            			System.out.println("File doesn't exist");
            		}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            		
            		
            	
            		break;
            	case 4://
            		
            		break;  
            	}
           }
            else if(input.equals("3"))
            {
            	System.exit(0);
            }
            else
            {
                
                System.out.println("Try again");
                continue;
            }
        }
        while(!input.equals("3"));

    }

	



	private static void SortFileName() {
		
		      
		File dir = new File("/Users/amanagrawal/eclipse-workspace/LockedMe.com/src/Main");
		      File[] files = dir.listFiles();

		      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

		      for (File file : files) {
		         if (!file.isHidden()) {
		            if (file.isDirectory()) {
		               System.out.println("DIR \t" + file.getName());
		            }
		            else {
		               System.out.println("FILE\t" + file.getName());
		            }
		         }
		      }
		   }
		
		

	}




