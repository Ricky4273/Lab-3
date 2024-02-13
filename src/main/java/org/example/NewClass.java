package org.example;

public class NewClass {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0; // 1
        int iterate2 = 0; // 1
        int largest = 0; // 1
        while (iterate1 < sz - 1) { // sz
            iterate2++; // 1
            if (iterate2 == sz) { // 1
                iterate1++; // 1
                iterate2 = iterate1; // 1
                continue; // 1
                }
            int product = arr[iterate1] * arr[iterate2]; // 1
            if (product > largest) // 1
                largest = product; // 1
        }
        return largest; // 1
        // The algorithm has a time complexity of O(n)^2 because the while loop happens n/sz times and
        //  the inner loop will run for n-1, n-2 etc times. N * N-1 is roughly N^2.
    }
}
