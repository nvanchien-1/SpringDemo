package com.devteria.tkc.service;

import com.devteria.tkc.dto.request.UserCreationRequest;
import com.devteria.tkc.dto.request.UserUpdateRequest;
import com.devteria.tkc.entity.User;
import com.devteria.tkc.repository.UserRepository;
import com.devteria.tkc.exception.AppException;
import com.devteria.tkc.exception.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request){
        User user = new User();


        if (userRepository.existsByUsername(request.getUsername()))
    throw new AppException(ErrorCode.User_Existed);
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        user.setDob(request.getDob());
      return  userRepository.save(user);

    }

    public User updateUser(String userId, UserUpdateRequest request) {
        User user = getUser(userId);

        user.setPassword(request.getPassword());
        user.setFname(request.getFname());

        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
