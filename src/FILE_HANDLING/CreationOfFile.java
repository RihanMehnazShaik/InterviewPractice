package FILE_HANDLING;

import java.io.File;
import java.io.IOException;

public class CreationOfFile {
    public static void main(String[] args) {
        File file=new File("src/FILE_HANDLING/dummy.txt");
        try{
            if(file.exists()) {
                throw new IOException("file already exists");
            }else{
                file.createNewFile();
                System.out.print("File created");
            }
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        //file.delete();
    }
}
