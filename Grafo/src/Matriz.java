
// Adjacency Matrix representation in Java

public class Matriz {
  private boolean MatrizAdj[][];
  private int numVertices;

  // Inicia a matriz
  public Matriz(int numVertices) {
    this.numVertices = numVertices;
    MatrizAdj = new boolean[numVertices][numVertices];
  }

  // adiciona as arestas
  public void adcAresta(int i, int j) {
	  MatrizAdj[i][j] = true;
	  MatrizAdj[j][i] = true;
  }

  // Remove as arestas
  public void removeAresta(int i, int j) {
	  MatrizAdj[i][j] = false;
	  MatrizAdj[j][i] = false;
  }

  // Print the matriz
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < numVertices; i++) {
      s.append(i + ": ");
      for (boolean j : MatrizAdj[i]) {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

}
