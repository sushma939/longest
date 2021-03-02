import java.util.*;
public class Heighest {
public static String meeting(String s) {
        TreeMap<String, List> people = new TreeMap();
        String[] persons = s.split(";");
        for(String person : persons){
        String[]  fullNames = person.split(":");
        String firstName = fullNames[1].toUpperCase();
        String secondName =  fullNames[0].toUpperCase();
        if(  !people.keySet().contains( firstName )){
        List<String> names = new ArrayList<>();
        names.add(secondName);
        people.put(firstName, names);
        }else if (  people.keySet().contains( firstName) ){
        List<String> names = people.get(firstName );
        names.add(secondName);
        Collections.sort(names);
        people.put(firstName, names);
        }
        }
        System.out.println(people);
        StringBuilder result = new StringBuilder();
        Set<String> secondNames = people.keySet();
        for(String secondName : secondNames ){
        List<String> names = people.get(secondName);
        for( String name  : names ){
        result.append("(").append(secondName.toUpperCase()).append(", ").append(name.toUpperCase()).append(")");
        }
        }
        return result.toString();
        }
public static void main(String[] args) {
        String input = "Fred:Corwill;wilfred:Corwill;Barney:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill;";
        System.out.println(meeting(input));
        }
        }
