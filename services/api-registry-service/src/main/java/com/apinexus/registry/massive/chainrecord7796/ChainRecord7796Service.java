package com.apinexus.registry.massive.chainrecord7796;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ChainRecord7796Service {
    private final ChainRecord7796Repository repository;
    
    public ChainRecord7796Service(ChainRecord7796Repository repository) { this.repository = repository; }
    
    public List<ChainRecord7796> findAll() { return repository.findAll(); }
    public ChainRecord7796 save(ChainRecord7796 entity) { return repository.save(entity); }
    public Optional<ChainRecord7796> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for ChainRecord7796");
    }
}
