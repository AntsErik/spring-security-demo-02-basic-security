package ee.praktika.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure( AuthenticationManagerBuilder auth ) throws Exception{

        //add users to in memory authentication

        UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
            .withUser( users.username( "Liliana" ).password( "MTG247" ).roles( "PLAINSWALKER" ) )
            .withUser( users.username( "Ugin" ).password( "MTG247" ).roles( "DRAGON" ) )
            .withUser( users.username( "Suntail Hawk" ).password( "MTG247" ).roles( "CREATURE" ) );

    }

}
