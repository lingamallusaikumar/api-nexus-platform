package com.apinexus.registry.massive.hubstore6363;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HubStore6363Service {
    private final HubStore6363Repository repository;
    
    public HubStore6363Service(HubStore6363Repository repository) { this.repository = repository; }
    
    public List<HubStore6363> findAll() { return repository.findAll(); }
    public HubStore6363 save(HubStore6363 entity) { return repository.save(entity); }
    public Optional<HubStore6363> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HubStore6363");
    }
}
