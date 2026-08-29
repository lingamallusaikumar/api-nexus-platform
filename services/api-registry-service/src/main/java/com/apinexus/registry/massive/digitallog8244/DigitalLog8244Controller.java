package com.apinexus.registry.massive.digitallog8244;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitallog8244")
public class DigitalLog8244Controller {
    private final DigitalLog8244Service service;
    
    public DigitalLog8244Controller(DigitalLog8244Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalLog8244> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalLog8244 create(@RequestBody DigitalLog8244 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalLog8244";
    }
}
