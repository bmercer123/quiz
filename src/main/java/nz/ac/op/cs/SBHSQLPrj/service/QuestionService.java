package nz.ac.op.cs.SBHSQLPrj.service;

import nz.ac.op.cs.SBHSQLPrj.db.QuestionRepository;
import nz.ac.op.cs.SBHSQLPrj.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    /*@Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        List<Question> questions = new ArrayList<Question>();
        questionRepository.findAll().forEach(questions::add);
        return questions;
        //return quizUsers;
    }

    public Question getTask(Long id){
        return questionRepository.findById(id).get();

    }

    public void addQuestion(Question question){
        questionRepository.save(question);
        //quizUsers.add(user);
    }

    public void updateQuestion(Question question){
        questionRepository.save(question);
    }
    public void deleteQuestion(Long id){
        questionRepository.deleteById(id);
    }

     */
}
