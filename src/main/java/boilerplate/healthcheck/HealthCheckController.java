package boilerplate.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	
	private HealthCheckService healthCheckService;
	
	public HealthCheckController(HealthCheckService healthCheckService) {
		this.healthCheckService = healthCheckService;
	}
	
	@GetMapping("/healthcheck")
    public HealthCheck healthCheck() throws Exception {
        return healthCheckService.checkHealth();
    }
	
}
