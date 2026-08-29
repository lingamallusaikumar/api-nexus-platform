package com.apinexus.registry.massive.hubinterface1981;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HubInterface1981Service {
    private final HubInterface1981Repository repository;
    
    public HubInterface1981Service(HubInterface1981Repository repository) { this.repository = repository; }
    
    public List<HubInterface1981> findAll() { return repository.findAll(); }
    public HubInterface1981 save(HubInterface1981 entity) { return repository.save(entity); }
    public Optional<HubInterface1981> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HubInterface1981");
    }
}
