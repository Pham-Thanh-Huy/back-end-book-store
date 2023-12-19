package com.backendbookstore.repository;

import com.backendbookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "order")
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
