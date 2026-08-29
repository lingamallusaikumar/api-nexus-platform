package com.apinexus.registry.massive.routerportal8479;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RouterPortal8479Service {
    private final RouterPortal8479Repository repository;
    
    public RouterPortal8479Service(RouterPortal8479Repository repository) { this.repository = repository; }
    
    public List<RouterPortal8479> findAll() { return repository.findAll(); }
    public RouterPortal8479 save(RouterPortal8479 entity) { return repository.save(entity); }
    public Optional<RouterPortal8479> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for RouterPortal8479");
    }
}
