CREATE TABLE IF NOT EXISTS patient(
    patient_id VARCHAR(36) PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    contact_number VARCHAR(20),
    medicalHistory TEXT
);