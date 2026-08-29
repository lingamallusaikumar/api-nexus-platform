package com.apinexus.registry.massive.hybridlog5380;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HybridLog5380Service {
    private final HybridLog5380Repository repository;
    
    public HybridLog5380Service(HybridLog5380Repository repository) { this.repository = repository; }
    
    public List<HybridLog5380> findAll() { return repository.findAll(); }
    public HybridLog5380 save(HybridLog5380 entity) { return repository.save(entity); }
    public Optional<HybridLog5380> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HybridLog5380");
    }
}
