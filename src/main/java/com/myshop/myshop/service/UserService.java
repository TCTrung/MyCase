package com.myshop.myshop.service;

import com.myshop.myshop.dto.request.UserCreationRequest;
import com.myshop.myshop.dto.request.UserUpdateRequest;
import com.myshop.myshop.dto.response.UserResponse;
import com.myshop.myshop.entity.User;
import com.myshop.myshop.exception.AppException;
import com.myshop.myshop.exception.ErrorCode;
import com.myshop.myshop.mapper.UserMapper;
import com.myshop.myshop.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
     UserRepository userRepository;

     UserMapper userMapper;

    public User createUser(UserCreationRequest request) {

        if (userRepository.existsByUsername(request.getUsername())) {
         throw new AppException(ErrorCode.USER_EXISTED);
        }

        User user = userMapper.toUser(request);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public UserResponse getUser(String id){
        return userMapper.toUserResponse(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found")));
    }

    public UserResponse updateUser(String id, UserUpdateRequest request){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        userMapper.updateUser(user,request);

        return userMapper.toUserResponse(userRepository.save(user));
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
