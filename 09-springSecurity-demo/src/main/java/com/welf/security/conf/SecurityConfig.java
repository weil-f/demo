package com.welf.security.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Package: com.welf.security.conf
 * Date: Created in 2020-05-19 10:18
 *
 * @Version: 1.0.0
 * @author: weilai
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        super.configure(http);
    }


    @Override
    public void configure(WebSecurity web) {
        super.configure(web);
    }
}
