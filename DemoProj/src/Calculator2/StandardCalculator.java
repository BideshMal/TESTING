package Calculator2;

	import java.util.Scanner;

	public class StandardCalculator implements Calculator {
	    private Scanner scanner;

	    public StandardCalculator() {
	        this.scanner = new Scanner(System.in);
	    }

	    @Override
	    public void chooseStandardMode() {
	        System.out.println("Standard Calculator Mode");
	    }

	    @Override
	    public void chooseScientificMode() {
	        System.out.println("Switching to Scientific Calculator Mode...");
	    }

	    @Override
	    public void add(double num1, double num2) {
	        System.out.println("Result: " + (num1 + num2));
	    }

	    @Override
	    public void subtract(double num1, double num2) {
	        System.out.println("Result: " + (num1 - num2));
	    }

	    @Override
	    public void multiply(double num1, double num2) {
	        System.out.println("Result: " + (num1 * num2));
	    }

	    @Override
	    public void divide(double num1, double num2) {
	        if (num2 != 0) {
	            System.out.println("Result: " + (num1 / num2));
	        } else {
	            System.out.println("Cannot divide by zero!");
	        }
	    }

	    @Override
	    public void power(double base, double exponent) {
	        System.out.println("Result: " + Math.pow(base, exponent));
	    }

	    @Override
	    public void squareRoot(double num) {
	        if (num >= 0) {
	            System.out.println("Result: " + Math.sqrt(num));
	        } else {
	            System.out.println("Invalid input for square root!");
	        }
	    }

	    @Override
	    public void clear() {
	        // Clear any resources or states if needed
	        System.out.println("Calculator cleared.");
	    }

	    public void startCalculator() {
	        boolean exit = false;
	        while (!exit) {
	            displayMenu();
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    chooseStandardMode();
	                    performStandardOperations();
	                    break;
	                case 2:
	                    chooseScientificMode();
	                    performScientificOperations();
	                    break;
	                case 3:
	                    exit = true;
	                    clear();
	                    System.out.println("Exiting Calculator.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter again.");
	            }
	        }
	    }

	    private void displayMenu() {
	        System.out.println("\n------ Calculator Menu ------");
	        System.out.println("1. Standard Calculator");
	        System.out.println("2. Scientific Calculator");
	        System.out.println("3. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private void performStandardOperations() {
	        double num1, num2;
	        System.out.print("Enter first number: ");
	        num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        num2 = scanner.nextDouble();

	        System.out.println("Select operation:");
	        System.out.println("1. Add");
	        System.out.println("2. Subtract");
	        System.out.println("3. Multiply");
	        System.out.println("4. Divide");
	        System.out.print("Enter operation choice: ");
	        int operation = scanner.nextInt();

	        switch (operation) {
	            case 1:
	                add(num1, num2);
	                break;
	            case 2:
	                subtract(num1, num2);
	                break;
	            case 3:
	                multiply(num1, num2);
	                break;
	            case 4:
	                divide(num1, num2);
	                break;
	            default:
	                System.out.println("Invalid operation choice.");
	        }
	    }

	    private void performScientificOperations() {
	        System.out.println("Scientific operations:");
	        System.out.println("1. Power");
	        System.out.println("2. Square Root");
	        System.out.print("Enter scientific operation choice: ");
	        int operation = scanner.nextInt();

	        switch (operation) {
	            case 1:
	                System.out.print("Enter base: ");
	                double base = scanner.nextDouble();
	                System.out.print("Enter exponent: ");
	                double exponent = scanner.nextDouble();
	                power(base, exponent);
	                break;
	            case 2:
	                System.out.print("Enter number for square root: ");
	                double num = scanner.nextDouble();
	                squareRoot(num);
	                break;
	            default:
	                System.out.println("Invalid operation choice.");
	        }
	    }

	    public static void main(String[] args) {
	        StandardCalculator calculator = new StandardCalculator();
	        calculator.startCalculator();
	    }
	}


