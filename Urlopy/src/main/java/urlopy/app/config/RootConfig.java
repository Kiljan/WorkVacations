package urlopy.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"urlopy.app.config", "urlopy.app.dao", "urlopy.app.model"}, excludeFilters= {
		@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
})
public class RootConfig {

}