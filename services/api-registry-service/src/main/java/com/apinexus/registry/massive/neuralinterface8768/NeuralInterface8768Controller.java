package com.apinexus.registry.massive.neuralinterface8768;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralinterface8768")
public class NeuralInterface8768Controller {
    private final NeuralInterface8768Service service;
    
    public NeuralInterface8768Controller(NeuralInterface8768Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralInterface8768> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralInterface8768 create(@RequestBody NeuralInterface8768 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralInterface8768";
    }
}
