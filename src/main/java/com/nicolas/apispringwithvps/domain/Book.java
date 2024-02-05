package com.nicolas.apispringwithvps.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private String title;
    private String author;
    private String area;
    private String image;
    private String publisher;
    @JsonProperty("year_of_publication")
    private String yearOfPublish;
    private String isbn;
}
