package com.apinexus.notification.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AlertListener {
    private static final Logger logger = LoggerFactory.getLogger(AlertListener.class);

    @KafkaListener(topics = "api.security.alert", groupId = "notification-group")
    public void listenSecurityAlerts(String message) {
        logger.info("Received Security Alert for Notification: {}", message);
        // Process and send email/websocket notification
    }

    @KafkaListener(topics = "api.latency.detected", groupId = "notification-group")
    public void listenLatencyAlerts(String message) {
        logger.info("Received Latency Alert for Notification: {}", message);
        // Process and send email/websocket notification
    }
}

