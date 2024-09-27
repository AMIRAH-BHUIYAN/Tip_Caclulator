import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        System.out.print("Total bill: ");  //collects bill before tip, tip percentage, and # of people
        String bill = s.nextLine();
        System.out.print("Tip %: ");
        String tip = s.nextLine();
        System.out.print("Number of people: ");
        String party = s.nextLine();
        System.out.println();


        double billTotal = Double.parseDouble(bill); //converts user string responses into doubles & ints for calculations
        double tipPercent = Double.parseDouble(tip);
        int people = Integer.parseInt(party);


        //calculations
        tipPercent *= 0.01;
        double tipTotal = (tipPercent*billTotal);
        billTotal += tipTotal;
        double soloTip = tipTotal/people;
        double soloTotal = billTotal/people;


        //calculator results
        System.out.println("Tip total: " + tipTotal);
        System.out.println("Bill total (tip included): " + billTotal);
        System.out.println("Tip per person: " + soloTip);
        System.out.println("Total per person (tip included): " + soloTotal);


    }
}
