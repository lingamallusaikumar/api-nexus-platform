package com.apinexus.registry.massive.coremodule8381;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CoreModule8381Service {
    private final CoreModule8381Repository repository;
    
    public CoreModule8381Service(CoreModule8381Repository repository) { this.repository = repository; }
    
    public List<CoreModule8381> findAll() { return repository.findAll(); }
    public CoreModule8381 save(CoreModule8381 entity) { return repository.save(entity); }
    public Optional<CoreModule8381> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CoreModule8381");
    }
}
