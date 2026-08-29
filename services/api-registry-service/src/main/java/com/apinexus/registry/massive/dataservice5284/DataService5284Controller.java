package com.apinexus.registry.massive.dataservice5284;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataservice5284")
public class DataService5284Controller {
    private final DataService5284Service service;
    
    public DataService5284Controller(DataService5284Service service) { this.service = service; }
    
    @GetMapping
    public List<DataService5284> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataService5284 create(@RequestBody DataService5284 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataService5284";
    }
}
