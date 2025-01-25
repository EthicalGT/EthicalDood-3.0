-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2024 at 02:47 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ethicaldood`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_files`
--

CREATE TABLE `admin_files` (
  `filename` varchar(50) NOT NULL,
  `fpath` varchar(50) NOT NULL,
  `fdesc` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_files`
--

INSERT INTO `admin_files` (`filename`, `fpath`, `fdesc`) VALUES
('ED Documentation', 'pdf/admin_files/ED Documentation.pdf', 'This is a Project documentation file. '),
('ED 2.0', 'pdf/admin_files/ED 2.0.pdf', 'this is ED 2.0 documentation file.');

-- --------------------------------------------------------

--
-- Table structure for table `admin_forum`
--

CREATE TABLE `admin_forum` (
  `msg` varchar(500) NOT NULL,
  `datetime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_forum`
--

INSERT INTO `admin_forum` (`msg`, `datetime`) VALUES
('Hello sakshi! I will recommend you JDK 21 which is the latest and stable JDK release and greatly efficient with new features!', '2024-04-15 14:21:37'),
('Hi i am GT', '2024-04-16 11:32:20');

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `adminname` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`adminname`, `password`) VALUES
('ganeshtelore', 'GT@2004.');

-- --------------------------------------------------------

--
-- Table structure for table `advance_java`
--

CREATE TABLE `advance_java` (
  `name` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL,
  `tutorial` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `advance_java`
--

INSERT INTO `advance_java` (`name`, `path`, `tutorial`) VALUES
('Assignment 1', 'pdf/Advance Java/GT Assignment 1.pdf', ''),
('Assignment 2', 'pdf/Advance Java/GT Assignment 2.pdf', ''),
('Assignment 3', 'pdf/Advance Java/GT Assignment 3.pdf', ''),
('Assignment 4', 'pdf/Advance Java/GT Assignment 4.pdf', ''),
('Assignment 5', 'pdf/Advance Java/GT Assignment 5.pdf', '');

-- --------------------------------------------------------

--
-- Table structure for table `adv_php`
--

CREATE TABLE `adv_php` (
  `name` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adv_php`
--

INSERT INTO `adv_php` (`name`, `path`) VALUES
('Assignment 1', 'pdf/Advance PHP/GT ASSIGNMENT 1.pdf'),
('Assignment 2', 'pdf/Advance PHP/GT ASSIGNMENT 2.pdf'),
('Assignment 3', 'pdf/Advance PHP/GT ASSIGNMENT 3.pdf'),
('Assignment 4', 'pdf/Advance PHP/GT ASSIGNMENT 4.pdf'),
('Assignment 5', 'pdf/Advance PHP/GT ASSIGNMENT 5.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `android`
--

CREATE TABLE `android` (
  `name` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL,
  `tutorial` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `android`
--

INSERT INTO `android` (`name`, `path`, `tutorial`) VALUES
('Assignment 1', 'pdf/android/GT Android 1.pdf', ''),
('Assignment 2', 'pdf/android/GT Android 2.pdf', ''),
('Assignment 3', 'pdf/android/GT Android 1.pdf', ''),
('Assignment 4', 'pdf/android/GT Android 1.pdf', ''),
('Assignment 5', 'pdf/android/GT Android 1.pdf', ''),
('Assignment 6', 'pdf/android/GT Android 1.pdf', ''),
('Assignment 7', 'pdf/android/GT Android 1.pdf', '');

-- --------------------------------------------------------

--
-- Table structure for table `deleted_files`
--

CREATE TABLE `deleted_files` (
  `reason` varchar(1000) NOT NULL,
  `datetime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `deleted_files`
--

INSERT INTO `deleted_files` (`reason`, `datetime`) VALUES
('Ganesh Telore  Your uploaded content is copied from ED Admin uploads.', '2023-12-31 19:59:17');

-- --------------------------------------------------------

--
-- Table structure for table `ebooks`
--

CREATE TABLE `ebooks` (
  `bookname` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ebooks`
--

INSERT INTO `ebooks` (`bookname`, `path`) VALUES
('C', 'pdf/ebooks/c.pdf'),
('C++', 'pdf/ebooks/c++.pdf'),
('PHP', 'pdf/ebooks/php.pdf'),
('Java', 'pdf/ebooks/java.pdf'),
('Web Technology', 'pdf/ebooks/web technology.pdf'),
('Python', 'pdf/ebooks/python.pdf'),
('Android Programming', 'pdf/ebooks/android.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `feedbacks`
--

CREATE TABLE `feedbacks` (
  `name` varchar(30) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `message` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feedbacks`
--

INSERT INTO `feedbacks` (`name`, `contact`, `message`) VALUES
('Tony Stark', '9834576585', 'Fabulous Project!!!'),
('dvdffx', 'ffxfffn', 'dvff'),
('hel34', '4y45', 'sdsbxfb');

-- --------------------------------------------------------

--
-- Table structure for table `html`
--

CREATE TABLE `html` (
  `name` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL,
  `tutorial` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `html`
--

INSERT INTO `html` (`name`, `path`, `tutorial`) VALUES
('Assignment 1', 'pdf/HTML/HTML Assignment 1.pdf', 'tutorial/HTML Assignment 1.mp4'),
('Assignment 2', 'pdf/HTML/HTML Assignment 2.pdf', 'tutorial/HTML Assignment 2.mp4'),
('Assignment 3', 'pdf/HTML/HTML Assignment 3.pdf', 'tutorial/HTML Assignment 3.mp4'),
('Assignment 4', 'pdf/HTML/HTML Assignment 4.pdf', 'tutorial/HTML Assignment 4.mp4'),
('Assignment 5', 'pdf/HTML/HTML Assignment 5.pdf', 'tutorial/HTML Assignment 5.mp4'),
('Assignment 6', 'pdf/HTML/HTML Assignment 6.pdf', 'tutorial/HTML Assignment 6.mp4'),
('Homework', 'pdf/HTML/HOME WORK.pdf', 'NULL');

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

CREATE TABLE `java` (
  `name` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `java`
--

INSERT INTO `java` (`name`, `path`) VALUES
('Assignment 1', 'pdf/Java/GT Assignment 1.pdf'),
('Assignment 2', 'pdf/Java/GT Assignment 2.pdf'),
('Assignment 3', 'pdf/Java/GT Assignment 3.pdf'),
('Assignment 4', 'pdf/Java/GT Assignment 4.pdf'),
('Assignment 5', 'pdf/Java/GT Assignment 5.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `php`
--

CREATE TABLE `php` (
  `name` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `php`
--

INSERT INTO `php` (`name`, `path`) VALUES
('Assignment 1', 'pdf/PHP/Assignment 1.pdf'),
('Assignment 2', 'pdf/PHP/Assignment 2.pdf'),
('Assignment 3', 'pdf/PHP/Assignment 3.pdf'),
('Assignment 4', 'pdf/PHP/Assignment 4.pdf'),
('Assignment 5', 'pdf/PHP/Assignment 5.pdf'),
('Assignment 6', 'pdf/PHP/Assignment 6.pdf'),
('Assignment 7', 'pdf/PHP/Assignment 7.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `user_files`
--

CREATE TABLE `user_files` (
  `fid` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `mname` varchar(40) NOT NULL,
  `filename` varchar(20) NOT NULL,
  `filepath` varchar(50) NOT NULL,
  `filedesc` varchar(800) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_files`
--

INSERT INTO `user_files` (`fid`, `username`, `mname`, `filename`, `filepath`, `filedesc`) VALUES
(3, 'Z2FuZXNodGVsb3Jl', 'Ganesh Telore', 'Solved java slips', 'pdf/user_files/GT JAVA Slips.pdf', 'Its a set of 30 solved java slips. Good luck!');

-- --------------------------------------------------------

--
-- Table structure for table `user_forum`
--

CREATE TABLE `user_forum` (
  `msg` varchar(800) NOT NULL,
  `datetime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_forum`
--

INSERT INTO `user_forum` (`msg`, `datetime`) VALUES
('Hello Admin, I am Sakshi!!!', '2023-12-30 19:07:04'),
('Which version of JDK is best for GUI Design as well as College Project?', '2023-12-30 19:07:51'),
('HI', '2024-04-16 11:30:16');

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `uname` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`username`, `password`, `uname`, `email`, `status`) VALUES
('Z2FuZXNodGVsb3Jl', 'R1RAMjAwNA==', 'Ganesh Telore', 'ganeshtelore4@gmail.com', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_login`
--
ALTER TABLE `admin_login`
  ADD PRIMARY KEY (`adminname`);

--
-- Indexes for table `user_files`
--
ALTER TABLE `user_files`
  ADD PRIMARY KEY (`fid`),
  ADD KEY `fk_user_files_username` (`username`);

--
-- Indexes for table `user_forum`
--
ALTER TABLE `user_forum` ADD FULLTEXT KEY `msg` (`msg`);

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_files`
--
ALTER TABLE `user_files`
  MODIFY `fid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user_files`
--
ALTER TABLE `user_files`
  ADD CONSTRAINT `fk_user_files_username` FOREIGN KEY (`username`) REFERENCES `user_login` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
