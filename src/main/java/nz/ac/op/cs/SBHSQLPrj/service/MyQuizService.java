package nz.ac.op.cs.SBHSQLPrj.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nz.ac.op.cs.SBHSQLPrj.db.MyQuizRepository;
import nz.ac.op.cs.SBHSQLPrj.db.QuizRepository;
import nz.ac.op.cs.SBHSQLPrj.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyQuizService {
    @Autowired
    private MyQuizRepository myQuizRepository;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private RestTemplate restTemplate;

    public void createQuiz(QuizUser quizUser, Integer amount) throws JsonProcessingException {
        MyQuiz quiz = new MyQuiz();
        quiz.setStart_date("March 2021");
        quiz.setAmount(amount);
        quiz.setUser(quizUser);
        List<Question> questions = getQuestionsList(amount);
        questionService.addQuestions(questions);
        quiz.setQuestions(questions);

        myQuizRepository.save(quiz);
    }

    public List<MyQuiz> getAllQuiz(){
        List<MyQuiz> quiz = new ArrayList<MyQuiz>();
        myQuizRepository.findAll().forEach(quiz::add);
        return quiz;
        //return quizUsers;
    }

    public MyQuiz getQuiz(Long id) {
        return myQuizRepository.findById(id).get();
    }

    public List<Question> getQuestionsList(Integer amount) throws JsonProcessingException {

        String url ="https://opentdb.com/api.php?amount="+amount +"&category=9&difficulty=easy&type=multiple";
        String jsonRes = restTemplate.getForObject(url,String.class);
        System.out.println(jsonRes);
        ObjectMapper mapper = new ObjectMapper();
        QuizResponse quizResponse = mapper.readValue(jsonRes,QuizResponse.class);
        System.out.println(quizResponse.getResults().size());
        //return  JSON List
        return quizResponse.getResults();
    }

}
