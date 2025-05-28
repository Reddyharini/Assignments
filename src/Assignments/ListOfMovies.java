package Assignments;

import java.util.LinkedList;
import java.util.List;

public class ListOfMovies {

public static void main(String[] args) {
List<String> Movies = new LinkedList<String>();
Movies.add("Dangal");
Movies.add("Baahubali2");
Movies.add("Pushpa");
Movies.add("KGF");
Movies.add("RRR");
System.out.println(Movies.get(2));
}

}