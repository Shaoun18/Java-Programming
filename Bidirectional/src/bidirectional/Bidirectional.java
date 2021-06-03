package bidirectional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

 class BidirectionalSearch {

    Queue<Integer> queue_start = new LinkedList();
    Queue<Integer> queue_destination = new LinkedList();

    int graph_matrix[][];
    int cities;
    int roads;
    boolean[] visited_start;
    boolean[] visited_destination;
    String city_list[];
    String start;
    
    String destination;
    int parent_start[];
    int parent_destination[];

    String visited_node_for_start[];
    String visited_node_for_desti[];
    int sCounter = 0;
    int dCounter = 0;
    int cityValueToAssigned;
    String collisionCity;
  
    public void setGraph()  throws Exception{
        FileReader fileReader = new FileReader("sample.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String stringLine = bufferedReader.readLine();

        String lineArray[] = stringLine.split(", ");
        cities = Integer.parseInt(lineArray[0]);
        roads = Integer.parseInt(lineArray[1]);

        graph_matrix = new int[cities][cities];
        city_list = new String[cities];
        visited_start = new boolean[cities];
        visited_destination = new boolean[cities];
        parent_start = new int[cities];
        parent_destination = new int[cities];

        visited_node_for_start = new String[cities];
        visited_node_for_desti = new String[cities];

        start = bufferedReader.readLine();
        destination = bufferedReader.readLine();
 
        cityValueToAssigned = 0;
        for (int i = 0; i < roads; i++) {
            stringLine = bufferedReader.readLine();
            lineArray = stringLine.split(", ");

            int row = cityValueToAssigned;
            int cityValue = checkCityValueAssigned(lineArray[0]);

            if (cityValue < 0) {//cityValue not assigned yet
                city_list[cityValueToAssigned] = lineArray[0];
                cityValueToAssigned++;
            } else {//assigned
                row = cityValue;
            }

            int col = cityValueToAssigned;
            cityValue = checkCityValueAssigned(lineArray[1]);

            if (cityValue < 0) {
                city_list[cityValueToAssigned] = lineArray[1];
                cityValueToAssigned++;
            } else {
                col = cityValue;
            }

            graph_matrix[row][col] = 1;
            graph_matrix[col][row] = 1;
        }
    }

    public void Bidirectional_Search() {
        int startLoc = checkCityValueAssigned(start);
        int destiLoc = checkCityValueAssigned(destination);

        queue_start.add(startLoc);
        visited_start[startLoc] = true;

        queue_destination.add(destiLoc);
        visited_destination[destiLoc] = true;

        visited_node_for_start[0] = start;
        visited_node_for_desti[0] = destination;

        Bidirectional_Search_visit();
        if (collisionCity != null) {
            printShortestPath();
        } else {
            System.out.println("No direct route found");
        }

    }

    public void Bidirectional_Search_visit() {
        boolean collisionChecker = false;

        while (!queue_start.isEmpty() && !queue_destination.isEmpty() && !collisionChecker) {
            int fromQ_start = queue_start.poll();
            int fromQ_desti = queue_destination.poll();

            for (int i = 0; i < cities; i++) {
                if (!visited_start[i] & graph_matrix[fromQ_start][i] > 0) {
                    queue_start.add(i);
                    
                    visited_start[i] = true;
                    parent_start[i] = fromQ_start;

                    visited_node_for_start[sCounter++] = city_list[i];
                }
            }
            for (int i = 0; i < cities; i++) {
                if (!visited_destination[i] & graph_matrix[fromQ_desti][i] > 0) {
                    queue_destination.add(i);
                   
                    visited_destination[i] = true;
                    parent_destination[i] = fromQ_desti;

                    visited_node_for_desti[dCounter++] = city_list[i];
                }
            }
 
            for (int i = 0; i < sCounter; i++) {
                for (int j = 0; j < dCounter; j++) {
                    if (visited_node_for_start[i] != null && visited_node_for_desti[j] != null) {
                        if (visited_node_for_start[i].equals(visited_node_for_desti[j])) {
                            collisionChecker = true;
                            collisionCity = visited_node_for_start[i];
                            break;
                        }
                    }
                    if (collisionChecker) {
                        break;
                    }
                }
            }
        }
    }

    public int checkCityValueAssigned(String city_name) {
        for (int i = 0; i < cityValueToAssigned; i++) {
            if (city_list[i] != null) {
                if (city_list[i].equals(city_name)) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void printShortestPath() {
        int collisionVal = 0;
        int length = 0;

        for (int i = 0; i < cities; i++) {
            if (city_list[i].equals(collisionCity)) {
                collisionVal = i;
                break;
            }
        }
        int destinationVal = 0;
        for (int i = 0; i < cities; i++) {
            if (city_list[i].equals(destination)) {
                destinationVal = i;
                break;
            }
        }

        int cVal = collisionVal;

        String box[] = new String[cities];

        int i = 0;
        cVal = collisionVal;
        while (cVal != 0) {
            box[i] = city_list[cVal];
            cVal = parent_start[cVal];
            i++;
        }
        box[i] = city_list[0];

        System.out.print("Route: ");
        for (int j = i; j >= 0; j--) {
            System.out.print(box[j] + "->");
            length++;
        }
        while (collisionVal != destinationVal) {

            collisionVal = parent_destination[collisionVal];
            length++;

            if (collisionVal == destinationVal) {
                System.out.println(city_list[collisionVal]);
            } else {
                System.out.print(city_list[collisionVal] + "->");
            }

        }
        System.out.println("Length: " + (length - 1));
        System.out.println("Direction: Forward City: " + collisionCity+" #Roads(start to collision): "+(i));
    }

    public void print() {
        System.out.println("Assigned values to cities:");
        for (int i = 0; i < cities; i++) {
            System.out.println(city_list[i] + " " + i);
        }

    }

}
public class Bidirectional {

    public static void main(String[] args) {
        BidirectionalSearch map=new BidirectionalSearch();
        map.setGraph();
        map.Bidirectional_Search();
    }
    
}
