package com.apinexus.registry.massive.edgethread1734;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeThread1734Repository extends JpaRepository<EdgeThread1734, Long> {
    EdgeThread1734 findByName(String name);
}
