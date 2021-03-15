package nz.ac.op.cs.SBHSQLPrj.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import nz.ac.op.cs.SBHSQLPrj.models.MyQuiz;
import nz.ac.op.cs.SBHSQLPrj.models.Quiz;
import nz.ac.op.cs.SBHSQLPrj.models.QuizUser;
import nz.ac.op.cs.SBHSQLPrj.service.MyQuizService;
import nz.ac.op.cs.SBHSQLPrj.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyQuizController {
    @Autowired
    private MyQuizService myQuizService;

    @GetMapping("/myquiz")
    public List<MyQuiz> getQuiz(){
        return myQuizService.getAllQuiz();
    }
    @GetMapping("/myquiz/{id}")
    public MyQuiz getQuiz(@PathVariable Long id)
    {
        return myQuizService.getQuiz(id);
    }
    @PostMapping("/myquiz")
    public void addQuiz(@RequestBody QuizUser quizUser) throws JsonProcessingException {
        myQuizService.createQuiz(quizUser,10);

    }
}
