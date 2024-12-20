package FILE_HANDLING;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File file=new File("src/FILE_HANDLING/dummy.txt");
        try{
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
