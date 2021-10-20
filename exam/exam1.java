package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//CREATE PRIME FUNCTION (input = int[], output = prime int[]) and show results
public class exam1 {
    public static void main(String[] args) {
        int[] input = getNumber();
        if (prime(input) == null) {
            System.out.println("NULL");
        } else
            System.out.println(Arrays.toString(prime(input)));
    }

    public static int[] getNumber() {
        Scanner s = new Scanner(System.in);
        List<Integer> output = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter number : ");
            try {
                output.add(Integer.parseInt(s.nextLine()));
            } catch (Exception e) {
                System.out.println("Enter only int");
            }
            System.out.println("Add next? Y or N : ");
            String check = s.nextLine();
            if (check.equals("N")) {
                System.out.println(check);
                break;
            }
        }
        s.close();
        return output.stream().mapToInt(i -> i).toArray();
    }

    public static int[] prime(int[] input) {
        if (input.length < 1)
            return null;
        List<Integer> output = new ArrayList<Integer>();
        boolean check = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 2) {
                for (int j = 2; j < input[i]; j++) {
                    if (input[i] % j == 0) {
                        check = false;
                        break;
                    }
                    check = true;
                }
                if (check == true) {
                    output.add(input[i]);
                }
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}