package com.apinexus.registry.massive.edgethread1734;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgethread1734")
public class EdgeThread1734Controller {
    private final EdgeThread1734Service service;
    
    public EdgeThread1734Controller(EdgeThread1734Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeThread1734> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeThread1734 create(@RequestBody EdgeThread1734 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeThread1734";
    }
}
