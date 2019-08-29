import support.cse131.ArgsProcessor;

public class Average{
public static void main(String[] args) {
    ArgsProcessor ap = new ArgsProcessor(args);
    double n1 = ap.nextDouble("What is the First Value you would like to be averaged?");
    double n2 = ap.nextDouble("What is the Second Value you would like to be averaged?");
    double average = (double) ((n1 + n2) / 2);
    System.out.println("Your average is " + average);

}
}
