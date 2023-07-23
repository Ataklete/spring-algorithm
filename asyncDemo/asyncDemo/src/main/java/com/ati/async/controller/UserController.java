package com.ati.async.controller;

import com.ati.async.exception.CustomException;
import com.ati.async.model.Test;
import com.ati.async.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/test", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = "application/json")
    public ResponseEntity storeData(@RequestParam(value = "files") MultipartFile[] files) throws CustomException {
        for (MultipartFile f : files) {
            userService.sendData(f);
        }
        return ResponseEntity.status(HttpStatus.OK).body("stored successfully.....");
    }

    @GetMapping(value = "/get", produces = "application/json")
    public ResponseEntity retrieveData() throws CustomException {
        List<Test> data = userService.getData();
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
}
