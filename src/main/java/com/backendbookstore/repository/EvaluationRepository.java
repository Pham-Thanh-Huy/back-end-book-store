package com.backendbookstore.repository;

import com.backendbookstore.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "evaluation")
public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {
}
