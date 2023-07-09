package com.lock.controller;

import com.lock.service.LockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distribute")
public class LockController {
    private final LockService lockService;

    public LockController(LockService lockService) {
        this.lockService = lockService;
    }

    @GetMapping("/lock")
    public String lock(){
        return lockService.lock();
    }

    @GetMapping("/properLock")
    public String properLock(){
        return lockService.properLock();
    }

    @GetMapping("/failLock")
    public String failLock(){
        lockService.failLock();
        return "fail lock called, output in logs";
    }
}
