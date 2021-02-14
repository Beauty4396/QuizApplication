package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;

import org.codejudge.sb.model.Questions;
import org.codejudge.sb.model.Quiz;
import org.codejudge.sb.service.QuestionService;
import org.codejudge.sb.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private QuizService quizService;
    
    @Autowired 
    private QuestionService questionService;

    @ApiOperation("This is the hello world api")
    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }


    @GetMapping("/quiz/{quiz_id}")
    public Optional<Quiz> fetchQuizById(@PathVariable int quiz_id){
        return quizService.fetchQuizById(quiz_id);
    }


    @PostMapping("/quiz")
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.save(quiz);
    }
    
    @GetMapping("/questions/{question_id}")
    public Optional<Questions> fetchQuestionById(@PathVariable int question_id)
    {
    	return questionService.fetchQuestionByID(question_id);
    }
    
    @PostMapping("/questions")
    public Questions createQuestion(@RequestBody Questions question)
    {
    	return questionService.save(question);
    }
    
    @GetMapping("/quiz-questions/{quiz_id}")
    public List<Questions> getAllQuestions(@PathVariable int quiz_id)
    {
    	return questionService.findAllQuestionByQuizId(quiz_id);
    }
}
