package com.apinexus.registry.massive.datahandler7622;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datahandler7622")
public class DataHandler7622Controller {
    private final DataHandler7622Service service;
    
    public DataHandler7622Controller(DataHandler7622Service service) { this.service = service; }
    
    @GetMapping
    public List<DataHandler7622> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataHandler7622 create(@RequestBody DataHandler7622 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataHandler7622";
    }
}
