import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public String getConferenceRoomName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }
}