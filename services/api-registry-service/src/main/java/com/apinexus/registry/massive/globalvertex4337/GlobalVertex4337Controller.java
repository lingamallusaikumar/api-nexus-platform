package com.apinexus.registry.massive.globalvertex4337;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalvertex4337")
public class GlobalVertex4337Controller {
    private final GlobalVertex4337Service service;
    
    public GlobalVertex4337Controller(GlobalVertex4337Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalVertex4337> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalVertex4337 create(@RequestBody GlobalVertex4337 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalVertex4337";
    }
}
