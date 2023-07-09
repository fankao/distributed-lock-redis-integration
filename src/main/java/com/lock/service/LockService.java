package com.lock.service;

public interface LockService {
    String lock();
    void failLock();
    String properLock();
}
