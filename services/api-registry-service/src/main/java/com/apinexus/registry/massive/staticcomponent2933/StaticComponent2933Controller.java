package com.apinexus.registry.massive.staticcomponent2933;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticcomponent2933")
public class StaticComponent2933Controller {
    private final StaticComponent2933Service service;
    
    public StaticComponent2933Controller(StaticComponent2933Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticComponent2933> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticComponent2933 create(@RequestBody StaticComponent2933 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticComponent2933";
    }
}
