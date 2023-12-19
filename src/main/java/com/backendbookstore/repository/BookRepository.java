package com.backendbookstore.repository;

import com.backendbookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Integer> {
}
