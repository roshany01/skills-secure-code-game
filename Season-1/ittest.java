// importing the File class
//comment for Squash demo
//commit1
//commit2
//commit3
//commit4
//commit5
//commit6
//commit7
//commit8
//commit9
//commit10

import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file1 is created.");
      }
      else {
        System.out.println("The file1 already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
