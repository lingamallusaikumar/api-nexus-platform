package com.apinexus.registry.massive.digitalroute6286;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalroute6286")
public class DigitalRoute6286Controller {
    private final DigitalRoute6286Service service;
    
    public DigitalRoute6286Controller(DigitalRoute6286Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalRoute6286> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalRoute6286 create(@RequestBody DigitalRoute6286 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalRoute6286";
    }
}
