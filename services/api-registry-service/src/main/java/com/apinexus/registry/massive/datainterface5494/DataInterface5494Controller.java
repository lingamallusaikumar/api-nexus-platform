package com.apinexus.registry.massive.datainterface5494;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datainterface5494")
public class DataInterface5494Controller {
    private final DataInterface5494Service service;
    
    public DataInterface5494Controller(DataInterface5494Service service) { this.service = service; }
    
    @GetMapping
    public List<DataInterface5494> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataInterface5494 create(@RequestBody DataInterface5494 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataInterface5494";
    }
}
