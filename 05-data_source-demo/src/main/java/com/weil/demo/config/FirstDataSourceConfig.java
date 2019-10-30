package com.weil.demo.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Package: com.weil.demo.config
 * Date: Created in 2019-10-29 22:50
 * 第一个数据源的配置
 * @Version: 1.0.0
 * @author: weilai
 */
@Configuration
@MapperScan(basePackages = "{com.weil.demo.first}")
public class FirstDataSourceConfig {

	@Bean(name = "masterDataSource")
	@ConfigurationProperties(prefix = "first.spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}



	@Bean(name = "masterSqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("masterDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setTypeAliasesPackage("com.weil.demo.first");
		factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));

		//添加PageHelper插件
		Interceptor interceptor = new PageInterceptor();
		Properties properties = new Properties();
		//数据库
		properties.setProperty("helperDialect", "mysql");
		//是否将参数offset作为PageNum使用
		properties.setProperty("offsetAsPageNum", "true");
		//是否进行count查询
		properties.setProperty("rowBoundsWithCount", "true");
		//是否分页合理化
		properties.setProperty("reasonable", "false");
		interceptor.setProperties(properties);
		factoryBean.setPlugins(new Interceptor[] {interceptor});


		return factoryBean.getObject();
	}


	@Bean(name = "masterTransactionManager")
	public DataSourceTransactionManager transactionManager(@Qualifier("masterDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "masterSqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("masterSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
