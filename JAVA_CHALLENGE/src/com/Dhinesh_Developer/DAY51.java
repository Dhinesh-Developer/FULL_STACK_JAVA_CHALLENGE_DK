package DAY;

import java.io.*;

public class DAY51 {
    public static void main(String[] args) {

        /* creating a File*/
        String path = "D:\\Files\\create.txt";
        File file = new File(path);
        boolean x = false;
        try{
            x = file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            System.out.println(x +" File created Successfully");
        }

        FileWriter writer = null;
        try{
            writer = new FileWriter(file);
            writer.write("Today File handling concept studying");
             writer.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("success");
        }

        FileReader reader = null;
        try{
            reader = new FileReader(file);
            try{
                System.out.println(reader.read());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
