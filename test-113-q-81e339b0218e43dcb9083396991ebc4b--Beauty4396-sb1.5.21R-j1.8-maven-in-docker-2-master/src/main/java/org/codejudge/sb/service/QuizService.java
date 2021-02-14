package org.codejudge.sb.service;

import org.codejudge.sb.model.Quiz;
import org.codejudge.sb.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Optional<Quiz> fetchQuizById(int quizId) {
        return quizRepository.findById(quizId);
    }

    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
