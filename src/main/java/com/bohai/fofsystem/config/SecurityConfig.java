package com.bohai.fofsystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
            auth
                .inMemoryAuthentication()
                .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*http.csrf().disable()
                .formLogin()
                .loginPage("/login").defaultSuccessUrl("/home").failureUrl("/loginError")
                .and()
                .rememberMe().tokenValiditySeconds(2419200).key("fofKey")         //cookie中的jielongKey保存四周时间
                .and()
                .authorizeRequests()
                .antMatchers("/home").authenticated()
                .anyRequest().permitAll();*/

            http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/css/**","/js/**","/images/**").permitAll()   //静态资源不拦截
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").defaultSuccessUrl("/home").failureUrl("/loginError").permitAll()
                .and()
                .logout()
                .permitAll();

    }


}
