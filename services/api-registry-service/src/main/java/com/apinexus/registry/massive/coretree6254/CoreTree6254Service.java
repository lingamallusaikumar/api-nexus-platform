package com.apinexus.registry.massive.coretree6254;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CoreTree6254Service {
    private final CoreTree6254Repository repository;
    
    public CoreTree6254Service(CoreTree6254Repository repository) { this.repository = repository; }
    
    public List<CoreTree6254> findAll() { return repository.findAll(); }
    public CoreTree6254 save(CoreTree6254 entity) { return repository.save(entity); }
    public Optional<CoreTree6254> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CoreTree6254");
    }
}
