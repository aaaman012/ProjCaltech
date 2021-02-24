package Operations;

import java.io.FileOutputStream;
import java.util.Scanner;
public class Add(name) {
  
    try {
      
      FileOutputStream fos = new FileOutputStream(name, true);
      // true for append mode  
      System.out.print("Enter file content: ");
      String str = sc.nextLine() + "\n";
     
     
      System.out.println("The file has been saved on the given path.");
    }
    catch(Exception e) {
      System.out.println("Exception Occurred:");
      e.printStackTrace();
    }
  }
}

