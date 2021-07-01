package com.zillion.demo.controller;

import com.zillion.demo.DTO.User;
import com.zillion.demo.DTO.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//import javax.enterprise.inject.Produces;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/")
public class PalindromeController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public String getEmpty() {
        return "Ati";
    }

    @GetMapping(value = "/getUser")
//    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getUser() throws Exception {

        URI uri = URI.create("https://jsonplaceholder.typicode.com/users");
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//        ResponseEntity<List<User>> responseEntity =  restTemplate.getForObject(uri, User.class);
        ResponseEntity<List<UserResponse>> responseEntity = restTemplate.exchange(uri,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<UserResponse>>() {
                });
//            User users1 =  responseEntity.getBody();
        return ResponseEntity.status(HttpStatus.OK).body(responseEntity.getBody());
    }

    //costing
    @GetMapping("/getUser/{id}")
    public User getUserByID(@PathVariable int id) {
        URI uri = URI.create("https://jsonplaceholder.typicode.com/users");
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<User>>() {
                });
        User user = responseEntity.getBody().get(id);

        return user;
    }

}
