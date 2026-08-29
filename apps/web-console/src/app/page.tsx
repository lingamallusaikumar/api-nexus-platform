'use client';
import React, { useState, useEffect } from 'react';

export default function Dashboard() {
  const [traffic, setTraffic] = useState(1245892);
  const [anomalies, setAnomalies] = useState(0);

  // Simulate real-time data
  useEffect(() => {
    const interval = setInterval(() => {
      setTraffic(prev => prev + Math.floor(Math.random() * 80));
      if (Math.random() > 0.90) setAnomalies(prev => prev + 1);
    }, 1500);
    return () => clearInterval(interval);
  }, []);

  return (
    <div style={{
      fontFamily: 'system-ui, -apple-system, sans-serif',
      background: 'linear-gradient(135deg, #0f172a 0%, #1e1b4b 100%)',
      minHeight: '100vh',
      color: '#f8fafc',
      padding: '2rem'
    }}>
      <div style={{ maxWidth: '1400px', margin: '0 auto' }}>
        
        {/* Top Navbar */}
        <header style={{
          display: 'flex', justifyContent: 'space-between', alignItems: 'center',
          background: 'rgba(255, 255, 255, 0.05)', backdropFilter: 'blur(10px)',
          padding: '1.5rem 2rem', borderRadius: '16px', marginBottom: '2rem',
          border: '1px solid rgba(255, 255, 255, 0.1)'
        }}>
          <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
            <div style={{ width: '40px', height: '40px', background: 'linear-gradient(135deg, #3b82f6, #8b5cf6)', borderRadius: '10px', display: 'flex', alignItems: 'center', justifyContent: 'center', fontWeight: 'bold', fontSize: '1.2rem' }}>N</div>
            <div>
              <h1 style={{ fontSize: '1.5rem', margin: '0', fontWeight: '700', letterSpacing: '0.5px' }}>API Nexus</h1>
              <p style={{ color: '#94a3b8', fontSize: '0.875rem', margin: '0' }}>Mission Control</p>
            </div>
          </div>
          <div style={{ display: 'flex', alignItems: 'center', gap: '1.5rem' }}>
            <span style={{ display: 'flex', alignItems: 'center', gap: '0.5rem', color: '#10b981', fontSize: '0.875rem', fontWeight: '600' }}>
              <span style={{ display: 'inline-block', width: '8px', height: '8px', backgroundColor: '#10b981', borderRadius: '50%', boxShadow: '0 0 8px #10b981' }}></span>
              SYSTEM LIVE
            </span>
            <button style={{ background: 'rgba(255,255,255,0.1)', border: 'none', color: 'white', padding: '0.5rem 1rem', borderRadius: '8px', cursor: 'pointer' }}>Settings</button>
          </div>
        </header>

        {/* Hero Metrics */}
        <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(320px, 1fr))', gap: '1.5rem', marginBottom: '2rem' }}>
          
          <div style={{
            background: 'rgba(255, 255, 255, 0.03)', border: '1px solid rgba(255, 255, 255, 0.05)',
            padding: '2rem', borderRadius: '16px', position: 'relative', overflow: 'hidden'
          }}>
            <div style={{ position: 'absolute', top: '-20px', right: '-20px', width: '100px', height: '100px', background: '#3b82f6', filter: 'blur(50px)', opacity: '0.3' }}></div>
            <h3 style={{ color: '#94a3b8', fontSize: '0.875rem', textTransform: 'uppercase', letterSpacing: '1px', margin: '0 0 1rem 0' }}>Total Ingress Traffic</h3>
            <div style={{ fontSize: '3.5rem', fontWeight: '800', color: '#f8fafc', textShadow: '0 2px 10px rgba(0,0,0,0.5)' }}>
              {traffic.toLocaleString()}
            </div>
            <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem', marginTop: '1rem' }}>
              <span style={{ background: 'rgba(16, 185, 129, 0.2)', color: '#34d399', padding: '0.25rem 0.5rem', borderRadius: '4px', fontSize: '0.875rem', fontWeight: 'bold' }}>+14.2%</span>
              <span style={{ color: '#64748b', fontSize: '0.875rem' }}>vs last hour</span>
            </div>
          </div>

          <div style={{
            background: 'rgba(255, 255, 255, 0.03)', border: '1px solid rgba(255, 255, 255, 0.05)',
            padding: '2rem', borderRadius: '16px', position: 'relative', overflow: 'hidden'
          }}>
            <div style={{ position: 'absolute', top: '-20px', right: '-20px', width: '100px', height: '100px', background: anomalies > 0 ? '#ef4444' : '#10b981', filter: 'blur(50px)', opacity: '0.2' }}></div>
            <h3 style={{ color: '#94a3b8', fontSize: '0.875rem', textTransform: 'uppercase', letterSpacing: '1px', margin: '0 0 1rem 0' }}>AI Threat Detection</h3>
            <div style={{ fontSize: '3.5rem', fontWeight: '800', color: anomalies > 5 ? '#f87171' : '#f8fafc', textShadow: '0 2px 10px rgba(0,0,0,0.5)' }}>
              {anomalies}
            </div>
            <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem', marginTop: '1rem' }}>
              <span style={{ background: anomalies > 5 ? 'rgba(239, 68, 68, 0.2)' : 'rgba(59, 130, 246, 0.2)', color: anomalies > 5 ? '#fca5a5' : '#93c5fd', padding: '0.25rem 0.5rem', borderRadius: '4px', fontSize: '0.875rem', fontWeight: 'bold' }}>
                {anomalies > 5 ? 'HIGH ALERT' : 'MONITORING'}
              </span>
              <span style={{ color: '#64748b', fontSize: '0.875rem' }}>FastAPI Model Active</span>
            </div>
          </div>

          <div style={{
            background: 'rgba(255, 255, 255, 0.03)', border: '1px solid rgba(255, 255, 255, 0.05)',
            padding: '2rem', borderRadius: '16px', position: 'relative', overflow: 'hidden',
            display: 'flex', flexDirection: 'column', justifyContent: 'center'
          }}>
            <h3 style={{ color: '#94a3b8', fontSize: '0.875rem', textTransform: 'uppercase', letterSpacing: '1px', margin: '0 0 1rem 0' }}>Infrastructure Load</h3>
            <div style={{ display: 'flex', flexDirection: 'column', gap: '1rem' }}>
              <div>
                <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.875rem', marginBottom: '0.5rem' }}><span>CPU Usage</span><span style={{color: '#34d399'}}>24%</span></div>
                <div style={{ width: '100%', height: '8px', background: 'rgba(255,255,255,0.1)', borderRadius: '4px' }}><div style={{ width: '24%', height: '100%', background: '#34d399', borderRadius: '4px' }}></div></div>
              </div>
              <div>
                <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.875rem', marginBottom: '0.5rem' }}><span>Memory (Redis/Postgres)</span><span style={{color: '#fbbf24'}}>68%</span></div>
                <div style={{ width: '100%', height: '8px', background: 'rgba(255,255,255,0.1)', borderRadius: '4px' }}><div style={{ width: '68%', height: '100%', background: '#fbbf24', borderRadius: '4px' }}></div></div>
              </div>
            </div>
          </div>

        </div>

        {/* Microservices Cluster Map */}
        <div style={{
          background: 'rgba(255, 255, 255, 0.03)', border: '1px solid rgba(255, 255, 255, 0.05)',
          borderRadius: '16px', overflow: 'hidden'
        }}>
          <div style={{ padding: '1.5rem 2rem', borderBottom: '1px solid rgba(255,255,255,0.05)' }}>
            <h2 style={{ margin: '0', fontSize: '1.25rem', fontWeight: '600' }}>Active Microservices Mesh</h2>
          </div>
          <table style={{ width: '100%', borderCollapse: 'collapse', textAlign: 'left' }}>
            <thead>
              <tr style={{ color: '#94a3b8', fontSize: '0.875rem', background: 'rgba(0,0,0,0.2)' }}>
                <th style={{ padding: '1rem 2rem', fontWeight: '500' }}>Service Node</th>
                <th style={{ padding: '1rem 2rem', fontWeight: '500' }}>Framework</th>
                <th style={{ padding: '1rem 2rem', fontWeight: '500' }}>Health</th>
                <th style={{ padding: '1rem 2rem', fontWeight: '500' }}>Latency</th>
              </tr>
            </thead>
            <tbody>
              {[
                { name: 'API Edge Gateway', tech: 'Spring Cloud', lat: '12ms', color: '#3b82f6' },
                { name: 'Identity Provider', tech: 'Spring Security / JWT', lat: '45ms', color: '#8b5cf6' },
                { name: 'Registry Service', tech: 'Spring Boot / JPA', lat: '23ms', color: '#ec4899' },
                { name: 'AI Intelligence Engine', tech: 'Python / FastAPI', lat: '105ms', color: '#eab308' },
                { name: 'Rate Limit Controller', tech: 'Redis Distributed', lat: '4ms', color: '#10b981' }
              ].map((svc, i) => (
                <tr key={i} style={{ borderBottom: '1px solid rgba(255,255,255,0.05)' }}>
                  <td style={{ padding: '1rem 2rem', display: 'flex', alignItems: 'center', gap: '1rem' }}>
                    <div style={{ width: '10px', height: '10px', borderRadius: '50%', background: svc.color, boxShadow: '0 0 10px ' + svc.color }}></div>
                    <span style={{ fontWeight: '500' }}>{svc.name}</span>
                  </td>
                  <td style={{ padding: '1rem 2rem', color: '#94a3b8', fontSize: '0.875rem' }}>{svc.tech}</td>
                  <td style={{ padding: '1rem 2rem' }}>
                    <span style={{ background: 'rgba(16, 185, 129, 0.1)', color: '#34d399', padding: '0.25rem 0.75rem', borderRadius: '999px', fontSize: '0.75rem', fontWeight: 'bold' }}>ONLINE</span>
                  </td>
                  <td style={{ padding: '1rem 2rem', color: '#cbd5e1', fontFamily: 'monospace' }}>{svc.lat}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>

      </div>
    </div>
  );
}
