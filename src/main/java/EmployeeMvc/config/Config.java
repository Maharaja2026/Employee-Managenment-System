package EmployeeMvc.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "EmployeeMvc")
public class Config
{
	@Bean
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("maharaja").createEntityManager();
	}
	
//	@Bean
//	public EntityTransaction getEntityTransaction()
//	{
//		return Persistence.createEntityManagerFactory("maharaja").createEntityManager().getTransaction();
//	}
}
