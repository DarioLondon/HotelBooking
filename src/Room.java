import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dario on 17/03/2016.
 */
class Room {
    private int id;
    private ArrayList<Date> booking_dates;
    private int roomNumber;
    private ArrayList<Customer> customer_list;

    Room(int id, int roomNumber, Customer customers, Date checkIn, Date checkOut) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.customer_list.add(customers);
        this.booking_dates.add(checkIn);
        this.booking_dates.add(checkOut);
    }


}
