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
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return this.RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RoomType getRoomType() {
        return type;
    }

    public void setRoomType(RoomType type) {
        this.type = type;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
