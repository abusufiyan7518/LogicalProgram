package com.interviewquestions;

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class CustomHashMap<K, V> {
    private static final int CAPACITY = 16;
    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new Entry[CAPACITY];
    }

    public void put(K key, V value) {
        int index = key.hashCode() % CAPACITY;
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }

    public V get(K key) {
        int index = key.hashCode() % CAPACITY;
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}

public class CustomHashMapExample {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        System.out.println("Value for 'one': " + map.get("one"));
        System.out.println("Value for 'two': " + map.get("two"));
    }
}
