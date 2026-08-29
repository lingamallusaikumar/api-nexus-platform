package com.apinexus.registry.massive.globalservice1723;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalservice1723")
public class GlobalService1723Controller {
    private final GlobalService1723Service service;
    
    public GlobalService1723Controller(GlobalService1723Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalService1723> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalService1723 create(@RequestBody GlobalService1723 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalService1723";
    }
}
