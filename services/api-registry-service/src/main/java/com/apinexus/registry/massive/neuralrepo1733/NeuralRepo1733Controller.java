package com.apinexus.registry.massive.neuralrepo1733;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralrepo1733")
public class NeuralRepo1733Controller {
    private final NeuralRepo1733Service service;
    
    public NeuralRepo1733Controller(NeuralRepo1733Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralRepo1733> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralRepo1733 create(@RequestBody NeuralRepo1733 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralRepo1733";
    }
}
