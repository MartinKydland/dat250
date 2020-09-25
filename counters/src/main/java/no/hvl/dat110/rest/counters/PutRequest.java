package no.hvl.dat110.rest.counters;

import okhttp3.*;

import java.io.IOException;

public class PutRequest {

	public static final MediaType JSON
    = MediaType.parse("application/json; charset=utf-8");
	
	public static void main(String[] args) {

		Todos todos = new Todos("This is a summary", "This is a description");
		
		OkHttpClient client = new OkHttpClient();

		RequestBody body = RequestBody.create(JSON, todos.toJson());
		
		Request request = new Request.Builder().url("http://localhost:8080/todos").put(body).build();

		System.out.println(request.toString());

		try (Response response = client.newCall(request).execute()) {
			System.out.println(response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
