package com.farota.config.mybatis.mapper;

import java.io.IOException;

import javax.sql.DataSource;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.farota.mybatis.mapper.FarotaMyBatisMapper;
import com.farota.mybatis.mapper.MyBatisMapperConfig;




@Configuration
@MapperScan(basePackages = {
		 "net.pmhtech.broadcast.log.dao.mybatis",
		
}, annotationClass = FarotaMyBatisMapper.class, sqlSessionFactoryRef = "farotaSqlSessionFactory")
public class FarotaMyBatisMapperConfig extends MyBatisMapperConfig{
	
	public static final String TYPE_ALIASES_PACKAGE = "net.pmhtech";
	public static final String CONFIG_LOCATION_PATH = "mybatis-config.xml";
	public static final String MAPPER_LOCATIONS_PATH = "/sqlmap/**/*.xml";
	     
	 protected void configureSqlSessionFactory(SqlSessionFactoryBean sessionFactoryBean, DataSource dataSource) throws IOException {
	        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
	        sessionFactoryBean.setDataSource(dataSource);
	        sessionFactoryBean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
	        sessionFactoryBean.setConfigLocation(pathResolver.getResource(CONFIG_LOCATION_PATH));
	        sessionFactoryBean.setMapperLocations(pathResolver.getResources(MAPPER_LOCATIONS_PATH));
	    }
	
	@Primary
	@Bean
	public SqlSessionFactory farotaSqlSessionFactory(@Qualifier("farotaMyBatisDataSource") DataSource farotaMyBatisDataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		this.configureSqlSessionFactory(sessionFactoryBean, farotaMyBatisDataSource);
		return sessionFactoryBean.getObject();
	}
}
