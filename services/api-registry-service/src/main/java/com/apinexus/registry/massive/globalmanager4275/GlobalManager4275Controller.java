package com.apinexus.registry.massive.globalmanager4275;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalmanager4275")
public class GlobalManager4275Controller {
    private final GlobalManager4275Service service;
    
    public GlobalManager4275Controller(GlobalManager4275Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalManager4275> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalManager4275 create(@RequestBody GlobalManager4275 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalManager4275";
    }
}
