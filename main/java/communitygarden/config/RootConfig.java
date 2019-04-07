package communitygarden.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"communitygarden"}, 
<<<<<<< HEAD
			   excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
=======
				excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
public class RootConfig {

}
