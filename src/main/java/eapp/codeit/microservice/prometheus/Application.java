/**
 * 
 */
package eapp.codeit.microservice.prometheus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * 
 * 
 * @author Brad.Zhang
 */
@SpringBootApplication
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner prometheusRunner(TaskExecutor executor)
    {
        return args -> {
            executor.execute(new PrometheusTask());
        };
    }
    
}
