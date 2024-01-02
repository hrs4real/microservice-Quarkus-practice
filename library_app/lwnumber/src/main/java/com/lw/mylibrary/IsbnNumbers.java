package com.lw.mylibrary;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.Instant;

public class IsbnNumbers {

    @JsonbProperty(value = "isbn_13")
    public String isbn13;
    @JsonbProperty(value = "isbn_10")
    public String isbn10;
    @JsonbTransient
    public Instant generationDate;

    @Override
    public String toString() {
        return "IsbnNumbers{" +
                "isbn13='" + isbn13 + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
