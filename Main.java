import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karol");
        names.add("Roman");
        names.add("Adam");
        names.add("Zbyszek");
        names.add("Stefan");
        System.out.println(names);
        names.remove("Karol");
        System.out.println(names);

        Collections.sort(names);
        names.clear();
        System.out.println(names);

        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);

        names.add("Szczepan");
        names.add("Wincenty");
        names.add("Krotochwil");
        names.add("Koralgol");
        names.add("Brzetysław");
        Collections.sort(names);
        System.out.println(names);
        int pos = 2;
        String name = names.get(pos);
        System.out.println("Imię na pozycji: " + (pos+1) + " :" + name);

        boolean result = names.contains("Zbyszek");
        System.out.println("Czy lista zawiera imię Zbyszek: " + result);

        for(String element : names){
            System.out.println(element);
        }



    }
}