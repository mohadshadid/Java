import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Mr. Moon", "It is a real cold moon...");
        map.put("Dog Day", "Doooog day, it's a real...");
        map.put("For whom the bell", "Look at the sky and...");
        map.put("LA LA", "La la, it's a real...");
        System.out.println(map.get("Mr. Moon"));

        for(String key : map.keySet()){
            // n Java, the keySet() method is a method of the HashMap class that returns a Set of all the keys in the HashMap.
            System.out.println(String.format("Track: %s - Lyrics: %s", key, map.get(key)));
        }
    }
}




// import java.util.Set;
// public class HashMapFun {
//     public static void main(String[] args) {
//         // Create a new HashMap object with keys and values of type String
//         HashMap<String, String> userMap = new HashMap<String, String>();

//         // Add three key-value pairs to the map using the put() method
//         userMap.put("nninja@codingdojo.com", "Nancy Ninja");
//         userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
//         userMap.put("wwizard@codingdojo.com", "Walter Wizard");

//         // Get the set of keys from the map using the keySet() method
//         Set<String> keys = userMap.keySet();

//         // Iterate over the keys using a for-each loop
//         for(String key : keys) {
//             // Print the current key to the console
//             System.out.println(key);

//             // Get the value corresponding to the current key from the map using the get() method
//             // and print it to the console
//             System.out.println(userMap.get(key));    
//         }
//     }
// }
