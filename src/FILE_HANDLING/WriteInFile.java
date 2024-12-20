package FILE_HANDLING;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("src/FILE_HANDLING/dummy.txt",true);
        try{
            fileWriter.append("good morning");
            fileWriter.close();
            System.out.print("Written successfully");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
