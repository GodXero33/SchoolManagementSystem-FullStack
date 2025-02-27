DROP DATABASE IF EXISTS school_management;
CREATE DATABASE school_management;
USE school_management;

CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender ENUM('Male', 'Female', 'Other') NOT NULL,
    nationality VARCHAR(50),
    religion VARCHAR(50),
    birth_certificate_no VARCHAR(20) UNIQUE NOT NULL,
    admission_no VARCHAR(20) UNIQUE NOT NULL,
    admission_date DATE NOT NULL,
    address VARCHAR(255),
    grade VARCHAR(10),
    class_name VARCHAR(20),
    current_status ENUM('Active', 'Transferred', 'Left', 'Expelled') DEFAULT 'Active',
    medium_of_study ENUM('Sinhala', 'Tamil', 'English') NOT NULL,
    blood_group ENUM('A+', 'A-', 'B+', 'B-', 'O+', 'O-', 'AB+', 'AB-')
);

DESC student;







INSERT INTO student (full_name, date_of_birth, gender, nationality, religion, birth_certificate_no, admission_no, admission_date, address, grade, class_name, current_status, medium_of_study, blood_group)
VALUES
('Kavindu Perera', '2010-05-14', 'Male', 'Sri Lankan', 'Buddhism', 'BC123456', 'ADM1001', '2016-01-10', 'Colombo 05, Colombo', '10', '10A', 'Active', 'Sinhala', 'B+'),
('Nethmi Fernando', '2011-08-20', 'Female', 'Sri Lankan', 'Catholic', 'BC123457', 'ADM1002', '2017-01-15', 'Negombo, Gampaha', '9', '9B', 'Active', 'English', 'O+'),
('Tharindu Silva', '2009-03-25', 'Male', 'Sri Lankan', 'Hindu', 'BC123458', 'ADM1003', '2015-02-01', 'Kandy, Central Province', '11', '11C', 'Active', 'Sinhala', 'A-'),
('Dilini Wickramasinghe', '2012-06-10', 'Female', 'Sri Lankan', 'Buddhism', 'BC123459', 'ADM1004', '2018-01-20', 'Galle, Southern Province', '8', '8D', 'Active', 'Sinhala', 'AB+'),
('Sachith Rajapaksa', '2013-12-05', 'Male', 'Sri Lankan', 'Muslim', 'BC123460', 'ADM1005', '2019-01-12', 'Matara, Southern Province', '7', '7A', 'Active', 'English', 'O-'),
('Ishara Senanayake', '2010-11-22', 'Female', 'Sri Lankan', 'Christian', 'BC123461', 'ADM1006', '2016-02-05', 'Kurunegala, North Western', '10', '10C', 'Active', 'Sinhala', 'B-'),
('Ravindu Jayasundara', '2008-09-14', 'Male', 'Sri Lankan', 'Buddhism', 'BC123462', 'ADM1007', '2014-01-10', 'Anuradhapura, North Central', '12', '12A', 'Active', 'Sinhala', 'A+'),
('Vishmi Balasuriya', '2011-01-30', 'Female', 'Sri Lankan', 'Hindu', 'BC123463', 'ADM1008', '2017-01-18', 'Jaffna, Northern', '9', '9A', 'Active', 'Tamil', 'O+'),
('Dineth Weerasinghe', '2013-07-21', 'Male', 'Sri Lankan', 'Buddhism', 'BC123464', 'ADM1009', '2019-01-15', 'Rathnapura, Sabaragamuwa', '7', '7B', 'Active', 'Sinhala', 'AB-'),
('Harini Jayawardena', '2012-02-17', 'Female', 'Sri Lankan', 'Catholic', 'BC123465', 'ADM1010', '2018-01-25', 'Badulla, Uva Province', '8', '8C', 'Active', 'English', 'B+'),
('Sandun Liyanage', '2010-06-29', 'Male', 'Sri Lankan', 'Buddhism', 'BC123466', 'ADM1011', '2016-01-30', 'Colombo 07, Colombo', '10', '10D', 'Active', 'Sinhala', 'O+'),
('Pasindu Alahakoon', '2009-05-08', 'Male', 'Sri Lankan', 'Christian', 'BC123467', 'ADM1012', '2015-01-20', 'Negombo, Gampaha', '11', '11B', 'Transferred', 'English', 'B-'),
('Chamodi Peris', '2011-12-15', 'Female', 'Sri Lankan', 'Hindu', 'BC123468', 'ADM1013', '2017-02-10', 'Kandy, Central Province', '9', '9D', 'Active', 'Sinhala', 'AB+'),
('Supun Gamage', '2012-04-02', 'Male', 'Sri Lankan', 'Buddhism', 'BC123469', 'ADM1014', '2018-01-05', 'Galle, Southern Province', '8', '8A', 'Active', 'Sinhala', 'O-'),
('Hansika De Silva', '2008-08-23', 'Female', 'Sri Lankan', 'Muslim', 'BC123470', 'ADM1015', '2014-01-08', 'Matara, Southern Province', '12', '12B', 'Active', 'English', 'A+'),
('Lahiru Dissanayake', '2013-11-11', 'Male', 'Sri Lankan', 'Buddhism', 'BC123471', 'ADM1016', '2019-01-20', 'Kurunegala, North Western', '7', '7D', 'Expelled', 'Sinhala', 'B-'),
('Navodya Rathnayake', '2012-10-30', 'Female', 'Sri Lankan', 'Christian', 'BC123472', 'ADM1017', '2018-02-05', 'Anuradhapura, North Central', '8', '8B', 'Active', 'Sinhala', 'O+'),
('Kavishka Nanayakkara', '2011-03-14', 'Male', 'Sri Lankan', 'Buddhism', 'BC123473', 'ADM1018', '2017-01-28', 'Jaffna, Northern', '9', '9C', 'Active', 'Tamil', 'AB-'),
('Imesha Rathnayake', '2010-09-18', 'Female', 'Sri Lankan', 'Catholic', 'BC123474', 'ADM1019', '2016-01-15', 'Rathnapura, Sabaragamuwa', '10', '10B', 'Left', 'Sinhala', 'A-'),
('Sasindu Amarasinghe', '2009-07-06', 'Male', 'Sri Lankan', 'Buddhism', 'BC123475', 'ADM1020', '2015-02-01', 'Badulla, Uva Province', '11', '11A', 'Active', 'English', 'B+');

SELECT * FROM student;
