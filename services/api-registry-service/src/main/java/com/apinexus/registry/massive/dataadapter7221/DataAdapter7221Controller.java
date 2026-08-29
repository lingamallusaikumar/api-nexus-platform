package com.apinexus.registry.massive.dataadapter7221;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataadapter7221")
public class DataAdapter7221Controller {
    private final DataAdapter7221Service service;
    
    public DataAdapter7221Controller(DataAdapter7221Service service) { this.service = service; }
    
    @GetMapping
    public List<DataAdapter7221> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataAdapter7221 create(@RequestBody DataAdapter7221 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataAdapter7221";
    }
}
