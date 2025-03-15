package com.authentication.services;

import com.authentication.Repositories.TokenRepository;
import com.authentication.Repositories.UserRepository;
import com.authentication.models.Token;
import com.authentication.models.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private TokenRepository tokenRepository;

    public UserService(UserRepository userRepository,BCryptPasswordEncoder bCryptPasswordEncoder,TokenRepository tokenRepository){
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.tokenRepository = tokenRepository;
    }
    public User SignUp(String fullName,String email,String password){
        User user =new User();
        user.setName(fullName);
        user.setEmail(email);
        user.setHashedPassword(bCryptPasswordEncoder.encode(password));
        return userRepository.save(user);
    }

    public Token login(String email,String password){
        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isEmpty()){
            // throw user not exists exception
            return null;
        }
        User user = userOptional.get();
        if(!bCryptPasswordEncoder.matches(password,user.getHashedPassword())){
            //throw password not matching exception
            return null;
        }
        LocalDate localDate = LocalDate.now();
        LocalDate thirtyDaysLater = localDate.plusDays(30);
        Date expiryDate = Date.from(thirtyDaysLater.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Token token = new Token();
        token.setUser(user);
        token.setExpiryAt(expiryDate);
        token.setValue(RandomStringUtils.randomAlphanumeric(128));
        Token savedToken = tokenRepository.save(token);

        return savedToken;
    }

    public void logout(String token){
        Optional<Token> token1 = tokenRepository.findByValueAndIsDeleted(token,false);
        if(token1.isEmpty()){
            // throw TokenNotExistsOrAlreadyExpiredException();
            return;
        }
        Token tkn = token1.get();
        tkn.setDeleted(true);
        tokenRepository.save(tkn);
    }

    public User validateToken(String token){
        Optional<Token> token1 = tokenRepository.findByValueAndIsDeletedAndExpiryAtGreaterThan(token,false,new Date());
        if(token1.isEmpty()){
            return null;
        }
        return token1.get().getUser();
    }
}
