package com.nicolas.apispringwithvps.services;

import com.nicolas.apispringwithvps.domain.Book;
import com.nicolas.apispringwithvps.feign.BookClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookService {

    private final BookClient bookClient;

    BookService(BookClient client){
        this.bookClient = client;
    }

    @GetMapping
    public List<Book> getBooksFromLibrary() {
        return this.bookClient.getBooksFromLibrary();
    }
}
