import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class FractionalKnapsack {
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items based on value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(o -> -((double) o.value / o.weight)));
        
        double totalValue = 0.0;
        
        for (Item item : items) {
            if (capacity == 0) break;
            
            if (item.weight <= capacity) {
                // Take the whole item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take the fractional part of the item
                double fraction = (double) capacity / item.weight;
                totalValue += item.value * fraction;
                capacity = 0;
            }
        }
        
        return totalValue;
    }
    
    public static void main(String[] args) {
        Item[] items = { new Item(10, 60), new Item(20, 100), new Item(30, 120) };
        int capacity = 50;
        
        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
