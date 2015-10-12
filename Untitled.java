	import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Vertex s = new Vertex("s");
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		
		s.adjacencies = new Edge[]{new Edge(a, 9), new Edge(c, 5)};
		a.adjacencies = new Edge[]{new Edge(b, 1), new Edge(c, 2)};
		b.adjacencies = new Edge[]{new Edge(d, 4)};
		c.adjacencies = new Edge[]{new Edge(a, 3), new Edge(d, 2)};
		d.adjacencies = new Edge[]{new Edge(s, 7), new Edge(b, 6)};
		
		Dijkstra.computePaths(s);
		System.out.println("Distance to " + d + ": " + d.minDistance);
		List<Vertex> path = Dijkstra.getShortestPathTo(d);
		System.out.println("Path: " + path);
		
	}
}