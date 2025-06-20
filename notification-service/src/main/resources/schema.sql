CREATE TABLE notification_log(
    id BIGSERIAL PRIMARY KEY,
    recipient VARCHAR(100) NOT NULL,
    message TEXT NOT NULL,
    channel VARCHAR(10) CHECK ( channel IN ( 'SMS', 'EMAIL' ) ),
    status VARCHAR(10) CHECK ( status IN ( 'PENDING', 'SUCCESS', 'FAILED' ) ),
    error_message TEXT,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP
)