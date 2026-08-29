package com.apinexus.registry.massive.routersystem46;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routersystem46")
public class RouterSystem46Controller {
    private final RouterSystem46Service service;
    
    public RouterSystem46Controller(RouterSystem46Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterSystem46> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterSystem46 create(@RequestBody RouterSystem46 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterSystem46";
    }
}
