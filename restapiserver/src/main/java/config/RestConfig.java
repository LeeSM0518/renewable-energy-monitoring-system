package config;

import controller.DataController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.DataService;

@Configuration
@EnableWebMvc
public class RestConfig {

  @Bean
  public DataService dataService() {
    return new DataService();
  }

  @Bean
  public DataController dataController() {
    return new DataController();
  }

}
