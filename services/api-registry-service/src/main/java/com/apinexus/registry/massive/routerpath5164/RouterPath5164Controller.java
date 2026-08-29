package com.apinexus.registry.massive.routerpath5164;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerpath5164")
public class RouterPath5164Controller {
    private final RouterPath5164Service service;
    
    public RouterPath5164Controller(RouterPath5164Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterPath5164> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterPath5164 create(@RequestBody RouterPath5164 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterPath5164";
    }
}
