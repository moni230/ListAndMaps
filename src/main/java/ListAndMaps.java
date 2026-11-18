import java.util.*;

public class ListAndMaps {
    static void main(String[] args) {

     // ArrayList exercises
        List<String> data = new ArrayList<>();

        List<String> languages = Arrays.asList("Java", "Springboot", "SQL", "JDBC", "HTML", "CSS", "Javascript");

        // iterate all the values from the list.
        for(String lan :languages){
            System.out.println(lan);

        }

        // to get the particular value from the list.
        System.out.println("Second language from the list: "+ languages.get(2));

        // HashMap

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "John");
        map.put(102, "Jeni");
        map.put(103, "James");
        map.put(104, "Jack");
        map.put(105, "Jasmine");

        Set<Map.Entry<Integer, String>> mapdata = map.entrySet();

        for(Map.Entry<Integer, String> value : mapdata){

            System.out.println(value);

        }

        List<HashMap<String, Object>> studentslist = new ArrayList<>();

        HashMap<String, Object>  students1= new HashMap<>();
        students1.put("Semester", 1);
        students1.put("id", 101);
        students1.put("Name", "John");
        students1.put("Tamil", 99);
        students1.put("English", 93);
        students1.put("Maths", 87);
        students1.put("Science", 98);
        students1.put("Social science", 98);

        studentslist.add(students1);

        HashMap<String, Object>  students2= new HashMap<>();
        students2.put("Semester", 2);
        students2.put("id", 102);
        students2.put("Name", "Jeni");
        students2.put("Tamil", 98);
        students2.put("English", 93);
        students2.put("Maths", 97);
        students2.put("Science", 98);
        students2.put("Social science", 98);

        studentslist.add(students2);

        HashMap<String, Object> students3= new HashMap<>();
        students3.put("Semester", 3);
        students3.put("id", 103);
        students3.put("Name", "Sam");
        students3.put("Tamil", 99);
        students3.put("English", 93);
        students3.put("Maths", 96);
        students3.put("Science", 100);
        students3.put("Social science", 98);

        studentslist.add(students3);


        studentslist.stream().filter(s-> s.get("Semester").equals(1)).forEach(s-> System.out.println("Student Tamil mark: "+s.get("Tamil")));
    }
}
