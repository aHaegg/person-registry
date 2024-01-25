package se.andreas.persistence;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@RequestScoped
public class PersonDao {
    @PersistenceContext(name = "jpa-unit")
    private EntityManager em;

    public List<Person> getPersons() {
        return em.createNamedQuery("person.findAll", Person.class).getResultList();
    }

    public void storePerson(Person person) {
        em.persist(person);
    }
}
