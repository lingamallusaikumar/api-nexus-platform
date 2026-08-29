package com.apinexus.registry.massive.hubroute9995;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubroute9995")
public class HubRoute9995Controller {
    private final HubRoute9995Service service;
    
    public HubRoute9995Controller(HubRoute9995Service service) { this.service = service; }
    
    @GetMapping
    public List<HubRoute9995> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubRoute9995 create(@RequestBody HubRoute9995 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubRoute9995";
    }
}
