package org.example;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Example 1
        int[] A1 = {1, 3, 2, 4};
        int[] B1 = {3, 1, 2, 4};
        int[] result1 = findThePrefixCommonArray(A1, B1);
        System.out.println("Example 1 Output: " + java.util.Arrays.toString(result1));

    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n]; // Resultant prefix common array
        HashSet<Integer> seenInA = new HashSet<>(); // Track elements seen in A
        HashSet<Integer> seenInB = new HashSet<>(); // Track elements seen in B

        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            // Add the current element of A to the set
            if (seenInB.contains(A[i])) {
                commonCount++;
            }
            seenInA.add(A[i]);

            // Add the current element of B to the set
            if (seenInA.contains(B[i])) {
                commonCount++;
            }
            seenInB.add(B[i]);

            // Store the common count in the result array
            C[i] = commonCount;
        }

        return C;
    }

}