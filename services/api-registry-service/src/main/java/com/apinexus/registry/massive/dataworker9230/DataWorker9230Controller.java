package com.apinexus.registry.massive.dataworker9230;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataworker9230")
public class DataWorker9230Controller {
    private final DataWorker9230Service service;
    
    public DataWorker9230Controller(DataWorker9230Service service) { this.service = service; }
    
    @GetMapping
    public List<DataWorker9230> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataWorker9230 create(@RequestBody DataWorker9230 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataWorker9230";
    }
}
