package com.apinexus.registry.massive.hubedge1317;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HubEdge1317Service {
    private final HubEdge1317Repository repository;
    
    public HubEdge1317Service(HubEdge1317Repository repository) { this.repository = repository; }
    
    public List<HubEdge1317> findAll() { return repository.findAll(); }
    public HubEdge1317 save(HubEdge1317 entity) { return repository.save(entity); }
    public Optional<HubEdge1317> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HubEdge1317");
    }
}
