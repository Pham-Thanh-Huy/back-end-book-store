package com.backendbookstore.repository;

import com.backendbookstore.model.FavouriteBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "favourite-book")
public interface FavouriteBookRepository  extends JpaRepository<FavouriteBook, Integer> {
}
