package Operations;

import java.io.File;
import java.util.Arrays;

public class SortFileName {
   public static void main(String[] args) {
      File dir = new File("/Users/amanagrawal/eclipse-workspace/LockedMe.com/src/Main");

      File[] files = dir.listFiles();

      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

      for (File file : files) {
         if (!file.isHidden()) {
            if (file.isDirectory()) {
               System.out.println("DIR \t" + file.getName());
            } else {
               System.out.println("FILE\t" + file.getName());
            }
         }
      }
   }
}