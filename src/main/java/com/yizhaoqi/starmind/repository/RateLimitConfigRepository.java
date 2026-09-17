package com.yizhaoqi.starmind.repository;

import com.yizhaoqi.starmind.model.RateLimitConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateLimitConfigRepository extends JpaRepository<RateLimitConfig, String> {
}
