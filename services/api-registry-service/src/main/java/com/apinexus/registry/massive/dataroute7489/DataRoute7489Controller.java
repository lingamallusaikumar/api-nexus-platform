package com.apinexus.registry.massive.dataroute7489;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataroute7489")
public class DataRoute7489Controller {
    private final DataRoute7489Service service;
    
    public DataRoute7489Controller(DataRoute7489Service service) { this.service = service; }
    
    @GetMapping
    public List<DataRoute7489> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataRoute7489 create(@RequestBody DataRoute7489 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataRoute7489";
    }
}
