package com.spring.carsharing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountService {

    @Autowired
    AccountService accountService;

    public void setAccountService(AccountService accountService){
        this.accountService= accountService;
    }
}
