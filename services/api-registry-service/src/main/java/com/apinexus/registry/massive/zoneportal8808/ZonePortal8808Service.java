package com.apinexus.registry.massive.zoneportal8808;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ZonePortal8808Service {
    private final ZonePortal8808Repository repository;
    
    public ZonePortal8808Service(ZonePortal8808Repository repository) { this.repository = repository; }
    
    public List<ZonePortal8808> findAll() { return repository.findAll(); }
    public ZonePortal8808 save(ZonePortal8808 entity) { return repository.save(entity); }
    public Optional<ZonePortal8808> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for ZonePortal8808");
    }
}
