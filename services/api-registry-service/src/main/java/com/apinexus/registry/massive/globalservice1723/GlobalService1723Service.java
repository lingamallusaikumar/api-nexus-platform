package com.apinexus.registry.massive.globalservice1723;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GlobalService1723Service {
    private final GlobalService1723Repository repository;
    
    public GlobalService1723Service(GlobalService1723Repository repository) { this.repository = repository; }
    
    public List<GlobalService1723> findAll() { return repository.findAll(); }
    public GlobalService1723 save(GlobalService1723 entity) { return repository.save(entity); }
    public Optional<GlobalService1723> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for GlobalService1723");
    }
}
