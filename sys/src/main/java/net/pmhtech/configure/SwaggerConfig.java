package net.pmhtech.configure;


import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@EnableSwagger
public class SwaggerConfig {
 
    @Autowired private SpringSwaggerConfig springSwaggerConfig;
 
    @Bean
    public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(new ApiInfo("spring-boot-swagger", null, null, null, null, null))
                .useDefaultResponseMessages(false)
                .includePatterns("/sys/codes");
    }
}