package com.apinexus.registry.massive.globalrecord173;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GlobalRecord173Service {
    private final GlobalRecord173Repository repository;
    
    public GlobalRecord173Service(GlobalRecord173Repository repository) { this.repository = repository; }
    
    public List<GlobalRecord173> findAll() { return repository.findAll(); }
    public GlobalRecord173 save(GlobalRecord173 entity) { return repository.save(entity); }
    public Optional<GlobalRecord173> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for GlobalRecord173");
    }
}
