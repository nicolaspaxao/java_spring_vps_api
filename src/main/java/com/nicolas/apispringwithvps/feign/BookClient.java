package com.nicolas.apispringwithvps.feign;

import com.nicolas.apispringwithvps.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-api", url = "https://books-api-spring-vps.s3.amazonaws.com")
public interface BookClient {
    @GetMapping("/books.json")
    List<Book> getBooksFromLibrary();
}
