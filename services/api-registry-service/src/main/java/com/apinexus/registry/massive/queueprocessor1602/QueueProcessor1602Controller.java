package com.apinexus.registry.massive.queueprocessor1602;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queueprocessor1602")
public class QueueProcessor1602Controller {
    private final QueueProcessor1602Service service;
    
    public QueueProcessor1602Controller(QueueProcessor1602Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueProcessor1602> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueProcessor1602 create(@RequestBody QueueProcessor1602 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueProcessor1602";
    }
}
