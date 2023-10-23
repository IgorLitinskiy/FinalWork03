package ToyStore;

import java.io.FileReader;
import java.io.IOException;

public class ListConsole {
    
public static void main(String[] args) {
        
        try(FileReader reader = new FileReader("ToyStore/List.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    } 
}
