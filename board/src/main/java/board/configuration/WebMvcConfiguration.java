package board.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import board.board.interceptor.LoggerInterceptor;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggerInterceptor());
	}
	
//	@Bean
//	public Filter characterEncodingFilter() {
//		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//		characterEncodingFilter.setEncoding("UTF-8");
//		characterEncodingFilter.setForceEncoding(true);
//		
//		return characterEncodingFilter;
//	}
//	
//	@Bean
//	public HttpMessageConverter<String> responseBodyConverter() {
//		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
//	}
}
