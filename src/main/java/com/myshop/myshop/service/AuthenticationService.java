package com.myshop.myshop.service;

import com.myshop.myshop.dto.request.AuthenticationRequest;
import com.myshop.myshop.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationService {
    UserRepository userRepository;
    boolean authenticate (AuthenticationRequest request){
        var user = userRepository.f
    }
}
