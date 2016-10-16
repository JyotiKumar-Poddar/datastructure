package algo.graph;

//A structure to represent an adjacency list node
class AdjListNode{
	int dest;
	AdjListNode next; 
}
//A structure to represent an adjacency list
class AdjList{
	AdjListNode head;
}

//A structure to represent a graph. A graph is an array of adjacency lists.
//Size of array will be V (number of vertices in graph)
class Graph{
	int V;
	AdjList[] array;
	
	// Method to create a new adjacency list node
	public AdjListNode newAdjListNode(int dest) {
		AdjListNode newNode = new AdjListNode();
		newNode.dest = dest;
		newNode.next = null;
		return newNode;
	}
	
	// Method that creates a graph of V vertices
	public Graph createGraph(Graph graph, int V) {
		graph.V = V;
		// Create an array of adjacency lists. Size of array will be V
		graph.array = new AdjList[V];
		// Initialize each adjacency list as empty by making head as NULL
		int i;
		for (i = 0; i < V; ++i){
			AdjList head = new AdjList();
			head.head= new AdjListNode();
			graph.array[i] = head;
		}
			
		return graph;
	}
	
	
	// Adds an edge to an undirected graph
	void addEdge(Graph graph, int src, int dest) {
		// Add an edge from src to dest. A new node is added to the adjacency
		// list of src. The node is added at the begining
		AdjListNode newNode = newAdjListNode(dest);
		newNode.next = graph.array[src].head;
		graph.array[src].head = newNode;
		// Since graph is undirected, add an edge from dest to src also
		newNode = newAdjListNode(src);
		newNode.next = graph.array[dest].head;
		graph.array[dest].head = newNode;
	}
	
	// Method to print the adjacency list representation of graph
	void printGraph(Graph graph) {
		int v;
		for (v = 0; v < graph.V; ++v) {
			AdjListNode pCrawl = graph.array[v].head;
			System.out.printf("\n Adjacency list of vertex %d\n head ", v);
			while (pCrawl.next != null) {
				System.out.printf("-> %d", pCrawl.dest);
				pCrawl = pCrawl.next;
			}
			System.out.printf("\n");
		}
	}
}


public class GraphAdjacencyList {
	public static void main(String[] args) {
		// create the graph given in above figure
		int V = 5;
		Graph graph = new Graph();
				
		graph.createGraph(graph,V);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 4);
		// print the adjacency list representation of the above graph
		graph.printGraph(graph);
	}
}
