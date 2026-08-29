package com.apinexus.registry.massive.hubbuffer6985;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubbuffer6985")
public class HubBuffer6985Controller {
    private final HubBuffer6985Service service;
    
    public HubBuffer6985Controller(HubBuffer6985Service service) { this.service = service; }
    
    @GetMapping
    public List<HubBuffer6985> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubBuffer6985 create(@RequestBody HubBuffer6985 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubBuffer6985";
    }
}
