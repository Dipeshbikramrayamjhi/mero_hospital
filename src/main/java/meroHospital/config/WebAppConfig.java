package meroHospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="meroHospital")
public class WebAppConfig implements WebMvcConfigurer {
	
	

	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/Views/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry resgistry)
	{
		resgistry.addResourceHandler("/assests/**")
		         .addResourceLocations("/assest/")
		         .setCachePeriod(3600);
		resgistry.addResourceHandler("/resources/**")
        		.addResourceLocations("/resource/")
        		.setCachePeriod(3600);
		resgistry.addResourceHandler("/image/**")
		.addResourceLocations("file:///C:\\Users\\dipes\\OneDrive\\Documents\\meroHospital\\")
		.setCachePeriod(3600);
	}
	@Bean
	public CommonsMultipartResolver multipartResolver()
	{
		CommonsMultipartResolver mr = new CommonsMultipartResolver();
		mr.setMaxUploadSize(120000000l);
		 
		return mr ;
	}
	
	
}
