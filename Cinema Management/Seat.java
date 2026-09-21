
public abstract class Seat{
    protected String seatNumber;
    private boolean isBooked;
    protected Seat (String seatNumber, boolean isBooked){
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
    }
    public synchronized boolean reserve(String seatNumber2){
        if (!isBooked){
            isBooked = true;
            return true;
        }
        else return false;
    }
    public String getseatNumber(){
        return  seatNumber;
    }
    public boolean getisBooked(){
        return isBooked;
    }
}
