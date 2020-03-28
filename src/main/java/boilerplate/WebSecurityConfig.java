package boilerplate;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
    private String[] publicFolders = new String[] {
    		"/"
    		,"/csrf/**"
    		,"/v2/api-docs/**"
    		,"/webjars/**"
    		,"/swagger-resources/**"
    		,"/healthcheck"
    		,"/testconnection"
    		,"/swagger-ui.html"
    };
    		

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(publicFolders).permitAll()
			.and()
        	.csrf().disable()
        	.authorizeRequests()
            .anyRequest().authenticated()
            .and().httpBasic()
            ;
    }
	
}
