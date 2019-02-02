package com.farota.config.mybatis.datasource;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.farota.config.mybatis.prop.FarotaDatabaseProperties;
import com.farota.mybatis.datasource.MyBatisDataSourceConfig;


@Configuration
@EnableConfigurationProperties(FarotaDatabaseProperties.class)
public class FarotaMyBatisDataSourceConfig extends MyBatisDataSourceConfig{

	
	@Autowired
	private FarotaDatabaseProperties dbProperties; 
	
	@Override
	@Primary
    @Bean(name = "farotaMyBatisDataSource", destroyMethod = "close")
	public DataSource dataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();
		this.configureDataSource(basicDataSource, dbProperties);
		return basicDataSource;
	}
	
	@Bean
    public PlatformTransactionManager transactionManager(@Qualifier("farotaMyBatisDataSource") DataSource farotaMyBatisDataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(farotaMyBatisDataSource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }

}
