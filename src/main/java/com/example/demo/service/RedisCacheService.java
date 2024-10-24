package com.example.demo.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    private final RedisTemplate<String, String> redisTemplate;

    public RedisCacheService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public String getData(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public String setData(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return value;
    }

}
