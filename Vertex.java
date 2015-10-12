import java.util.Collection;

class Vertex implements Comparable<Vertex> {
	// Attribute
	public final String name;
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;
	
	// Konstruktor
	public Vertex(String argName){
		this.name = argName;
	}
	
	// Methoden
	public String toString(){
		return name;
	}
	
	public int compareTo(Vertex other){
		return Double.compare(minDistance, other.minDistance);
	}
}