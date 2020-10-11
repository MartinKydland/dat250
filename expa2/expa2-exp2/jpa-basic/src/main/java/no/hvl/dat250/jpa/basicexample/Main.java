package no.hvl.dat250.jpa.basicexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select t from Bank t");
        List<Bank> bankList = q.getResultList();
        for (Bank bank : bankList) {
            System.out.println(bank);
        }
        System.out.println("Size: " + bankList.size());

        // create new bank
        em.getTransaction().begin();
        Bank bank = new Bank();
        bank.setName("This is a test");
        em.persist(bank);
        em.getTransaction().commit();


        em.close();
    }
}
