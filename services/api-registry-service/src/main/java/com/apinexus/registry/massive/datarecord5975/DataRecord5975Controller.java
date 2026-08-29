package com.apinexus.registry.massive.datarecord5975;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datarecord5975")
public class DataRecord5975Controller {
    private final DataRecord5975Service service;
    
    public DataRecord5975Controller(DataRecord5975Service service) { this.service = service; }
    
    @GetMapping
    public List<DataRecord5975> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataRecord5975 create(@RequestBody DataRecord5975 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataRecord5975";
    }
}
