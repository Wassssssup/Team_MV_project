package kr.co.ezenac.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.ezenac.mapper.MovieMapper;

//Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// Controller 어노테이션이 세팅되어 있는 클래스를 Controller로 등록한다.
@EnableWebMvc
//스캔할 패키지를 지정한다.
@ComponentScan("kr.co.ezenac.controller")
@ComponentScan("kr.co.ezenac.service")
@ComponentScan("kr.co.ezenac.dao")

@PropertySource("/WEB-INF/properties/db.properties")

public class ServletAppContext implements WebMvcConfigurer{
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;
	
	//xml을 이용할 때 servlet-context의 앞뒤 반환하는 역할을 하는 부분.
	//Controller의 메서드가 반환하는 jsp의 이름 앞뒤에 확장자를 붙여주도록 한다.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/",".jsp");
	}
	
	//xml을 이용할 때 servlet-context의 정적 파일(이미지,사운드,동영상,JS,CSS 등등) 경로 세팅하는 부분
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	// 데이터베이스 접속 정보를 관리하는 Bean
		@Bean
		public BasicDataSource dataSource() {
			BasicDataSource source = new BasicDataSource();
			source.setDriverClassName(db_classname);
			source.setUrl(db_url);
			source.setUsername(db_username);
			source.setPassword(db_password);
			
			return source;
		}
		
		// 쿼리문과 접속 정보를 관리하는 객체
		@Bean
		public SqlSessionFactory factory(BasicDataSource source) throws Exception{
			SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
			factoryBean.setDataSource(source);
			SqlSessionFactory factory = factoryBean.getObject();
			return factory;
		}
		
		// 쿼리문 실행을 위한 객체(Mapper 관리)
		@Bean
		public MapperFactoryBean<MovieMapper> getBoardMapper(SqlSessionFactory factory) throws Exception{
			MapperFactoryBean<MovieMapper> factoryBean = new MapperFactoryBean<MovieMapper>(MovieMapper.class);
			factoryBean.setSqlSessionFactory(factory);
			return factoryBean;
		}
		
		@Bean
		public MapperFactoryBean<MovieMapper> getTopMenuMapper(SqlSessionFactory factory) throws Exception{
			MapperFactoryBean<MovieMapper> factoryBean = new MapperFactoryBean<MovieMapper>(MovieMapper.class);
			factoryBean.setSqlSessionFactory(factory);
			return factoryBean;
		}
		
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			WebMvcConfigurer.super.addInterceptors(registry);
			
			//TopMenuInterceptor topMenuInterceptor = new TopMenuInterceptor(topMenuService);
			
			//InterceptorRegistration reg1 = registry.addInterceptor(topMenuInterceptor);
			//reg1.addPathPatterns("/**");
		}
		
		@Bean
		public static org.springframework.context.support.PropertySourcesPlaceholderConfigurer PropertySourcesPlaceholderConfigurer() {
			return new org.springframework.context.support.PropertySourcesPlaceholderConfigurer();
		}
		
		@Bean
		public ReloadableResourceBundleMessageSource messageSource() {
			ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
			res.setBasenames("/WEB-INF/properties/error_message");
			return res;
		}
	
}

