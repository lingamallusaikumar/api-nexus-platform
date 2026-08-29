package com.apinexus.registry.massive.databuffer6879;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/databuffer6879")
public class DataBuffer6879Controller {
    private final DataBuffer6879Service service;
    
    public DataBuffer6879Controller(DataBuffer6879Service service) { this.service = service; }
    
    @GetMapping
    public List<DataBuffer6879> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataBuffer6879 create(@RequestBody DataBuffer6879 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataBuffer6879";
    }
}
