package com.apinexus.registry.massive.queuegateway5483;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuegateway5483")
public class QueueGateway5483Controller {
    private final QueueGateway5483Service service;
    
    public QueueGateway5483Controller(QueueGateway5483Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueGateway5483> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueGateway5483 create(@RequestBody QueueGateway5483 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueGateway5483";
    }
}
