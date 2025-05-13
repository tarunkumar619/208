package Hashing;


import java.util.HashSet;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;

        // Total candies count
        for (int candy : aliceSizes) sumAlice += candy;
        for (int candy : bobSizes) sumBob += candy;
       
        int delta = (sumBob - sumAlice) / 2;

        // Store Bob's candies in a HashSet for fast lookup
        HashSet<Integer> bobSet = new HashSet<>();
        for (int candy : bobSizes) {
            bobSet.add(candy);
        }

        // Find the correct x from Alice such that x + delta exists in Bob's set
        for (int x : aliceSizes) {
            int y = x + delta;
            if (bobSet.contains(y)) {
                return new int[]{x, y}; // Alice gives x, Bob gives y
            }
        }

        return new int[]{}; // This won't be reached as solution is guaranteed
    }

    // Example usage
    public static void main(String[] args) {
        FairCandySwap obj = new FairCandySwap();
        int[] alice = {1, 1};
        int[] bob = {2, 2};

        int[] result = obj.fairCandySwap(alice, bob);
        System.out.println("Alice gives: " + result[0] + ", Bob gives: " + result[1]);
    }
}
