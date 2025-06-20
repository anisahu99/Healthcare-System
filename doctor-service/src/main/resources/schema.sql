CREATE TABLE doctor(
    doctor_id VARCHAR(36) PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    specialization VARCHAR(100)
);

CREATE TABLE availability_slot(
    slot_id BIGSERIAL PRIMARY KEY,
    doctor_id VARCHAR(36) REFERENCES doctor(doctor_id),
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP NOT NULL,
    is_booked BOOLEAN DEFAULT false
);