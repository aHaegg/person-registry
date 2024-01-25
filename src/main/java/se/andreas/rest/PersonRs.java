package se.andreas.rest;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import se.andreas.persistence.PersonDao;

import java.time.LocalDateTime;
import java.util.List;

@Path("person")
public class PersonRs {

    @Inject
    private PersonDao personDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return personDao.getPersons().stream().map(this::toPerson).toList();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response storePerson(Person person) {
        personDao.storePerson(toDbPerson(person));
        return Response.status(Response.Status.CREATED).build();
    }

    private se.andreas.persistence.Person toDbPerson(Person person) {
        return new se.andreas.persistence.Person(person.name(), person.pnr(), LocalDateTime.now());
    }

    private Person toPerson(se.andreas.persistence.Person person) {
        return new Person(person.getName(), person.getPnr(), person.getCreateDateTime());
    }
}
