package hello;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http2.Http2Protocol;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


/**
 *
 *
 *  curl --http2 -I  http://localhost:8080/
 *   curl  http://localhost:8080/
 */



public class Application {

   @RequestMapping("/")
   public String home() {
      return "Hello Docker World";
   }

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   /*
   @Bean
   public ConfigurableServletWebServerFactory tomcatCustomizer() {
      System.out.println("HTTP2");
      TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
      factory.addConnectorCustomizers(connector -> connector.addUpgradeProtocol(new Http2Protocol()));
      return factory;
   }

   */

}