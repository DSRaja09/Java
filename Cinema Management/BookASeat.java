import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class BookASeat implements Runnable{

    private String customerName;
    private String movieName;
    private String seatNumber;

    private static final Set<Integer> bookedSeats = new HashSet<>();


    public BookASeat(String customerName, String seatNumber, String movieName){
        this.customerName = customerName;
        this.seatNumber = seatNumber;
        this.movieName = movieName;
    }

    public void checkSeat() throws Exception{
        if (BookRegistry.movieDB.containsKey(movieName) == false){
            throw new Exception("Dear " + customerName + " unfortunatly " + movieName + " is not available at the moment");
        }
        String movieId = BookRegistry.getMovieId(movieName);
        if (seatNumber == null || seatNumber.length() != 2){
            throw new Exception("Dear " + customerName +" Invalid entry\n");
        }
        if (seatNumber.charAt(0) > 'E' || seatNumber.charAt(1) - '0' > 5){
            throw new Exception("Dear " + customerName +" No such seat are found...Please Try Again");
        }
        int newHashId = Objects.hash(movieId, seatNumber);
        synchronized (bookedSeats){
            if (!bookedSeats.contains(newHashId)){
                bookedSeats.add(newHashId);
                System.out.print("[Success] " + seatNumber + " successfully booked for " + customerName + "\n");
                printReceipt();
            }
            else{
                System.out.print("[Failed] " + "Dear " + customerName + " " + seatNumber + " is already booked for movie " + movieName + "\n");
            }
        }
    }
    public void printReceipt (){
        double basePrice = 0;
        if (seatNumber.charAt(0) == 'A' || seatNumber.charAt(0) == 'E')
            basePrice += 4.5;
        else if (seatNumber.charAt(0) == 'B' || seatNumber.charAt(0) == 'D'){
            basePrice += 6.5;
        }
        else if (seatNumber.charAt(0) == 'C') basePrice += 10.0;
        switch (seatNumber.charAt(1)) {
            case '2':
            case '4':
                basePrice += .5; 
                break;
            case '3':
                basePrice += 1;
            default:
                break;
        }

        StringBuilder sb = new StringBuilder();
          sb.append("----- RECEIPT -----\n")
          .append("Customer: ").append(customerName).append("\n")
          .append("Movie: ").append(movieName).append("\n")
          .append("Seat: ").append(seatNumber).append("\n")
          .append("Price: $").append(String.format("%.2f", basePrice)).append("\n")
          .append("-------------------\n");

        System.out.print(sb.toString());

    }

    @Override
    public void run() {
       try{
        checkSeat();
       }
       catch (Exception e){
        System.out.print("[Error] " + e.getMessage() + '\n');
       }
    }

}