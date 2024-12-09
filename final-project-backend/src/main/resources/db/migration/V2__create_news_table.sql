CREATE TABLE IF NOT EXISTS news (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Add initial data
INSERT INTO news (title, description, date)
VALUES 
    ('UNCC Announces New Research Grant', 'The university received $2M for AI research.', '2024-03-15 00:00:00'),
    ('Campus Sustainability Initiative', 'New solar panels installed on campus buildings.', '2024-03-14 00:00:00'),
    ('Student Achievement Award', 'CS Department students win national competition.', '2024-03-13 00:00:00'),
    ('Faculty Research Recognition', 'Dr. Smith receives prestigious award for research.', '2024-03-12 00:00:00'); 