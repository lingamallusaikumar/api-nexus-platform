package com.apinexus.registry.massive.hubbridge2673;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HubBridge2673Service {
    private final HubBridge2673Repository repository;
    
    public HubBridge2673Service(HubBridge2673Repository repository) { this.repository = repository; }
    
    public List<HubBridge2673> findAll() { return repository.findAll(); }
    public HubBridge2673 save(HubBridge2673 entity) { return repository.save(entity); }
    public Optional<HubBridge2673> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HubBridge2673");
    }
}
