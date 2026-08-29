package com.apinexus.registry.massive.regioninterface5990;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RegionInterface5990Service {
    private final RegionInterface5990Repository repository;
    
    public RegionInterface5990Service(RegionInterface5990Repository repository) { this.repository = repository; }
    
    public List<RegionInterface5990> findAll() { return repository.findAll(); }
    public RegionInterface5990 save(RegionInterface5990 entity) { return repository.save(entity); }
    public Optional<RegionInterface5990> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for RegionInterface5990");
    }
}
