package com.vidyo.moderatorapp;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories
public class ModeratorAppApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ModeratorAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ModeratorAppApplication.class, args);
	}
	
//	@Bean
//	FilterRegistrationBean<CorsFilter> simpleCorsFilter() {  
//		logger.info("simpleCorsFilter start");
//	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
//	    CorsConfiguration config = new CorsConfiguration();  
//	    config.setAllowCredentials(true); 
//	    config.setAllowedOrigins(Collections.singletonList("*")); 
//	    config.setAllowedMethods(Collections.singletonList("*"));  
//	    config.setAllowedHeaders(Collections.singletonList("*"));  
//	    source.registerCorsConfiguration("/**", config);  
//	    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
//	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);  
//	    logger.info("simpleCorsFilter end");
//	    return bean;  
//	}   

//	@Bean
//	WebMvcConfigurer corsConfigurer() {
//		logger.info("corsConfigurer start");
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins("*");
//				logger.info("addCorsMappings start");
//			}
//		};
//	}
	
//	@Bean
//	CorsConfigurationSource corsConfigurationSource() {
//		final CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(Arrays.asList("*"));
//		configuration.addAllowedOriginPattern("*");
//		configuration.setAllowedMethods(List.of(RequestMethod.HEAD.name(), RequestMethod.GET.name(),
//				RequestMethod.POST.name(), RequestMethod.PUT.name(), RequestMethod.DELETE.name(),
//				RequestMethod.PATCH.name(), RequestMethod.OPTIONS.name()));
//		configuration.setAllowCredentials(true);
//		configuration.addAllowedHeader("*");
//		configuration.setMaxAge(60 * 60L);
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		return source;
//	}
}
