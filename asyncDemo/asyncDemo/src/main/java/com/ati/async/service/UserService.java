package com.ati.async.service;

import com.ati.async.exception.CustomException;
import com.ati.async.model.Test;
import com.ati.async.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Test> sendData(MultipartFile tests) throws CustomException {
        List<Test> saved = userRepository.saveAll(parsCSVFile(tests));
        return saved;
    }

    public List<Test> getData() throws CustomException {
        try {
            return userRepository.findAll();
        } catch (RuntimeException e) {
            throw new CustomException("Data not find..");
        }
    }

    private List<Test> parsCSVFile(MultipartFile file) throws CustomException {
        List<Test> tests = new ArrayList<>();
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(file.getInputStream()));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] data = line.split(",");
                Test t = new Test();
                t.setFirstName(data[0]);
                t.setLastName(data[1]);
                t.setEmail(data[2]);
                t.setGender(data[3]);
                t.setIpAddress(data[4]);
                tests.add(t);
            }
        } catch (IOException e) {
            throw new CustomException("CSV file parsing exception....", e);
        }
        return tests;
    }

}
