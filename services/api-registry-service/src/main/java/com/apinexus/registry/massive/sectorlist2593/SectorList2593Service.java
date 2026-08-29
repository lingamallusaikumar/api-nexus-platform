package com.apinexus.registry.massive.sectorlist2593;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SectorList2593Service {
    private final SectorList2593Repository repository;
    
    public SectorList2593Service(SectorList2593Repository repository) { this.repository = repository; }
    
    public List<SectorList2593> findAll() { return repository.findAll(); }
    public SectorList2593 save(SectorList2593 entity) { return repository.save(entity); }
    public Optional<SectorList2593> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for SectorList2593");
    }
}
