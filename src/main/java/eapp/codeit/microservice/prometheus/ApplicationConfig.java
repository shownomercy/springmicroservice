/**
 * 
 */
package eapp.codeit.microservice.prometheus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

/**
 * 
 * 
 * @author Brad.Zhang
 */
@Configuration
@ComponentScan(basePackages = "eapp.codeit.microservice.prometheus")
public class ApplicationConfig
{
    @Bean
    public TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }
}
