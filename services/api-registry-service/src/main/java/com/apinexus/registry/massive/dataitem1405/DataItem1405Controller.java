package com.apinexus.registry.massive.dataitem1405;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataitem1405")
public class DataItem1405Controller {
    private final DataItem1405Service service;
    
    public DataItem1405Controller(DataItem1405Service service) { this.service = service; }
    
    @GetMapping
    public List<DataItem1405> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataItem1405 create(@RequestBody DataItem1405 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataItem1405";
    }
}
