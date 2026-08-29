package com.apinexus.registry.massive.edgestore3826;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EdgeStore3826Service {
    private final EdgeStore3826Repository repository;
    
    public EdgeStore3826Service(EdgeStore3826Repository repository) { this.repository = repository; }
    
    public List<EdgeStore3826> findAll() { return repository.findAll(); }
    public EdgeStore3826 save(EdgeStore3826 entity) { return repository.save(entity); }
    public Optional<EdgeStore3826> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for EdgeStore3826");
    }
}
