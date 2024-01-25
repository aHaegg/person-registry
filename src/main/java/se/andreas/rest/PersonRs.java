package se.andreas.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.util.List;

@Path("person")
public class PersonRs {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return List.of(new Person("Sam Johnsson", "20121212-1212", LocalDateTime.now()));
    }
}
