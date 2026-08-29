package com.apinexus.registry.massive.queuebuffer6194;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuebuffer6194")
public class QueueBuffer6194Controller {
    private final QueueBuffer6194Service service;
    
    public QueueBuffer6194Controller(QueueBuffer6194Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueBuffer6194> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueBuffer6194 create(@RequestBody QueueBuffer6194 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueBuffer6194";
    }
}
