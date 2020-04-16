package com.demo.manydatasource.config;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @description:
 * @create: 2020-03-30 17:20
 **/
@MapperScan(basePackages = "com.demo.manydatasource.member.mapper",sqlSessionFactoryRef = "memberSqlSessionFactory")
@Configuration
public class MemberDataSourceConfig {

    /**
     * 将会员db注册到容器中
     *
     * @return
     */
    @Bean(name = "memberDataSource")
    public DataSource memberDataSource(MemberConfig memberConfig) throws SQLException {
        //创建mysqlxDataSource
        MysqlXADataSource mysqlXADataSource=new MysqlXADataSource();
        mysqlXADataSource.setUrl(memberConfig.getUrl());
        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXADataSource.setPassword(memberConfig.getPassWord());
        mysqlXADataSource.setUser(memberConfig.getUserName());
        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
        //将本地事务注册到atomiko全局事务
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXADataSource);
        xaDataSource.setUniqueResourceName(memberConfig.getUniqueResourceName());
        xaDataSource.setMinPoolSize(memberConfig.getMinPoolSize());
        xaDataSource.setMaxPoolSize(memberConfig.getMaxPoolSize());
        xaDataSource.setMaxLifetime(memberConfig.getMaxLifetime());
        xaDataSource.setBorrowConnectionTimeout(memberConfig.getBorrowConnectionTimeout());
        xaDataSource.setLoginTimeout(memberConfig.getLoginTimeout());
        xaDataSource.setMaintenanceInterval(memberConfig.getMaintenanceInterval());
        xaDataSource.setMaxIdleTime(memberConfig.getMaxIdleTime());
        xaDataSource.setTestQuery(memberConfig.getTestQuery());
        return xaDataSource;
    }

    /**
     * 将会员sqlSessionFactory注册到容器
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean("memberSqlSessionFactory")
    public SqlSessionFactory memberSqlSessionFactory(@Qualifier("memberDataSource") DataSource dataSource) throws  Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

//    /**
//     * 创建会员管理器
//     * @param dataSource
//     * @return
//     * @throws Exception
//     */
//    @Bean("memberTransactionManager")
//    public DataSourceTransactionManager memberTransactionManager(@Qualifier("memberDataSource") DataSource dataSource)
//            throws Exception{
//        return new DataSourceTransactionManager(dataSource);
//    }

    /**
     * 创建会员模板
     * @param sqlSessionFactory
     * @return
     * @throws Exception
     */
    @Bean("memberSqlSessionTemplate")
    public SqlSessionTemplate memberSqlSessionTemplate(@Qualifier("memberSqlSessionFactory") SqlSessionFactory sqlSessionFactory)
            throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
