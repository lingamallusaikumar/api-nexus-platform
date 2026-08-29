import urllib.request
import json

url = 'http://localhost:8000/api/v1/ai/anomaly/detect'
data = json.dumps({"api_id": "test-api", "requests_per_minute": 1500, "error_rate": 0.05, "avg_latency_ms": 250}).encode('utf-8')
headers = {'Content-Type': 'application/json'}

try:
    req = urllib.request.Request(url, data=data, headers=headers)
    response = urllib.request.urlopen(req)
    print(response.read().decode('utf-8'))
except Exception as e:
    print(f"Error: {e}")
