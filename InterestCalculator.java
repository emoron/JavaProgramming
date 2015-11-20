import java.util.*;

class InteresCalculator{

  public static void main(String [] args){

  final int MONTH_IN_YEAR = 12;
  double loanAmount, annualInteresRate;
  double monthlyPayment, totalPayment;

  double monthlyInterestRate;
  int loadPeriod;
  int numberOfPayments;

  Scanner scanner = new Scanner(system.in);
  scanner.useDelimiter(system.getProperty("line.separator"));

  System.out.print("Loan amount (Dollars+cents):");
  loanAmount = scanner.nextDouble();

  System.out.print("Annual Interest Rate");
  annualInteresRate = scanner.nextDouble();

  System.out.print("Loan Period - # of years");

  loadPeriod = scanner.nextInt();

  monthlyInterestRate = annualInteresRate / MONTH_IN_YEAR / 100;
  numberOfPayments = loanPeriod * MONTH_IN_YEAR;

  monthlyPayment = (loanAmount*monthlyInterestRate)/(1-Math.pow(1/(1+ monthlyInterestRate),numberOfPayments));

  totalPayment = monthlyPayment * numberOfPayments;


  System.out.println("");

  System.out.println("Loan amount:                  $"+ loanAmount);
  System.out.println("Annnual interest Rate: " + annualInteresRate + "%");
  System.out.println("Loan Period (years):  " + loanPeriod);
  System.out.println("Monthly Payment  is    $ " + monthlyPayment);
  System.out.println("Total Payment  is      $ " + totalPayment);
  }
}
