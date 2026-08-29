package com.apinexus.registry.massive.routerdispatcher625;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerdispatcher625")
public class RouterDispatcher625Controller {
    private final RouterDispatcher625Service service;
    
    public RouterDispatcher625Controller(RouterDispatcher625Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterDispatcher625> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterDispatcher625 create(@RequestBody RouterDispatcher625 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterDispatcher625";
    }
}
