import java.util.Scanner;

public class OnlineReservationSystem {

    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\t\tWelcome to Online Ticket Reservation system!");
            System.out.println("Please enter valid Log in details-");
            System.out.print("Enter your User id:");
            String id=sc.next();
            System.out.print("Enter your password:");
            int pw=sc.nextInt(); 
            if(pw==1234){
                System.out.println("\t\tLog In successful! Welcome "+id+"!");
            } else {
                System.out.println("Incorrect Password!");
            }   
            System.out.println("\nPlease select your option:");
            System.out.println("1. View Seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Log out");
            int option = sc.nextInt();
            switch (option) {
                    case 1:
                        viewSeatMap();
                        break;
                    case 2:
                        reserveSeat();
                        break;
                    case 3:
                        cancelReservation();
                        break;
                    case 4:
                        System.out.println("Log out Successfully!");
                    default:
                        System.out.println("Invalid option!");
                }  
        }
    }

    private static void viewSeatMap() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nEnter Train no.");
            int train=sc.nextInt();
        
        System.out.println("\nCurrent Seat Map of Train no."+ train+" :");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.println((i+1)+": Reserved");
            } else {
                System.out.println((i + 1) + ": Unreserved");
            }
        }
        System.out.println();
    }
    }

    private static void reserveSeat() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nEnter Train no.");
            int train=sc.nextInt();
            System.out.print("\nEnter seat number (1-10): ");
            int seatNumber = sc.nextInt();
            if (seatNumber < 1 || seatNumber > 10) {
                System.out.println("Invalid seat number!");
            } else if (seats[seatNumber - 1]) {
                System.out.println("Seat is already reserved!");
            } else {
                seats[seatNumber - 1] = true;
                System.out.println("Seat reservation of Train "+train+" successful!");
                System.out.println("Your PNR is:"+ train*125);
            }
        }
        System.out.println();
    }

    private static void cancelReservation() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your PNR number:");
            int pnr=sc.nextInt();
            System.out.print("\nEnter seat number (1-10): ");
            int seatNumber = sc.nextInt();
            seats[seatNumber - 1] = false;
            System.out.println("Reservation of PNR-"+pnr+"and seat no."+seatNumber+" canceled successfully!");           
        }
        System.out.println();
    }
}

