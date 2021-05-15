import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu2{


	public static void main(String args[]) {
		
		int dataSize = 1024 * 1024;
		
		Runtime runTime = Runtime.getRuntime();
		
		String linha = new String();
		String nomeArquivo = "C:\\Users\\Rosa\\eclipse-workspace\\Grafo\\src\\arquivo.txt";
		
		File arq = new File(nomeArquivo);
		
		if (arq.exists())
		{
			try
			{
				FileReader leitorArquivo = FileReader(nomeArquivo);
				BufferedReader bufferArquivo = new BufferedReader(leitorArquivo);
				
				while(true)
				{
					
					linha = bufferArquivo.readLine();
					
					if(linha == null) 
					{
						break;
					}
				}
				
			} catch (Exception e)
					{
				
					}
		}
		
	
		
		
		
		Scanner entrada = new Scanner (System.in);
		int num;
		
		int vert = 5;
		int arest = 5;
		
		Grafo g = new Grafo (vert, arest); 
		
		Matriz m = new Matriz(vert);

	    m.adcAresta(0, 1);    
	    m.adcAresta(0, 4);
	    m.adcAresta(1, 4);
	    m.adcAresta(4, 3);
	    m.adcAresta(4, 2);

		//--------------------------------
	    
	    Lista l = new Lista (vert);
	    int vertice=6;
	    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(vertice);

	    for (int i = 0; i < vertice; i++)
	      am.add(new ArrayList<Integer>());

	    // Add edges
	    adicionaAresta(am, 1, 2);
	    adicionaAresta(am, 1, 5);
	    adicionaAresta(am, 2, 5);
	    adicionaAresta(am, 5, 3);
	    adicionaAresta(am, 5, 4);
	    
	    //---------------------------------
	    
		
		System.out.println("Entre com um número para escolher um estilo de Grafo: \n1 - MATRIZ DE ADJACENCIA \n2 - LISTA DE ADJACENCIA");
		num = entrada.nextInt();
		
		switch (num)
		{
			case 1:
				System.out.println(m.toString());
				System.out.println("Memoria usada " + (runTime.totalMemory() - runTime.freeMemory()) / dataSize + " MB");
				break;
				
			case 2:
				l.printLista(am);
				System.out.println("\nMemoria usada " + (runTime.totalMemory() - runTime.freeMemory()) / dataSize + " MB");
				break;
			
			default :
				System.out.println("Número inválido");	
		}
		
		System.out.printf("\nO número de Vértices é: "+ g.getVert());
		System.out.println();
		System.out.printf("\nO número de Arestas é: "+ g.getAresta());
		System.out.println();		
		System.out.printf(g.toString());
		System.out.println();
		
		System.out.println("\nMemoria usada " + (runTime.totalMemory() - runTime.freeMemory()) / dataSize + " MB");
		
	}








	
	
	
	
	
	
	
	

private static FileReader FileReader(String nomeArquivo) {
		// TODO Auto-generated method stub
		return null;
	}

static void adicionaAresta(ArrayList<ArrayList<Integer>> am, int v, int a) {
    am.get(v).add(a);
    am.get(a).add(v);
  }}