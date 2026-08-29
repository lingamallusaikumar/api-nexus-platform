package com.apinexus.registry.massive.onlinemodule289;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinemodule289")
public class OnlineModule289Controller {
    private final OnlineModule289Service service;
    
    public OnlineModule289Controller(OnlineModule289Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineModule289> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineModule289 create(@RequestBody OnlineModule289 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineModule289";
    }
}
