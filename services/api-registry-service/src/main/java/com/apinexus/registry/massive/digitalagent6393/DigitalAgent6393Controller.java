package com.apinexus.registry.massive.digitalagent6393;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalagent6393")
public class DigitalAgent6393Controller {
    private final DigitalAgent6393Service service;
    
    public DigitalAgent6393Controller(DigitalAgent6393Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalAgent6393> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalAgent6393 create(@RequestBody DigitalAgent6393 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalAgent6393";
    }
}
