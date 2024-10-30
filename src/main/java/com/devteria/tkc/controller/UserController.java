package com.devteria.tkc.controller;

import com.devteria.tkc.dto.request.ApiResponse;
import com.devteria.tkc.dto.request.UserCreationRequest;
import com.devteria.tkc.dto.request.UserUpdateRequest;
import com.devteria.tkc.entity.User;
import com.devteria.tkc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody UserCreationRequest request){
     ApiResponse<User> apiResponse = new ApiResponse<>();
     apiResponse.setCode(1002);
     apiResponse.setMessage("tai khoan da tao thanh cong");
     apiResponse.setResult(userService.createUser(request));

        return apiResponse;
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been deleted";
    }
}
