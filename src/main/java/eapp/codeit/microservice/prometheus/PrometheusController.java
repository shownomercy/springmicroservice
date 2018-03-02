/**
 * 
 */
package eapp.codeit.microservice.prometheus;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author Brad.Zhang
 */
@RestController
public class PrometheusController
{
    @GetMapping(value = "/prometheus", produces = MediaType.TEXT_PLAIN_VALUE)
    public void getFile(HttpServletResponse response) throws IOException
    {
        FileSystemResource file = new FileSystemResource("c:/cygwin64/home/brad.zhang/newfile.txt");
        StreamUtils.copy(file.getInputStream(), response.getOutputStream());
        
    }
}
