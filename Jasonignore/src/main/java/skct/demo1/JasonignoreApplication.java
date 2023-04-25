package skct.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JasonignoreApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JasonignoreApplication.class, args);
		
		jason jn=new jason(25,"Krithik",22);
		ObjectMapper obj=new ObjectMapper();
		String str=obj.writeValueAsString(jn);
		System.out.println(str);

	}

}
