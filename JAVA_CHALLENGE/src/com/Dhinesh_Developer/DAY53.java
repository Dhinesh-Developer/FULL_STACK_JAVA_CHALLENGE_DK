package DAY;
import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import static java.nio.file.Files.write;

public class DAY53 {
    public static void main(String[] args) {

        String path = "D:\\Files\\create.txt";
        FileReader reader = null;
        BufferedReader bf = null;
        try {
            reader = new FileReader(path);
            bf = new BufferedReader(reader);

            String line = bf.readLine();
            while(line!=null) {
                System.out.println(line);
                line = bf.readLine();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }catch(Exception e){
                System.out.println("Failed To read the file");
            }











//        Scanner in = new Scanner(System.in);
//        String text = in.nextLine();
//
//        String path = "D:\\Files\\create.txt";
//        FileWriter writer = null;
//        BufferedWriter bf = null;
//        try{
//            writer = new FileWriter(path);
//            bf = new BufferedWriter(writer);
//            bf.write(text);
//            bf.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }catch(Exception exceptions){
//            System.out.println(exceptions);
//        }
    }
}
