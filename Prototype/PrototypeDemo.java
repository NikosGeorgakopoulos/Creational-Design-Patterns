import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		/**
		 * Shallow Copy Example of a prototype 
		 * The value cloned will contain the same Record object
		 * This method has a lot of pitfalls since any change to the
		 * Copied object will affect the original record as well
		  
		 */
//		
//		String sql = "Select * from movies where title = ?";
//		
//		List<String> parameters = new ArrayList<>();
//		
//		parameters.add("Star Wars");
//		
//		Record record = new Record();
//		
//		Statement firstStatement = new Statement(sql,parameters,record);
//		
//		System.out.println(firstStatement.getSql());
//		System.out.println(firstStatement.getParameters());
//		System.out.println(firstStatement.getRecord());
//		
//		Statement secondStatement = firstStatement.clone();
//		
//		System.out.println(secondStatement.getSql());
//		System.out.println(secondStatement.getParameters());
//		System.out.println(secondStatement.getRecord());
		
		
		/**
		 * Deep Copy example of a Prototype
		 */
		
		
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
	}
}
