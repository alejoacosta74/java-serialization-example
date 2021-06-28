package serialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp {
    
    public static void main (String[] args){
        System.out.println("\n\n ...Starting serializationApp:");
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Rick", "Sanchez", 70));
        participants.add(new Participant("Morty", "Smith", 10));
        System.out.println("List of Participants:\n" + participants);

        SerializationDemo demo = new SerializationDemo();
        String filename = ".\\data\\participants.ser";
        System.out.println("\n ...Serialising participants and writing file:" + filename);
        demo.serialize(participants, filename);
        System.out.println("File created:" + filename);

        System.out.printf("\n ...Deserialising participants from file %s%n", filename);
        List<Participant> newParticipants = demo.deserialize(filename);
        System.out.println("New List of Participants:\n" + newParticipants);

    }
}
