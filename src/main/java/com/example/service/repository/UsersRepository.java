package com.example.service.repository;

import com.example.service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersRepository extends JpaRepository<Book,Integer> {



}
