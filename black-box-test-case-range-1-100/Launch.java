import java.util.Scanner;

public class Launch {

    public static void main(String[] args) {
		int noOfTest = 2;
		int test = 0;
		int[] input = new int[noOfTest];
		String[] expected = new String[noOfTest];
		int[] actual = new int[noOfTest];
		String[] status = new String[noOfTest];
		String[] remarks = new String[noOfTest];
		Scanner sc = new Scanner(System.in);
        boolean isOut;
		do {
            isOut = false;
			System.out.printf("Enter +ve no. (1 - 100): ");
            input[test] = sc.nextInt();
            if(0 >= input[test] || 101 <= input[test]) {
                remarks[test] = "Invalid Equivalent Class";
                isOut = true;
            } else {
                remarks[test] = "Valid Equivalent Class";
            }
            actual[test] = input[test] * input[test];
            System.out.printf("Enter expected square of %d : ", input[test]);
            expected[test] = Integer.toString(sc.nextInt());
            if(isOut) {
                expected[test] = "Out Of Range";
            }
            if(Integer.toString(actual[test]).equals(expected[test])) {
                status[test] = "Pass";
            } else {
                status[test] = "Fail";
            }
		} while(noOfTest > ++ test);
		sc.close();
		sc = null;
        System.out.println();
        String line = String.format("%79s", ' ').replace(" ", "-");
        String fmt = "|%-10s|%-6s|%-25s|%-13s|%-10s|%-8s|\n";
        System.out.println(line);
        System.out.printf(fmt, "Test Case", "Input", "Remarks", "Expected", "Actual", "Status");
        System.out.println(line);
        System.out.println(line);
        test = 0;
        do {
            System.out.printf(fmt, (test + 1), input[test], remarks[test], expected[test], actual[test], status[test]);
            System.out.println(line);
        } while(noOfTest > ++ test);
    }
}
