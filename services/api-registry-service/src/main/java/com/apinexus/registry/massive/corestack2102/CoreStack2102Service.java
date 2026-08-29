package com.apinexus.registry.massive.corestack2102;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CoreStack2102Service {
    private final CoreStack2102Repository repository;
    
    public CoreStack2102Service(CoreStack2102Repository repository) { this.repository = repository; }
    
    public List<CoreStack2102> findAll() { return repository.findAll(); }
    public CoreStack2102 save(CoreStack2102 entity) { return repository.save(entity); }
    public Optional<CoreStack2102> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CoreStack2102");
    }
}
