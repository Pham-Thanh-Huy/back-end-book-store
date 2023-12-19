package com.backendbookstore.repository;

import com.backendbookstore.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "order-details")
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}
