package com.apinexus.registry.massive.datastore6665;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datastore6665")
public class DataStore6665Controller {
    private final DataStore6665Service service;
    
    public DataStore6665Controller(DataStore6665Service service) { this.service = service; }
    
    @GetMapping
    public List<DataStore6665> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataStore6665 create(@RequestBody DataStore6665 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataStore6665";
    }
}
