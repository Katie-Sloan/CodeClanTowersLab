import java.awt.*;
import java.util.ArrayList;

public class Bedroom {

    private int RoomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private RoomType type;

    public Bedroom(int RoomNumber, int capacity, RoomType type) {
        this.RoomNumber = RoomNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public int getRoomNumber() {
        return this.RoomNumber;
    }
}
