package hashmap;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author yamzil
 * @created 2022-02-15
 * @project map
 */
public class CustomHashMap<K, V> {

    private Entry<K, V>[] bucket;
    private static final int BUCKET_CAPACITY = 101;

    public CustomHashMap() {
        this.bucket = new Entry[BUCKET_CAPACITY];
    }

    public void put(K key, V value) {
        if(key == null)
            return;
        int keyHashCode = this.getHashCode(key);
        int index = keyHashCode % BUCKET_CAPACITY;
        Entry<K, V> element = new Entry<>(key, value, null);
        if(bucket[index] == null){
            bucket[index] = element;
        } else{
            Entry<K, V> previous = bucket[index];
            while(previous.next != null){
                previous = previous.next;
            }
            previous.next = element;
        }
    }

    public void displayMap(){
        System.out.println(Arrays.toString(this.bucket));
    }

    private int getHashCode(K key) {
        return 17 * 37 + Objects.hashCode(key);
    }
    class Entry<K, V>{
        protected K key;
        protected V value;
        protected Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}

