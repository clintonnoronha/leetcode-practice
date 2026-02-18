package list;

import java.util.Optional;

public class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList<String> strList = new LinkedList<>();
        strList.add("Hello");
        strList.add("World");
        strList.remove("To The");
        System.out.println("Middle Element: " + Optional.ofNullable(strList.middle()).orElse(""));
        System.out.println(strList);
    }
}