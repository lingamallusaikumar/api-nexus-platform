package com.apinexus.registry.features.notificationtemplate;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationTemplateService {
    private final NotificationTemplateRepository repository;
    public NotificationTemplateService(NotificationTemplateRepository repository) { this.repository = repository; }
    public List<NotificationTemplate> findAll() { return repository.findAll(); }
    public NotificationTemplate save(NotificationTemplate entity) { return repository.save(entity); }
    public void complexBusinessLogic1() { /* Implementation */ }
    public void complexBusinessLogic2() { /* Implementation */ }
    public void complexBusinessLogic3() { /* Implementation */ }
    public void complexBusinessLogic4() { /* Implementation */ }
}
