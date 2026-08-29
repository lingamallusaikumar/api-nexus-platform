package com.apinexus.registry.massive.globalagent6928;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalagent6928")
public class GlobalAgent6928Controller {
    private final GlobalAgent6928Service service;
    
    public GlobalAgent6928Controller(GlobalAgent6928Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalAgent6928> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalAgent6928 create(@RequestBody GlobalAgent6928 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalAgent6928";
    }
}
