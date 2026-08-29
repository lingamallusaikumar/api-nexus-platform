package com.apinexus.registry.massive.neuralworker337;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralworker337")
public class NeuralWorker337Controller {
    private final NeuralWorker337Service service;
    
    public NeuralWorker337Controller(NeuralWorker337Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralWorker337> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralWorker337 create(@RequestBody NeuralWorker337 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralWorker337";
    }
}
