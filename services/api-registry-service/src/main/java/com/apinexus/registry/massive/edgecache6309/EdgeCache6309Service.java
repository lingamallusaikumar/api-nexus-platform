package com.apinexus.registry.massive.edgecache6309;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EdgeCache6309Service {
    private final EdgeCache6309Repository repository;
    
    public EdgeCache6309Service(EdgeCache6309Repository repository) { this.repository = repository; }
    
    public List<EdgeCache6309> findAll() { return repository.findAll(); }
    public EdgeCache6309 save(EdgeCache6309 entity) { return repository.save(entity); }
    public Optional<EdgeCache6309> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for EdgeCache6309");
    }
}
