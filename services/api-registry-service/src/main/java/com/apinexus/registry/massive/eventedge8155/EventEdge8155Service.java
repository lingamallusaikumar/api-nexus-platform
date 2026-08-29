package com.apinexus.registry.massive.eventedge8155;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventEdge8155Service {
    private final EventEdge8155Repository repository;
    
    public EventEdge8155Service(EventEdge8155Repository repository) { this.repository = repository; }
    
    public List<EventEdge8155> findAll() { return repository.findAll(); }
    public EventEdge8155 save(EventEdge8155 entity) { return repository.save(entity); }
    public Optional<EventEdge8155> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for EventEdge8155");
    }
}
