import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if (bedroom.getCapacity() > bedroom.guestCount()){
            bedroom.addGuest(guest);
        }
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
}
