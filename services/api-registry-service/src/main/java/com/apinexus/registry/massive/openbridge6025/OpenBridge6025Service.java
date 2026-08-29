package com.apinexus.registry.massive.openbridge6025;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OpenBridge6025Service {
    private final OpenBridge6025Repository repository;
    
    public OpenBridge6025Service(OpenBridge6025Repository repository) { this.repository = repository; }
    
    public List<OpenBridge6025> findAll() { return repository.findAll(); }
    public OpenBridge6025 save(OpenBridge6025 entity) { return repository.save(entity); }
    public Optional<OpenBridge6025> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for OpenBridge6025");
    }
}
