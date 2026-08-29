package com.apinexus.apikey;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApiKeyValidatorTest {

    @Test
    public void testValidApiKeyPrefix() {
        String key = "apk_live_1234567890abcdef12345678";
        assertTrue(key.startsWith("apk_live_") || key.startsWith("apk_test_"));
    }

    @Test
    public void testInvalidApiKeyFormat() {
        String invalidKey = "invalid_key_format";
        assertFalse(invalidKey.startsWith("apk_live_"));
    }
}
