package org.codejudge.sb.service;

import java.util.List;
import java.util.Optional;

import org.codejudge.sb.model.Questions;
import org.codejudge.sb.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;

	public Questions save(Questions question) {
		return questionRepository.save(question);
	}

	public Optional<Questions> fetchQuestionByID(int question_id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(question_id);
	}

	public List<Questions> findAllQuestionByQuizId(int quiz_id) {
		
		return questionRepository.findAllByQuiz(quiz_id);
	}

}
