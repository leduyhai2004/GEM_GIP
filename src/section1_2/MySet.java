package section1_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MySet {
    //Tìm 2 số trong mảng có tổng bằng K
    public boolean hasTwoSum(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = k - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
    }
}
