package com.apinexus.registry.massive.hubstore561;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HubStore561Service {
    private final HubStore561Repository repository;
    
    public HubStore561Service(HubStore561Repository repository) { this.repository = repository; }
    
    public List<HubStore561> findAll() { return repository.findAll(); }
    public HubStore561 save(HubStore561 entity) { return repository.save(entity); }
    public Optional<HubStore561> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HubStore561");
    }
}
