package com.apinexus.registry.massive.sectorcomponent8173;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SectorComponent8173Service {
    private final SectorComponent8173Repository repository;
    
    public SectorComponent8173Service(SectorComponent8173Repository repository) { this.repository = repository; }
    
    public List<SectorComponent8173> findAll() { return repository.findAll(); }
    public SectorComponent8173 save(SectorComponent8173 entity) { return repository.save(entity); }
    public Optional<SectorComponent8173> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for SectorComponent8173");
    }
}
