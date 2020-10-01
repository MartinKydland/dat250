package no.hvl.dat110.rest.counters;

import com.google.gson.Gson;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String summary;
    private String description;

    public Todos(){
        this.summary = "empty summary";
        this.description = "empty description";
    }
    public Todos(String summary, String description){
        this.summary = summary;
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    static Todos fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Todos.class);
    }
}