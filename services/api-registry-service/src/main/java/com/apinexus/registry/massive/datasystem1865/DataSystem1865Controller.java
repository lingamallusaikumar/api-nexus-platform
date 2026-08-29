package com.apinexus.registry.massive.datasystem1865;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datasystem1865")
public class DataSystem1865Controller {
    private final DataSystem1865Service service;
    
    public DataSystem1865Controller(DataSystem1865Service service) { this.service = service; }
    
    @GetMapping
    public List<DataSystem1865> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataSystem1865 create(@RequestBody DataSystem1865 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataSystem1865";
    }
}
