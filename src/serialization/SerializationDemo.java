package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationDemo {    

    public void serialize (List<Participant> pList, String fileName){        
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(pList);
            out.close();
            fileOut.close();            

        } catch (IOException ex){
            System.out.println("...serialization error");
            System.out.println(ex.getMessage());            
        }
    }

    public List<Participant> deserialize (String filename){
        List<Participant> pList = null;
        try {            
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);                       
            pList = (List<Participant>) in.readObject();            
            in.close();            
            fileIn.close();
            return pList;

        } catch (IOException | ClassNotFoundException ex){
            System.out.printf("...error when deserializing %s%n", filename);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    
        

        
    }
    
}
