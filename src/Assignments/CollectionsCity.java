package Assignments;

import java.util.ArrayList;
import java.util.List;

public class CollectionsCity {

public static void main(String[] args) {
List<String> CityNames = new ArrayList<String>();
CityNames.add("Bangalore");
CityNames.add("Mumbai");
CityNames.add("Delhi");
CityNames.add("Hyderabad");
CityNames.add("Jaipur");

List <Integer> cityAreas = new ArrayList<Integer>();

cityAreas.add(575300);
cityAreas.add(522700);
cityAreas.add(353010);
cityAreas.add(263953);
cityAreas.add(182000);

int combinedArea = cityAreas.get(2) + cityAreas.get(3);

System.out.println(combinedArea);

System.out.println("Array size is : " + CityNames.size());
System.out.println(CityNames);


}

}
