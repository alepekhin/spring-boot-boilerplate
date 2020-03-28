package boilerplate.healthcheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class HealthCheckServiceTest {
	
	@Test
	public void checkHealth() throws Exception {
		HealthCheckService healthCheckService = new HealthCheckService();
		HealthCheck healthCheck = healthCheckService.checkHealth();
		assertEquals("master", healthCheck.branch);
		assertEquals("ea28f0f", healthCheck.gitVersion);
	}

}
