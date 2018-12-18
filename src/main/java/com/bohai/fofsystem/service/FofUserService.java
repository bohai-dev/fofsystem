package com.bohai.fofsystem.service;

import com.bohai.fofsystem.dao.FofUserMapper;
import com.bohai.fofsystem.domain.FofUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cxy on 2018/12/17
 */
@Service
public class FofUserService implements UserDetailsService {

    @Autowired
    FofUserMapper fofUserMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        FofUser fofUser=fofUserMapper.selectByUserName(userName);
        if (fofUser==null){
            throw new UsernameNotFoundException("User"+userName+"not found!");
        }
       // return User.withUsername(fofUser.getUserName()).password(passwordEncoder.encode(fofUser.getPassword())).roles(fofUser.getRole()).build();
        List<GrantedAuthority> auths=new ArrayList<>();
        auths.add(new SimpleGrantedAuthority(fofUser.getRole()));
        User user=new User(fofUser.getUserName(),passwordEncoder.encode(fofUser.getPassword()),auths);

        return user;
    }



}
