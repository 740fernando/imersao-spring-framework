import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.aula.jpa.User;
import com.example.demo.aula.jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Fernando","fao","123"));
		
		repository.findAll().stream().map(element -> element.toString());
	}

}
