package DAY;

import java.io.File;

public class DAY52 {
    public static void main(String[] args) {
        /* File handling -> Methods*/
        String path = "D:\\Files\\create.txt";
        File file = new File(path);
        System.out.println(file.exists());  //-> Returns in boolean

        // canRead() and canWrite() ->check whether the file is readable or writeable or not
        System.out.println(file.canRead());    //-> Returns in boolean
        System.out.println(file.canWrite());   //-> Returns in boolean

        // getName() and getParent() -> get the folder name and file name
        System.out.println(file.getName());   // create.txt
        System.out.println(file.getParent());   // D:\Files

        //getAbsolutePath -> get the Entire Path of the File.
        System.out.println(file.getAbsolutePath());   //D:\Files\create.txt

        //mkdir() -> create the new Directory denoted by abstract pathname.
        String path1 = "D:\\Files\\Program1.txt";
        File f = new File(path1);
        System.out.println(f.mkdir()); // create a new file directory

        // list() -> To show the count and files name in the directory
        try{
            String[] list = file.list();;
            for(String x : list){
                try{
                    System.out.println(x);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        // delete() -> delete the file , based on the path
        System.out.println(f.delete());  // returns in the boolean.

    }
}
