package com.authentication;

import com.authentication.Repositories.RoleRepository;
import com.authentication.Repositories.UserRepository;
import com.authentication.models.Role;
import com.authentication.models.User;
import com.authentication.security.repository.JpaRegisteredClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;
import org.springframework.test.annotation.Commit;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class SpringSecurityClientUpdateTest {
    @Autowired
    private JpaRegisteredClientRepository jpaRegisteredClientRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Test
//    @Commit
    void storeRegisteredClientIntoDB(){
//        RegisteredClient oidcClient = RegisteredClient.withId(UUID.randomUUID().toString())
//                .clientId("oidc-client")
//                .clientSecret("$2a$16$vg8genLo5bwZp48tQXy3xOP4W3zDZdMtLyh5G/ZPJnjLjldGi55AO")
//                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
//                .redirectUri("https://oauth.pstmn.io/v1/callback")
//                .postLogoutRedirectUri("https://oauth.pstmn.io/v1/callback")
//                .scope(OidcScopes.OPENID)
//                .scope(OidcScopes.PROFILE)
//                .scope("ADMIN")
//                .scope("STUDENT")
//                .scope("MENTOR")
//                .clientIdIssuedAt(Instant.now())
//                .clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
//                .build();
//
//        jpaRegisteredClientRepository.save(oidcClient);
    }

    @Test
//    @Commit
    void addRolesToUser(){
//        String email = "rahularagi108@gmail.com";
//        Optional<User> userOptional = userRepository.findByEmail(email);
//        if(userOptional.isPresent()){
//            User user = userOptional.get();
//            Role role1 = new Role();
//            role1.setName("ADMIN");
//            role1.setDeleted(false);
//            Role role2 = new Role();
//            role2.setName("MENTOR");
//            role2.setDeleted(false);
//            Role role3 = new Role();
//            role3.setName("INSTRUCTOR");
//            role3.setDeleted(false);
//            List<Role> roles = new ArrayList<>();
//            roles.add(role1);
//            roles.add(role2);
//            roles.add(role3);
//            user.setRoles(roles);
//            for(Role role:roles){
//                roleRepository.save(role);
//            }
//
//            userRepository.save(user);
//        }
    }
}
