package no.hvl.dat110.rest.counters;

import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
	
	static Todos todos = null;
	
	public static void main(String[] args) {

		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}

		todos = new Todos();
		
		after((req, res) -> {
  		  res.type("application/json");
  		});
		
		get("/hello", (req, res) -> "Hello World!");
		
        get("/todos", (req, res) -> todos.toJson());
               
        put("/todos", (req,res) -> {
        
        	Gson gson = new Gson();
        	
        	todos = gson.fromJson(req.body(), Todos.class);
        
            return todos.toJson();
        	
        });
    }
    
}
