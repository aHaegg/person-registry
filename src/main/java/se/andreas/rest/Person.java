package se.andreas.rest;

import java.time.LocalDateTime;

public record Person(String name, String pnr, LocalDateTime createDateTime) {
}
