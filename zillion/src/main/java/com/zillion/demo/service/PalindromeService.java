package com.zillion.demo.service;

import com.zillion.demo.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PalindromeService {

//    @Autowired
//    RestTemplate restTemplate;
//
//
//    public List<User> getUser() {
//
////        List<User> users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User.class);
//        ResponseEntity<List<User>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/users",
//                HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
//                });
//        List<User> users1 = responseEntity.getBody();
//
//        return users1;
//    }

//      public
//    ObjectMapper objectMapper = new ObjectMapper();
//    String url = "https://jsonplaceholder.typicode.com/users";






}
