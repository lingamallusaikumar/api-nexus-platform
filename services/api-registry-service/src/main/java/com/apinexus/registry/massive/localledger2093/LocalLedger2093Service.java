package com.apinexus.registry.massive.localledger2093;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LocalLedger2093Service {
    private final LocalLedger2093Repository repository;
    
    public LocalLedger2093Service(LocalLedger2093Repository repository) { this.repository = repository; }
    
    public List<LocalLedger2093> findAll() { return repository.findAll(); }
    public LocalLedger2093 save(LocalLedger2093 entity) { return repository.save(entity); }
    public Optional<LocalLedger2093> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for LocalLedger2093");
    }
}
