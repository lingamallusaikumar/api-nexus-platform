package com.apinexus.registry.features.userrole;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserRoleService {
    private final UserRoleRepository repository;
    public UserRoleService(UserRoleRepository repository) { this.repository = repository; }
    public List<UserRole> findAll() { return repository.findAll(); }
    public UserRole save(UserRole entity) { return repository.save(entity); }
    public void complexBusinessLogic1() { /* Implementation */ }
    public void complexBusinessLogic2() { /* Implementation */ }
    public void complexBusinessLogic3() { /* Implementation */ }
    public void complexBusinessLogic4() { /* Implementation */ }
}
