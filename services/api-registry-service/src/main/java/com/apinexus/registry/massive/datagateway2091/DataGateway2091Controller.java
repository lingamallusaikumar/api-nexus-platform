package com.apinexus.registry.massive.datagateway2091;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datagateway2091")
public class DataGateway2091Controller {
    private final DataGateway2091Service service;
    
    public DataGateway2091Controller(DataGateway2091Service service) { this.service = service; }
    
    @GetMapping
    public List<DataGateway2091> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataGateway2091 create(@RequestBody DataGateway2091 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataGateway2091";
    }
}
