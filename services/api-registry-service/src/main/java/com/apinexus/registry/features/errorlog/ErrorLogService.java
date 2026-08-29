package com.apinexus.registry.features.errorlog;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ErrorLogService {
    private final ErrorLogRepository repository;
    public ErrorLogService(ErrorLogRepository repository) { this.repository = repository; }
    public List<ErrorLog> findAll() { return repository.findAll(); }
    public ErrorLog save(ErrorLog entity) { return repository.save(entity); }
    public void complexBusinessLogic1() { /* Implementation */ }
    public void complexBusinessLogic2() { /* Implementation */ }
    public void complexBusinessLogic3() { /* Implementation */ }
    public void complexBusinessLogic4() { /* Implementation */ }
}
