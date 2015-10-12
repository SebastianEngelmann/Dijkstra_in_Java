import java.util.*;

class Dijkstra {
	// Methoden
	public static void computePaths(Vertex source){
		source.minDistance = 0;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(source);
		
		while(!vertexQueue.isEmpty()){
			Vertex u = vertexQueue.poll();
			
			// visit each edge exiting u
			for(Edge e: u.adjacencies){
				Vertex v = e.target;
				double weight = e.weight;
				double distanceThroughU = u.minDistance + weight;
				
				if(distanceThroughU < v.minDistance){
					vertexQueue.remove(v); // vertexQueue.remove(u) ?
					
					v.minDistance = distanceThroughU;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
		}
	}
	
	public static List<Vertex> getShortestPathTo(Vertex target){
		List<Vertex> path = new ArrayList<Vertex>();
		for(Vertex vertex = target; vertex != null; vertex = vertex.previous){
			path.add(vertex);
		}
		Collections.reverse(path);
		return path;
	}
}