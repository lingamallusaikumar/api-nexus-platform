package com.apinexus.registry.massive.coreentry4286;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreentry4286")
public class CoreEntry4286Controller {
    private final CoreEntry4286Service service;
    
    public CoreEntry4286Controller(CoreEntry4286Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreEntry4286> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreEntry4286 create(@RequestBody CoreEntry4286 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreEntry4286";
    }
}
