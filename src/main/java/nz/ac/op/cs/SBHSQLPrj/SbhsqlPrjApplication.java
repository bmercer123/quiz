package nz.ac.op.cs.SBHSQLPrj;

import nz.ac.op.cs.SBHSQLPrj.service.QuestionService;
import nz.ac.op.cs.SBHSQLPrj.service.QuizService;
import nz.ac.op.cs.SBHSQLPrj.service.TaskService;
import nz.ac.op.cs.SBHSQLPrj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbhsqlPrjApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();
	}
	@Bean
	public QuestionService getQuestionService(){
		return new QuestionService();
	}
	@Bean
	public TaskService getTaskService(){
		return new TaskService();
	}
	@Bean
	public QuizService getQuizService(){
		return new QuizService();
	}
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SbhsqlPrjApplication.class, args);
	}

}
