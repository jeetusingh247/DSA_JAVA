import java.util.Arrays;
import java.util.Comparator;

public class Knapsacks_GreedyProblem {
    
    static class Item {
        int weight; // weight of item in set of array
        int value; // value of item on set of array

        // Constructor
        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    static class Knapsack {
        // function to solve fractional knapsack using greedy algorithm
        public static double getMaxValue(Item[] items, int capacity) {
            // Sorting items by value/weight ratio in descending order
            Arrays.sort(items, new Comparator<Item>(){
                public int compare(Item item1, Item item2) {
                    double ratio1 = (double) item1.value / item1.weight;
                    double ratio2 = (double) item2.value / item2.weight;
                    return Double.compare(ratio2, ratio1); // descending order
                }
            });
            double totalValue = 0.0; // total value accumulated in knapsack
            int remainingCapacity = capacity;
            for(Item item : items) {
                if (remainingCapacity == 0) break;

                // if item can fit completely in knapsack
                if (item.weight <= remainingCapacity) {
                    totalValue += item.value;
                    remainingCapacity -= item.weight;
                }

                // if only part of item can fit, take the fraction
                else {
                    totalValue += item.value * ((double) remainingCapacity / item.weight);
                    break; // Knapsack is full
                }
            }
            return totalValue;
        }
    }

    public static void main(String[] args) {
        // create an array of items (weight, value)
        Item[] items = new Item[] {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };
        int capacity = 50; // max weight capacity of the knapsack

        // measure start time
        long startTime = System.currentTimeMillis();

        // max val knapsack can carry
        double maxValue = Knapsack.getMaxValue(items, capacity);

        // measure end time
        long endTime = System.currentTimeMillis();

        System.out.println("Maximum Value in the knapsack : " + maxValue);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
