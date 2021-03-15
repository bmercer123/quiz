package nz.ac.op.cs.SBHSQLPrj.resources;

import nz.ac.op.cs.SBHSQLPrj.models.Quiz;
import nz.ac.op.cs.SBHSQLPrj.models.QuizUser;
import nz.ac.op.cs.SBHSQLPrj.models.Task;
import nz.ac.op.cs.SBHSQLPrj.service.QuizService;
import nz.ac.op.cs.SBHSQLPrj.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/quiz")
    public List<Quiz> getQuiz(){
        return quizService.getAllQuizzs();
    }
    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable Long id)
    {
        return quizService.getQuiz(id);
    }
    @PostMapping("/quiz")
    public void addQuiz(@RequestBody QuizUser quizUser){
        quizService.createQuiz(quizUser, 10);

    }
}
