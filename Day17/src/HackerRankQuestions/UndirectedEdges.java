package HackerRankQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * Given a list of undirected edges between integer nodes, store only unique
 * edges where an edge from node u to node v is considered the same as from v to
 * u. Implement a class Edge with:
 * 
 * A constructor that stores nodes in increasing order (min, max),
 * 
 * Overridden equals() and hashCode() for duplicate detection,
 * 
 * A compareTo() method to sort edges by node values,
 * 
 * A toString() method that prints: From node <node1> To node <node2>.
 * 
 * Read n edges, store only the unique ones in a set, and output: unique edges
 * in sorted order.
 */

class Edge implements Comparable<Edge>{
	int v, u;

	Edge(int a, int b) {
		this.u = Math.min(a, b);
		this.v = Math.max(a, b);
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Edge) {
			Edge edge = (Edge) o;
			if(this.u == edge.u && this.v == edge.v);
		}
		
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(u,v);
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		
		if(this.u == o.u) {
			return this.v - o.v;
		}
		return this.u - o.u;
	}
	
	public String toString() {
		return "From node <"+this.u+"> To node <"+this.v+">.";
	}
}

public class UndirectedEdges {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of edges");
		int n = sc.nextInt();
		
		List<Edge> input = new ArrayList<Edge>();
		
		
		System.out.println("Enter u and v for Edges");

		for(int i = 0; i<n; i++) {
			
			System.out.print("u : ");
			int u = sc.nextInt();
			System.out.print("v : ");
			int v = sc.nextInt();
			
			Edge edge = new Edge(u,v);
			
			input.add(edge);
		}
		
		Set<Edge> output = new HashSet<Edge>(input);
		
		System.out.println(output);
		sc.close();
	}
}
