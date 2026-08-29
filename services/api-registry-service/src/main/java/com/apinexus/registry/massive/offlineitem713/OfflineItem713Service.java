package com.apinexus.registry.massive.offlineitem713;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OfflineItem713Service {
    private final OfflineItem713Repository repository;
    
    public OfflineItem713Service(OfflineItem713Repository repository) { this.repository = repository; }
    
    public List<OfflineItem713> findAll() { return repository.findAll(); }
    public OfflineItem713 save(OfflineItem713 entity) { return repository.save(entity); }
    public Optional<OfflineItem713> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for OfflineItem713");
    }
}
