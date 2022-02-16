package hashmap;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author yamzil
 * @created 2022-02-16
 * @project hashmap
 */
public class CustomHashMapTest {

    @Test
    public void testStringGenerator(){
        System.out.println(generateString(100));
    }


    public String generateString(int size){
        int start = 97;
        int end = 122;
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int rand = (int) (Math.random() * (end - start) + start);
            char next = (char)rand;
            string.append(next);
        }
        return string.toString();
    }
}