package boilerplate.healthcheck;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HealthCheckService {
	
	public HealthCheck checkHealth() throws JsonParseException, JsonMappingException, IOException {
		HealthCheck healthCheck = new HealthCheck();
		InputStream inputStream = this.getClass().getResourceAsStream("/git.properties");
		Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
		String content = scanner.hasNext() ? scanner.next() : "";
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = mapper.readValue(content, Map.class);
		healthCheck.branch = map.get("git.branch");
		healthCheck.gitVersion = map.get("git.commit.id.abbrev");
		return healthCheck;
	}
}
