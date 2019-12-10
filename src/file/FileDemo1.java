package file;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {

        File dir = new File("person");
        dir.mkdir(); // Directory creation

        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);

        /*System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName()+" Folder has been deleted");
        }*/
        File file1 = new File(dirLocation + "/Student.txt");
        File file2 = new File(dirLocation + "/Taecher.txt");

        try {

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        file2.delete();
        
        if(file2.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File does not exist");
        }
    }

}
