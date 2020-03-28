package boilerplate.healthcheck;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HealthCheckController.class)
public class HealthCheckControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
    private HealthCheckService healthCheckService;
	
	@Test
	public void healthcheck() throws Exception {
		HealthCheck healthCheck = new HealthCheck();
		given(healthCheckService.checkHealth()).willReturn(healthCheck);
	    this.mockMvc.perform(get("/healthcheck")).andExpect(status().isOk())
	        .andExpect(content().string(containsString("branch")));
	}
	
}
