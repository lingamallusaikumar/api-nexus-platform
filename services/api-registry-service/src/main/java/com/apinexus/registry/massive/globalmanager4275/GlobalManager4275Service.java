package com.apinexus.registry.massive.globalmanager4275;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GlobalManager4275Service {
    private final GlobalManager4275Repository repository;
    
    public GlobalManager4275Service(GlobalManager4275Repository repository) { this.repository = repository; }
    
    public List<GlobalManager4275> findAll() { return repository.findAll(); }
    public GlobalManager4275 save(GlobalManager4275 entity) { return repository.save(entity); }
    public Optional<GlobalManager4275> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for GlobalManager4275");
    }
}
