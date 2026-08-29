package com.apinexus.registry.massive.staticlink3989;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StaticLink3989Service {
    private final StaticLink3989Repository repository;
    
    public StaticLink3989Service(StaticLink3989Repository repository) { this.repository = repository; }
    
    public List<StaticLink3989> findAll() { return repository.findAll(); }
    public StaticLink3989 save(StaticLink3989 entity) { return repository.save(entity); }
    public Optional<StaticLink3989> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for StaticLink3989");
    }
}
