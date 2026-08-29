package com.apinexus.registry.massive.chainnode2120;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ChainNode2120Service {
    private final ChainNode2120Repository repository;
    
    public ChainNode2120Service(ChainNode2120Repository repository) { this.repository = repository; }
    
    public List<ChainNode2120> findAll() { return repository.findAll(); }
    public ChainNode2120 save(ChainNode2120 entity) { return repository.save(entity); }
    public Optional<ChainNode2120> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for ChainNode2120");
    }
}
