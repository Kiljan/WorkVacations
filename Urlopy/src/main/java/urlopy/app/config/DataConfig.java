package urlopy.app.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataConfig {

  @Bean
  public DataSource dataSource() {
	  DriverManagerDataSource ds = new DriverManagerDataSource();
      ds.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
      ds.setUrl("jdbc:mysql://mqsql1:3306/urlopy?useUnicode=yes&characterEncoding=UTF-8");
      ds.setUsername("root");
      ds.setPassword("j6w1o08954iWQ!@");
      return ds;
      
  }
  

}