package com.example.service.resource;

import com.example.service.model.Book;
import com.example.service.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController

public class UserResource {

    @Autowired
    public UsersRepository usersRepository;


    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {

        return usersRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books/{bookId}")
    public Optional<Book> getBook(@PathVariable("bookId") int bookId) {

        return usersRepository.findById(bookId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public List<Book> addBook(@RequestBody final Book book) {
        usersRepository.save(book);
        return usersRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{bookId}")
    public List<Book> removeBook(@PathVariable("bookId") int bookId) {
        usersRepository.deleteById(bookId);
        return usersRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{bookId}")
    public List<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {

        book.setBookId(bookId);
        usersRepository.save(book);
        return usersRepository.findAll();

    }





}
