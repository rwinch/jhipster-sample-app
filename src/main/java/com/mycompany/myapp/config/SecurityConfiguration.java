package com.mycompany.myapp.config;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.RememberMeAuthenticationProvider;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.configuration.ObjectPostProcessorConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.web.accept.ContentNegotiationStrategy;

import com.mycompany.myapp.security.AjaxAuthenticationFailureHandler;
import com.mycompany.myapp.security.AjaxAuthenticationSuccessHandler;
import com.mycompany.myapp.security.AjaxLogoutSuccessHandler;
import com.mycompany.myapp.security.AuthoritiesConstants;
import com.mycompany.myapp.security.CustomPersistentRememberMeServices;
import com.mycompany.myapp.security.Http401UnauthorizedEntryPoint;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, jsr250Enabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication();
    }


//    @Autowired
//    @Override
//    public void setApplicationContext(ApplicationContext context) {
//        super.setApplicationContext(context);
//    }
//
//    @Autowired(required = false)
//    @Override
//    public void setTrustResolver(AuthenticationTrustResolver trustResolver) {
//        super.setTrustResolver(trustResolver);
//    }
//
//    @Autowired
//    @Override
//    public void setContentNegotationStrategy(
//            ContentNegotiationStrategy contentNegotiationStrategy) {
//        super.setContentNegotationStrategy(contentNegotiationStrategy);
//    }
//
//    @Autowired
//    @Override
//    public void setAuthenticationConfiguration(
//            AuthenticationConfiguration authenticationConfiguration) {
//        super.setAuthenticationConfiguration(authenticationConfiguration);
//    }



}
