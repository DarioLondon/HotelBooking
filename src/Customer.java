import java.util.Date;

/**
 * Created by Dario on 17/03/2016.
 */
class Customer {

    private int id;
    private String name;
    private String surname;
    private String address;
    private String postcode;
    private String credicCard;
    private Date dayIn;
    private Date dayOut;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCredicCard() {
        return credicCard;
    }

    public void setCredicCard(String credicCard) {
        this.credicCard = credicCard;
    }

    public Date getDayIn() {
        return dayIn;
    }

    public void setDayIn(Date dayIn) {
        this.dayIn = dayIn;
    }

    public Date getDayOut() {
        return dayOut;
    }

    public void setDayOut(Date dayOut) {
        this.dayOut = dayOut;
    }
}
