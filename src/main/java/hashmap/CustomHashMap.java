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
        Entry<K, V> element = new Entry<>(key, value, null);
        if(bucket[keyHashCode] == null){
            bucket[keyHashCode] = element;
        } else{
            Entry<K, V> previous = bucket[keyHashCode];
            while(previous.next != null){
                previous = previous.next;
            }
            previous.next = element;
        }
    }

    public V get(K key){
        if(key == null)
            return null;
        int keyHashCode = this.getHashCode(key);
        Entry<K, V> tmp = this.bucket[keyHashCode];
        while (tmp != null){
            if(tmp.key == key){
                return tmp.value;
            }
            tmp = tmp.next;
        }
        return null;
    }

    public void remove(K key){

    }

    public void displayMap(){
        System.out.println(Arrays.toString(this.bucket));
    }

    private int getHashCode(K key) {
        return (17 * 37 + key.hashCode()) % BUCKET_CAPACITY;
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

