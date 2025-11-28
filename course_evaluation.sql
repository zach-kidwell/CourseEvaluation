--  Project 4 - Course Eval
--  Author: Zach Kidwell

-- Drop old db (for my testing)
DROP DATABASE IF EXISTS course_evaluation;
CREATE DATABASE course_evaluation;
USE course_evaluation;

-- Table: evaluation
-- Purpose: Stores all survey responses for each student
-- Each record corresponds to one completed evaluation form.

CREATE TABLE evaluation (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'Unique evaluation ID',
    q1 VARCHAR(10) COMMENT 'Instructor stimulated interest in the subject',
    q2 VARCHAR(10) COMMENT 'Instructor managed time and pace well',
    q3 VARCHAR(10) COMMENT 'Instructor was organized and prepared',
    q4 VARCHAR(10) COMMENT 'Instructor encouraged discussions',
    q5 VARCHAR(10) COMMENT 'Instructor demonstrated knowledge',
    q6 VARCHAR(10) COMMENT 'Instructor appeared enthusiastic',
    q7 VARCHAR(10) COMMENT 'Instructor used various teaching methods',
    q8 VARCHAR(10) COMMENT 'Instructor challenged students to do their best',
    q9 VARCHAR(10) COMMENT 'Instructor was accessible outside class',
    q10 VARCHAR(10) COMMENT 'Instructor prevented cheating',
    c2 VARCHAR(255) COMMENT 'Comments on Teaching Approaches',
    q11 VARCHAR(10) COMMENT 'Assessment info communicated clearly',
    q12 VARCHAR(10) COMMENT 'Feedback provided on time',
    q13 VARCHAR(10) COMMENT 'Feedback helped improve work',
    c3 VARCHAR(255) COMMENT 'Comments on Feedback and Assessment',
    q14 VARCHAR(10) COMMENT 'Course supported by library resources',
    q15 VARCHAR(10) COMMENT 'Blackboard resources were useful',
    q16 VARCHAR(10) COMMENT 'Instructor guided on finding resources',
    c4 VARCHAR(255) COMMENT 'Comments on Resources and Administration',
    q17 VARCHAR(10) COMMENT 'Syllabus explained at start',
    q18 VARCHAR(10) COMMENT 'Course delivered as outlined',
    q19 VARCHAR(10) COMMENT 'Grading criteria explained',
    q20 VARCHAR(10) COMMENT 'Exams related to learning outcomes',
    q21 VARCHAR(10) COMMENT 'Projects related to learning outcomes',
    c5 VARCHAR(255) COMMENT 'Comments on Additional Questions',
    q22 VARCHAR(10) COMMENT 'Course was worthwhile',
    q23 VARCHAR(10) COMMENT 'Would recommend to other students',
    q24 VARCHAR(10) COMMENT 'Overall rating of experience',
    q25 VARCHAR(10) COMMENT 'Hours spent per week on homework',
    c6 VARCHAR(255) COMMENT 'Comments on Overall Experience',
    q26 VARCHAR(10) COMMENT 'Contributed constructively during class',
    q27 VARCHAR(10) COMMENT 'Achieved learning outcomes',
    s_best VARCHAR(255) COMMENT 'What student liked best',
    s_least VARCHAR(255) COMMENT 'What student liked least',
    i_changes VARCHAR(255) COMMENT 'Recommended changes',
    i_more VARCHAR(255) COMMENT 'Additional comments'
) 

