import java.util.*;

public class AnagramGroups {

    public static void main(String[] args) {
        String[] words = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        List<List<String>> result = new ArrayList<>(anagramMap.values());
        System.out.println(result);
    }
}
