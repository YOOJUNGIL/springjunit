package com.myalley.junit.controller;

import com.myalley.junit.dao.dto.CustUser;
import com.myalley.junit.dao.service.CustUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustUserController {

    @Autowired
    private CustUserService custUserService;

    @GetMapping("/users")
    public List<CustUser> users() {
        return custUserService.getCustUserList();
    }

    @GetMapping("/save")
    public int save() {
        return custUserService.save(null);
    }

}
