import java.util.*;

public class HashMapImplementation {

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private LinkedList<Node>[] buckets; // Array of linked lists to store key-value pairs
        private int size; // Number of elements in the map

        // Inner class representing a key-value pair
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // Constructor to initialize the hashmap with default capacity
        public MyHashMap() {
            this.buckets = new LinkedList[DEFAULT_CAPACITY];
            for (int i = 0; i < DEFAULT_CAPACITY; i++) {
                buckets[i] = new LinkedList<>();
            }
            this.size = 0;
        }

        // Hash function to compute the index for a given key
        private int hash(K key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }

        // Searches for the index of a key in a particular bucket
        private int getIndexInBucket(K key, int bucketIndex) {
            for (int i = 0; i < buckets[bucketIndex].size(); i++) {
                if (buckets[bucketIndex].get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // Returns the number of key-value pairs in the map
        public int size() {
            return size;
        }

        // Inserts a key-value pair into the map or updates the value if key already exists
        public void put(K key, V value) {
            int bucketIndex = hash(key);
            int nodeIndex = getIndexInBucket(key, bucketIndex);

            if (nodeIndex != -1) {
                // Key already exists, update value
                buckets[bucketIndex].get(nodeIndex).value = value;
            } else {
                // Key does not exist, add new key-value pair
                buckets[bucketIndex].add(new Node(key, value));
                size++;
            }

            // Resize the hashmap if load factor exceeds threshold
            if ((float) size / buckets.length > DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        // Resizes the hashmap by doubling its capacity and rehashing all elements
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[oldBuckets.length * 2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            size = 0;

            // Reinsert all existing key-value pairs into the new buckets
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        // Retrieves the value associated with a given key
        public V get(K key) {
            int bucketIndex = hash(key);
            int nodeIndex = getIndexInBucket(key, bucketIndex);
            return nodeIndex != -1 ? buckets[bucketIndex].get(nodeIndex).value : null;
        }

        // Removes a key-value pair from the map and returns the value
        public V remove(K key) {
            int bucketIndex = hash(key);
            int nodeIndex = getIndexInBucket(key, bucketIndex);

            if (nodeIndex != -1) {
                Node removedNode = buckets[bucketIndex].remove(nodeIndex);
                size--;
                return removedNode.value;
            }
            return null;
        }

        // Checks whether the map contains a given key
        public boolean containsKey(K key) {
            return get(key) != null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("one", 1);
        mp.put("two", 2);
        mp.put("three", 3);
        System.out.println("Size: " + mp.size()); // Print size of hashmap
        System.out.println("Value for 'two': " + mp.get("two")); // Retrieve value for key 'two'
        mp.remove("two"); // Remove key 'two'
        System.out.println("Contains 'two'? " + mp.containsKey("two")); // Check if 'two' exists
        sc.close();
    }
}
