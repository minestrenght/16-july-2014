import java.util.Scanner;

public class Launch {

    public static void main(String[] args) {
		int noOfTest = 9;
		int test = 1;
		int num;
		String[] input = new String[noOfTest];
		String[] expected = new String[noOfTest];
		String[] actual = new String[noOfTest];
		String[] status = new String[noOfTest];
		String[] remarks = new String[noOfTest];
		String invalidClass = "Invalid Equivalent Class";
		String validClass = "Valid Equivalent Class";
		String pass = "Pass";
		String fail = "Fail";
		String outOfRange = "Out Of Range";
		String colFormat = "-%s27";
		String notAnum = "Not a number";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Enter +ve no. (1 - 100): ");
			try {
				input[test] = sc.nextLine();
				num = Integer.parseInt(input[test]);
				actual[test] = Integer.toString(num * num);
			} catch (NumberFormatException ex) {
				expected[test] = notAnum;
				actual[test] = notAnum;
				remarks[test] = notAnum;
				status[test] = fail;
			}
		} while(noOfTest >= test ++);
		sc.close();
		sc = null;
    }
}
