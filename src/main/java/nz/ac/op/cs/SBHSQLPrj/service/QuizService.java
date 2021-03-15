package nz.ac.op.cs.SBHSQLPrj.service;

import nz.ac.op.cs.SBHSQLPrj.db.QuizRepository;
import nz.ac.op.cs.SBHSQLPrj.models.Quiz;
import nz.ac.op.cs.SBHSQLPrj.models.QuizUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private RestTemplate restTemplate;

    public void createQuiz(QuizUser quizUser, Integer amount){
        Quiz quiz = new Quiz();
        quiz.setStart_date("March 2021");
        quiz.setAmount(amount);
        quiz.setUser(quizUser);

        quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzs(){
        List<Quiz> quizzes = new ArrayList<Quiz>();
        quizRepository.findAll().forEach(quizzes::add);
        return quizzes;
        //return quizUsers;
    }

    public Quiz getQuiz(Long id) {
        return quizRepository.findById(id).get();
    }
}
