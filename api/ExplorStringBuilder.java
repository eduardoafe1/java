package api;

public class ExplorStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Jooj"); 
		sb.append(", ").append("Velber");
		sb.append(", ").append("Lalao");
		
		sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(2, 7));
		System.out.println(sb.toString());
		
		
	}

}
