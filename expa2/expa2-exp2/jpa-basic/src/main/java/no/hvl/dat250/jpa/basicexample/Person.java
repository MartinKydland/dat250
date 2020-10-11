package no.hvl.dat250.jpa.basicexample;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    private Address adress;

    @OneToMany
    private CreditCard creditCard;

    public String getSummary() {
        return name;
    }

    public void setSummary(String summary) {
        this.name = summary;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}
