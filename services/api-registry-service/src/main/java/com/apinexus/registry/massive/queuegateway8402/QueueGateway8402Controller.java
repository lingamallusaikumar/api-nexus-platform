package com.apinexus.registry.massive.queuegateway8402;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuegateway8402")
public class QueueGateway8402Controller {
    private final QueueGateway8402Service service;
    
    public QueueGateway8402Controller(QueueGateway8402Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueGateway8402> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueGateway8402 create(@RequestBody QueueGateway8402 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueGateway8402";
    }
}
