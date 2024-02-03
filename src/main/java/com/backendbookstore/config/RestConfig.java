package com.backendbookstore.config;

import com.backendbookstore.model.Book;
import com.backendbookstore.model.Category;
import com.backendbookstore.model.Image;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:3000";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] blockMethod = {
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.DELETE,
                HttpMethod.PATCH
        };
        blockHttpMethod(Category.class, config, blockMethod);
        config.exposeIdsFor(Book.class);
        config.exposeIdsFor(Image.class);

        // Gọi hàm corsConfig để áp dụng cấu hình CORS
        corsConfig(cors);
    }

    private void blockHttpMethod(Class c, RepositoryRestConfiguration config, HttpMethod[] methods) {
        config.getExposureConfiguration().forDomainType(c)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(methods))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(methods));
    }

    // CORS configuration
    public void corsConfig(CorsRegistry cors) {
        cors.addMapping("/**").allowedOrigins(url)
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
