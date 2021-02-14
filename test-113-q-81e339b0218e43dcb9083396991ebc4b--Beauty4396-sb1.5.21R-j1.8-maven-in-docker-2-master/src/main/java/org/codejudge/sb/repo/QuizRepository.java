package org.codejudge.sb.repo;

import org.codejudge.sb.model.Quiz;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {

//    Optional<Quiz> findById(String id);
}
