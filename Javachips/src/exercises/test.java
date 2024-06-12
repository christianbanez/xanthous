package exercises;
import java.util.Scanner; 

public class test {

	private static void checkEvenOdd(Scanner scanner) {
		 try {
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        if (num % 2 == 0) {
	            System.out.println(num + " is even.");
	        } 
	        else {
	            System.out.println(num + " is odd.");
	        }
		 } 
		 catch (Exception e) {
	        System.out.println("Invalid input. Please enter an integer.");
	        scanner.next();  // Clear the invalid input
		 }
    }
	
	private static void sumOfN(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();  // Clear the invalid input
        }
    }
	private static void fibonacciSeries(Scanner scanner) {
        try {
            System.out.print("Enter the number of terms: ");
            int n = scanner.nextInt();
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + " " + b);
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();  // Clear the invalid input
        }
	}
	private static void palindromeChecker(Scanner scanner) {
        try {
            System.out.print("Enter a string: ");
            String str = scanner.next();
            String reverse = new StringBuilder(str).reverse().toString();
            if (str.equals(reverse)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid string.");
        }
    }
	
	private static void primeNumberChecker(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();  // Clear the invalid input
        }
    }
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
        int ch = 0;

        do {
        	clearScreen();
            try {
                System.out.println("Please input your choice:");
                System.out.println("[1] Even/Odd");
                System.out.println("[2] Sum of N");
                System.out.println("[3] Fibonacci Series");
                System.out.println("[4] Palindrome Checker");
                System.out.println("[5] Prime Number Checker");
                System.out.println("[6] Exit");

                ch = myObj.nextInt();

                switch (ch) {
                    case 1:
                        checkEvenOdd(myObj);
                        break;
                    case 2:
                        sumOfN(myObj);
                        break;
                    case 3:
                        fibonacciSeries(myObj);
                        break;
                    case 4:
                        palindromeChecker(myObj);
                        break;
                    case 5:
                        primeNumberChecker(myObj);
                        break;
                    case 6:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Please input the numbers from the choices only");
                }
            } catch (Exception e) {
                System.out.println("Please input the numbers from the choices only");
                myObj.next();  // Clear the invalid input
            }
        } while (ch != 6);

        myObj.close();
	}

}

