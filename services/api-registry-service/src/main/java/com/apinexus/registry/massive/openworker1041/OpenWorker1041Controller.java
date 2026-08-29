package com.apinexus.registry.massive.openworker1041;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openworker1041")
public class OpenWorker1041Controller {
    private final OpenWorker1041Service service;
    
    public OpenWorker1041Controller(OpenWorker1041Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenWorker1041> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenWorker1041 create(@RequestBody OpenWorker1041 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenWorker1041";
    }
}
