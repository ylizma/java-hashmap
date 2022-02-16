package hashmap;

/**
 * @author yamzil
 * @created 2022-02-15
 * @project map
 */
public class HashMapMain {
    public static void main(String[] args) {
        CustomHashMap<String, String> customHashMap = new CustomHashMap<>();
        customHashMap.put("name", "youssef");
        customHashMap.put("age", "22");
        customHashMap.put("age", "22");
        customHashMap.put("age", "22");
        customHashMap.put("age", "22");
        customHashMap.put("city", "temara");
        customHashMap.displayMap();
    }
}
