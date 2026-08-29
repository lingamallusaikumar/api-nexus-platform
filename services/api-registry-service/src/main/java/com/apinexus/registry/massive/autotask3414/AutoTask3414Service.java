package com.apinexus.registry.massive.autotask3414;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AutoTask3414Service {
    private final AutoTask3414Repository repository;
    
    public AutoTask3414Service(AutoTask3414Repository repository) { this.repository = repository; }
    
    public List<AutoTask3414> findAll() { return repository.findAll(); }
    public AutoTask3414 save(AutoTask3414 entity) { return repository.save(entity); }
    public Optional<AutoTask3414> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for AutoTask3414");
    }
}
