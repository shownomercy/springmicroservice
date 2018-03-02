/**
 * 
 */
package eapp.codeit.microservice.prometheus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author Brad.Zhang
 */
@Component
@Scope("prototype")
public class PrometheusTask extends Thread
{
//    @Value(value = "classpath:static/prometheus.metrics")
//    private Resource res; 
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run()
    {
        File file = new File("c:/cygwin64/home/brad.zhang/newfile.txt");
        String content = "This is the text content";
        while(true)
        {
//            try(FileOutputStream fop = new FileOutputStream(file))
//            {
//                byte[] contentInBytes = content.getBytes();
//                fop.write(contentInBytes);
//                fop.flush();
//            }
            try {
                Files.write(Paths.get("c:/cygwin64/home/brad.zhang/newfile.txt"), "the text\n".getBytes(), StandardOpenOption.APPEND);
            }
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
            System.out.println("prometheus task is running: ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
