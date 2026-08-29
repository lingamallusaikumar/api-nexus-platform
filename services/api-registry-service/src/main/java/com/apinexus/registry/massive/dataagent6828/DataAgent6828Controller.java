package com.apinexus.registry.massive.dataagent6828;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataagent6828")
public class DataAgent6828Controller {
    private final DataAgent6828Service service;
    
    public DataAgent6828Controller(DataAgent6828Service service) { this.service = service; }
    
    @GetMapping
    public List<DataAgent6828> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataAgent6828 create(@RequestBody DataAgent6828 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataAgent6828";
    }
}
