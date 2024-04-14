package com.myshop.myshop.mapper;

import com.myshop.myshop.dto.request.UserCreationRequest;
import com.myshop.myshop.dto.request.UserUpdateRequest;
import com.myshop.myshop.dto.response.UserResponse;
import com.myshop.myshop.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
