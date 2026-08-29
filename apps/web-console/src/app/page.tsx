'use client';
import React, { useState, useEffect } from 'react';

export default function Dashboard() {
  const [traffic, setTraffic] = useState(1245892);
  const [anomalies, setAnomalies] = useState(0);

  // Simulate real-time data
  useEffect(() => {
    const interval = setInterval(() => {
      setTraffic(prev => prev + Math.floor(Math.random() * 50));
      if (Math.random() > 0.95) setAnomalies(prev => prev + 1);
    }, 2000);
    return () => clearInterval(interval);
  }, []);

  return (
    <div style={{ fontFamily: 'system-ui, sans-serif', backgroundColor: '#f8fafc', minHeight: '100vh', padding: '2rem' }}>
      <div style={{ maxWidth: '1400px', margin: '0 auto' }}>
        
        {/* Header */}
        <header style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '2rem', paddingBottom: '1rem', borderBottom: '2px solid #e2e8f0' }}>
          <div>
            <h1 style={{ color: '#0f172a', fontSize: '2.5rem', margin: '0', fontWeight: '800', letterSpacing: '-1px' }}>API Nexus <span style={{color: '#3b82f6'}}>Control Plane</span></h1>
            <p style={{ color: '#64748b', fontSize: '1.1rem', marginTop: '0.5rem' }}>Global Traffic & Intelligence Dashboard</p>
          </div>
          <div style={{ display: 'flex', gap: '1rem' }}>
            <span style={{ padding: '0.5rem 1rem', backgroundColor: '#10b981', color: 'white', borderRadius: '999px', fontSize: '0.875rem', fontWeight: '600' }}>? All Systems Operational</span>
          </div>
        </header>

        {/* Metrics Grid */}
        <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(300px, 1fr))', gap: '1.5rem', marginBottom: '2rem' }}>
          
          <div style={{ backgroundColor: 'white', padding: '1.5rem', borderRadius: '12px', boxShadow: '0 1px 3px rgba(0,0,0,0.1)' }}>
            <h3 style={{ color: '#64748b', fontSize: '0.875rem', textTransform: 'uppercase', letterSpacing: '1px', margin: '0 0 0.5rem 0' }}>Total API Requests</h3>
            <div style={{ fontSize: '2.5rem', fontWeight: '700', color: '#0f172a' }}>{traffic.toLocaleString()}</div>
            <p style={{ color: '#10b981', margin: '0.5rem 0 0 0', fontSize: '0.875rem' }}>? 12% from last hour</p>
          </div>

          <div style={{ backgroundColor: 'white', padding: '1.5rem', borderRadius: '12px', boxShadow: '0 1px 3px rgba(0,0,0,0.1)' }}>
            <h3 style={{ color: '#64748b', fontSize: '0.875rem', textTransform: 'uppercase', letterSpacing: '1px', margin: '0 0 0.5rem 0' }}>AI Anomalies Detected</h3>
            <div style={{ fontSize: '2.5rem', fontWeight: '700', color: anomalies > 5 ? '#ef4444' : '#0f172a' }}>{anomalies}</div>
            <p style={{ color: anomalies > 5 ? '#ef4444' : '#64748b', margin: '0.5rem 0 0 0', fontSize: '0.875rem' }}>Real-time ML analysis active</p>
          </div>

          <div style={{ backgroundColor: 'white', padding: '1.5rem', borderRadius: '12px', boxShadow: '0 1px 3px rgba(0,0,0,0.1)' }}>
            <h3 style={{ color: '#64748b', fontSize: '0.875rem', textTransform: 'uppercase', letterSpacing: '1px', margin: '0 0 0.5rem 0' }}>Active Gateways</h3>
            <div style={{ fontSize: '2.5rem', fontWeight: '700', color: '#0f172a' }}>3 / 3</div>
            <p style={{ color: '#10b981', margin: '0.5rem 0 0 0', fontSize: '0.875rem' }}>US-East, EU-West, AP-South</p>
          </div>

        </div>

        {/* Services Status Table */}
        <div style={{ backgroundColor: 'white', borderRadius: '12px', boxShadow: '0 1px 3px rgba(0,0,0,0.1)', overflow: 'hidden' }}>
          <div style={{ padding: '1.5rem', borderBottom: '1px solid #e2e8f0', backgroundColor: '#f8fafc' }}>
            <h2 style={{ margin: '0', color: '#0f172a', fontSize: '1.25rem' }}>Microservice Mesh Status</h2>
          </div>
          <table style={{ width: '100%', borderCollapse: 'collapse', textAlign: 'left' }}>
            <thead>
              <tr style={{ borderBottom: '1px solid #e2e8f0', color: '#64748b', fontSize: '0.875rem' }}>
                <th style={{ padding: '1rem 1.5rem' }}>Service Name</th>
                <th style={{ padding: '1rem 1.5rem' }}>Environment</th>
                <th style={{ padding: '1rem 1.5rem' }}>Status</th>
                <th style={{ padding: '1rem 1.5rem' }}>Latency</th>
              </tr>
            </thead>
            <tbody>
              {[
                { name: 'Edge Gateway (Spring Cloud)', env: 'Production', lat: '12ms' },
                { name: 'Identity Service (JWT/Auth)', env: 'Production', lat: '45ms' },
                { name: 'API Registry Service', env: 'Production', lat: '23ms' },
                { name: 'AI Intelligence (FastAPI)', env: 'Production', lat: '105ms' },
                { name: 'Rate Limit (Redis)', env: 'Production', lat: '4ms' }
              ].map((svc, i) => (
                <tr key={i} style={{ borderBottom: '1px solid #e2e8f0' }}>
                  <td style={{ padding: '1rem 1.5rem', fontWeight: '500', color: '#0f172a' }}>{svc.name}</td>
                  <td style={{ padding: '1rem 1.5rem', color: '#64748b' }}>{svc.env}</td>
                  <td style={{ padding: '1rem 1.5rem' }}><span style={{ padding: '0.25rem 0.75rem', backgroundColor: '#dcfce7', color: '#166534', borderRadius: '999px', fontSize: '0.75rem', fontWeight: '600' }}>Healthy</span></td>
                  <td style={{ padding: '1rem 1.5rem', color: '#64748b', fontFamily: 'monospace' }}>{svc.lat}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>

      </div>
    </div>
  );
}
