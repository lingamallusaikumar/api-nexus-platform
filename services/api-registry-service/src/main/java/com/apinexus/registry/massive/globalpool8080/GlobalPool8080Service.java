package com.apinexus.registry.massive.globalpool8080;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GlobalPool8080Service {
    private final GlobalPool8080Repository repository;
    
    public GlobalPool8080Service(GlobalPool8080Repository repository) { this.repository = repository; }
    
    public List<GlobalPool8080> findAll() { return repository.findAll(); }
    public GlobalPool8080 save(GlobalPool8080 entity) { return repository.save(entity); }
    public Optional<GlobalPool8080> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for GlobalPool8080");
    }
}
