package se.andreas.rest;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDateTime;

public record Person(
        @Schema(example = "Sam Johnsson") String name,
        @Schema(example = "20121212-1212") String pnr,
        LocalDateTime createDateTime) {
}
