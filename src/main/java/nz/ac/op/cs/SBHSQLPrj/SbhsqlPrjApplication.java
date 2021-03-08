package nz.ac.op.cs.SBHSQLPrj;

import nz.ac.op.cs.SBHSQLPrj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbhsqlPrjApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();

	}

	public static void main(String[] args) {
		SpringApplication.run(SbhsqlPrjApplication.class, args);
	}

}
