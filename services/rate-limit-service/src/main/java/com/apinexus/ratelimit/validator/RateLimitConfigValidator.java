package com.apinexus.ratelimit.validator;

import org.springframework.stereotype.Component;

@Component
public class RateLimitConfigValidator {

    public boolean isValidRateLimit(int requestsPerMinute, int burstCapacity) {
        if (requestsPerMinute <= 0 || burstCapacity <= 0) {
            return false;
        }
        return burstCapacity >= requestsPerMinute / 60;
    }

    public boolean isValidQuota(long maxQuotaPerMonth) {
        return maxQuotaPerMonth > 0;
    }
}
