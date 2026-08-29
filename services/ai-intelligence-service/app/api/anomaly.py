from fastapi import APIRouter
from pydantic import BaseModel
import random

router = APIRouter()

class TrafficData(BaseModel):
    api_id: str
    requests_per_minute: int
    error_rate: float
    avg_latency_ms: float

class AnomalyResult(BaseModel):
    is_anomaly: bool
    anomaly_score: float
    description: str

@router.post("/detect", response_model=AnomalyResult)
def detect_anomaly(data: TrafficData):
    # Stub: Normally pass to scikit-learn model
    score = random.random()
    is_anomaly = score > 0.8
    desc = "Traffic pattern normal." if not is_anomaly else "Unusual spike in latency detected."
    return AnomalyResult(is_anomaly=is_anomaly, anomaly_score=score, description=desc)

