package se.andreas.persistence;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@NamedQuery(name = "person.findAll", query = "select p from Person p")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String pnr;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createDateTime;

    public Person() {
    }

    public Person(String name, String pnr, LocalDateTime createDateTime) {
        this.name = name;
        this.pnr = pnr;
        this.createDateTime = createDateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }
}
