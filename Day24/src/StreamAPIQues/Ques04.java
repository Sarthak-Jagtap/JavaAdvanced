package StreamAPIQues;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 4. Problem Statement : Find Out:
 * 
 * 1. What are all the unique cities where the traders work?
 * 
 * 2. Find all traders from Pune and sort them by name.
 * 
 * 3. Return a string of all traders’ names sorted alphabetically.
 * 
 * 4. Are any traders based in Indore?
 */

class Trader {

    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // 1. Unique cities where traders work
    List<String> uniqueCities(List<Trader> list) {
        return list.stream()
                   .map(Trader::getCity)
                   .distinct()
                   .collect(Collectors.toList());
    }

    // 2. Traders from Pune sorted by name
    List<Trader> puneTradersSorted(List<Trader> list) {
        return list.stream()
                   .filter(t -> t.getCity().equalsIgnoreCase("Pune"))
                   .sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                   .collect(Collectors.toList());
    }

    // 3. All trader names sorted alphabetically (single string)
    String allTraderNames(List<Trader> list) {
        return list.stream()
                   .map(Trader::getName)
                   .sorted()
                   .collect(Collectors.joining(", "));
    }

    // 4. Check if any trader is based in Indore
    boolean isAnyTraderInIndore(List<Trader> list) {
        return list.stream()
                   .anyMatch(t -> t.getCity().equalsIgnoreCase("Indore"));
    }
}

public class Ques04 {

}
