/*(Geography: estimate areas)
Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from www.gps-data-team.com/map/
and compute the estimated area enclosed by these four cities.
(Hint: Use the formula in Programming Exercise  4.2 to compute the distance between two cities.
Divide the polygon into two triangles and use the formula in Programming Exercise  2.19 to compute the area of a triangle.) */
package chapter4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class V4_3 {
    public static void main(String[] args) {
        List<City> cities=getCities();
        Deque<City> cities1=cities.stream().collect(Collectors.toCollection(ArrayDeque::new));
        for (City city:cities) {
            for (City otherCity:cities1) {
                if (!city.equals(otherCity)){
                    System.out.println(city.getName()+" and "+otherCity.getName()+" have "+V4_2.computeDistance(city,otherCity));
                    cities1.poll();
                }

            }

        }
    }
    private static List<City> getCities(){
        return List.of(new City("ANTALYA",36.892635,30.702945),new City("İSTANBUL",41.008018,28.977793),new City("ANKARA",39.927970,32.860324));
    }
}
class City{
    private String name;
    private double latitude;
    private double longitude;

    public City(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
