package com.code.sbootwdc.security;


import com.code.sbootwdc.filter.CustomAutheniticationFilter;
import com.code.sbootwdc.filter.CustomAuthorizaFilter;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration @EnableWebSecurity @RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
//                formLogin().disable();
        http.cors().and();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.cors().and().authorizeRequests().antMatchers("/signin/**").permitAll();

//        http.authorizeRequests().antMatchers(HttpMethod.GET,"/login").permitAll().anyRequest().authenticated();
//        http
//                .httpBasic()
//                .and()
//                .authorizeRequests()
////                .antMatchers("/login").permitAll()
//                .anyRequest().authenticated();
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/exercices").hasAnyAuthority("admin","responsable");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/exercice/{id}").hasAnyAuthority("admin","responsable");
        http.authorizeRequests().antMatchers(HttpMethod.POST, "/createExercice").hasAnyAuthority("admin");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/updateExercice").hasAnyAuthority("admin");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/deleteExercice/{id}").hasAnyAuthority("admin");

        http.authorizeRequests().antMatchers(HttpMethod.GET, "/activites").hasAnyAuthority("ROLE_RESPONSABLE");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/activite/{id}").hasAnyAuthority("admin","responsable");
        http.authorizeRequests().antMatchers(HttpMethod.POST, "/createactivite").hasAnyAuthority("admin");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/updateactivite").hasAnyAuthority("responsable");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/deleteactivite/{id}").hasAnyAuthority("responsable");


      http.authorizeRequests().anyRequest().authenticated();
        http.addFilter(new CustomAutheniticationFilter(authenticationManagerBean()));
        http.addFilterBefore(new CustomAuthorizaFilter(), UsernamePasswordAuthenticationFilter.class);

    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

//    @Bean
//    CorsConfigurationSource corsConfigurationSource()
//    {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//        configuration.setAllowedMethods(Arrays.asList("GET","POST"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
    return source;
}

}
