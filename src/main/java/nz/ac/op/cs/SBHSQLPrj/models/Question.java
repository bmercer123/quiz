package nz.ac.op.cs.SBHSQLPrj.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {

    Long id;
    String quizID;

    String category;
    String type;
    String difficulty;
    String question;
    String correct_answer;
    //@ElementCollection // 1
    //@CollectionTable(name = "incorrect_answers", joinColumns = @JoinColumn(name = "id")) // 2
    List<String> incorrect_answers;

    public Question(){

    }

    public Question(Long id, String quizID, String category, String type, String difficulty, String question, String correct_answer, List<String> incorrect_answers) {
        this.id = id;
        this.quizID = quizID;
        this.category = category;
        this.type = type;
        this.difficulty = difficulty;
        this.question = question;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuizID() {
        return quizID;
    }

    public void setQuizID(String quizID) {
        this.quizID = quizID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
