package com.farota.config.mybatis.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.farota.mybatis.prop.DatabaseProperties;

import lombok.Getter;
import lombok.Setter;


@ConfigurationProperties(prefix="spring.datasource.farota")
public class FarotaDatabaseProperties extends DatabaseProperties{
	
}
