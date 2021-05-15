// Adjascency List representation in Java

import java.util.*;

class Lista {
	
	private int vertice;

	public Lista(int vertice)
	{
		this.vertice = vertice;
	}

  // Add edge
  static void adicionaAresta(ArrayList<ArrayList<Integer>> am, int v, int a) {
    am.get(v).add(a);
    am.get(a).add(v);
  }


  // Print the graph
  static void printLista(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertice " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}