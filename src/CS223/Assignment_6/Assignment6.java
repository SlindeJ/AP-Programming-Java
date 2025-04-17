package CS223.Assignment_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6 {
	// DO NOT MODIFY
	private static final double[][] adjMatrix = new double[51][51];
	private static final String[] cities = new String[51];

	public static void main(String[] args) {
		fileToAdjacencyMatrix("distances.csv");

		dijkstra(cityToIndex("Portland ME"), cityToIndex("Seattle WA"));
		System.out.println();

		dijkstra(cityToIndex("Jacksonville FL"), cityToIndex("Seattle WA"));
		System.out.println();

		dijkstra(cityToIndex("Boston MA"), cityToIndex("Los Angeles CA"));
		System.out.println();

		dijkstra(cityToIndex("New York City NY"), cityToIndex("Los Angeles CA"));
		System.out.println();

		dijkstra(cityToIndex("Chicago IL"), cityToIndex("Honolulu HI"));
		System.out.println();

		dijkstra(cityToIndex("Nashville TN"), cityToIndex("Milwaukee WI"));
		System.out.println();

		dijkstra(cityToIndex("Milwaukee WI"), cityToIndex("Anchorage AK"));
		System.out.println();

		dijkstra(cityToIndex("Charlotte NC"), cityToIndex("Houston TX"));
		System.out.println();

		dijkstra(cityToIndex("Albuquerque NM"), cityToIndex("Portland OR"));
		System.out.println();

		dijkstra(cityToIndex("Philadelphia PA"), cityToIndex("Las Vegas NV"));
		System.out.println();
	}
	// END DO NOT MODIFY

	private static void fileToAdjacencyMatrix(String path) {
		File file = new File(path);
		try {
			Scanner reader = new Scanner(file);
			reader.nextLine();		// don't need the identifiers
			for (int i = 0; i < 51; i++) {
				String city = reader.nextLine();
				String[] c = city.split(",");
				cities[i] = c[0];
				for (int j = 0; j < 51; j++) {
					double eee = Double.parseDouble(c[j+1]);
					adjMatrix[i][j] = eee;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	private static int cityToIndex(String city) {
		for (int i = 0; i < 51; i++) {
			if (city.equals(cities[i])) {
				return i;
			}
		}
		return -1;
	}

	private static void dijkstra(int s, int t) {
		Double[] dist = new Double[51];
		for (int i = 0; i < 51; i++) {
			dist[i] = Double.POSITIVE_INFINITY;
		}
		dist[s] = 0.0;
		ArrayList<Integer> open = new ArrayList(5);
		open.add(s);
		boolean[] closed = new boolean[51];
		//closed[s] = true;
		int[] parent = new int[51];
		for (int i = 0; i < 51; i++) {
			parent[i] = -1;
		}
		while (!open.isEmpty()) {
			int smallestVertex = 0;
			for (int i = 0; i < open.size(); i++) {
				if (dist[open.get(i)] < dist[smallestVertex]) {
					smallestVertex = i;
				}
			}
			open.remove(smallestVertex);
			closed[smallestVertex] = true;
			for (int v = 0; v < 51; v++) {
				if (adjMatrix[smallestVertex][v] == -1) {
					continue;
				}
				if (closed[v]) {
					continue;
				}
				Double len = dist[smallestVertex] + adjMatrix[smallestVertex][v];
				if (len < dist[v]) {
					dist[v] = len;
					parent[v] = smallestVertex;
					if (!open.contains(v)) {
						open.add(v);
					}
				}
				if (dist[t] == Double.POSITIVE_INFINITY) {
					System.out.println("No path from cities" + s + " to cities" + t);
				}
			}
		}
		ArrayList<Integer> path = new ArrayList(5);
		int curr = t;
		while (curr != -1) {
			path.add(curr);
			curr = parent[curr];
			System.out.println("Path from cities" + s + " to cities" + t);
		}
		for (int i = path.size()-1; i > 0; i--) {
			System.out.print(cities[i]);
		}
		System.out.println("Total Distance: " + dist[t] + " miles");
	}
}
