package org.codejudge.sb.repo;

import java.util.List;

import org.codejudge.sb.model.Questions;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Questions, Integer>{

	List<Questions> findAllByQuiz(int quiz_id);
	
	

}
