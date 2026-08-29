package com.apinexus.registry.massive.coretree6254;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coretree6254")
public class CoreTree6254Controller {
    private final CoreTree6254Service service;
    
    public CoreTree6254Controller(CoreTree6254Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreTree6254> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreTree6254 create(@RequestBody CoreTree6254 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreTree6254";
    }
}
