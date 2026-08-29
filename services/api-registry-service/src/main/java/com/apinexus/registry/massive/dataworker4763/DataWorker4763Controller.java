package com.apinexus.registry.massive.dataworker4763;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dataworker4763")
public class DataWorker4763Controller {
    private final DataWorker4763Service service;
    
    public DataWorker4763Controller(DataWorker4763Service service) { this.service = service; }
    
    @GetMapping
    public List<DataWorker4763> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataWorker4763 create(@RequestBody DataWorker4763 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataWorker4763";
    }
}
