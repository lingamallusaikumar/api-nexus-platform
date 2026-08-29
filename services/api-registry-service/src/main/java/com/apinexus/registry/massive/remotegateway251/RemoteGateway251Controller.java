package com.apinexus.registry.massive.remotegateway251;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotegateway251")
public class RemoteGateway251Controller {
    private final RemoteGateway251Service service;
    
    public RemoteGateway251Controller(RemoteGateway251Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteGateway251> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteGateway251 create(@RequestBody RemoteGateway251 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteGateway251";
    }
}
