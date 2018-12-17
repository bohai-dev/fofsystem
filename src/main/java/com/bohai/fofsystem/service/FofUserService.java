package com.bohai.fofsystem.service;

import com.bohai.fofsystem.dao.FofUserMapper;
import com.bohai.fofsystem.domain.FofUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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
        return User.withUsername(fofUser.getUserName()).password(passwordEncoder.encode(fofUser.getPassword())).roles(fofUser.getRole()).build();
    }
}
