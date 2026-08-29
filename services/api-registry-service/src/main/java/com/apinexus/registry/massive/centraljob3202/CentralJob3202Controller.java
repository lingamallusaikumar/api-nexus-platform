package com.apinexus.registry.massive.centraljob3202;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centraljob3202")
public class CentralJob3202Controller {
    private final CentralJob3202Service service;
    
    public CentralJob3202Controller(CentralJob3202Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralJob3202> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralJob3202 create(@RequestBody CentralJob3202 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralJob3202";
    }
}
