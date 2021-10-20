package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//CREATE PRIME FUNCTION (input = int[], output = prime int[])
public class exam1 {
    public static void main(String[] args) {
        int[] input = { -3, 0, 1, 2, 3, 5, 7, 9, 13 };
        if (prime(input) == null) {
            System.out.println("NULL");
        } else
            System.out.println(Arrays.toString(prime(input)));
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