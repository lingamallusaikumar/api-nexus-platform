from fastapi import FastAPI
from app.api import assistant, anomaly

app = FastAPI(title="API Nexus - AI Intelligence Service", version="1.0.0")

app.include_router(assistant.router, prefix="/api/v1/ai/assistant", tags=["Assistant"])
app.include_router(anomaly.router, prefix="/api/v1/ai/anomaly", tags=["Anomaly Detection"])

@app.get("/health")
def health_check():
    return {"status": "ok", "service": "ai-intelligence-service"}

