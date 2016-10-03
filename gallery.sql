-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2014 at 11:39 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gallery`
--

-- --------------------------------------------------------

--
-- Table structure for table `artist`
--

CREATE TABLE IF NOT EXISTS `artist` (
  `artist_id` int(11) NOT NULL AUTO_INCREMENT,
  `style` varchar(25) DEFAULT NULL,
  `artist_name` varchar(35) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `phone_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`artist_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `artist`
--

INSERT INTO `artist` (`artist_id`, `style`, `artist_name`, `location`, `phone_num`) VALUES
(1, 'Renaissance', 'Donatello', 'Italy', 2105456767),
(2, 'Renaissance', 'Sandro Botticelli', 'Italy', 434675890),
(3, 'Renaissance', 'Leonardo da Vinci', 'Italy', 232456567),
(4, 'Renaissance', 'Michelangelo Buonarroti', 'Italy', 437800989),
(5, 'Renaissance', 'El Greco', 'Spain', 232454567),
(6, 'Baroque', 'Caravaggio', 'Italy', 437333396),
(7, 'Baroque', 'Peter Paul Rubens', 'Germany', 778800989),
(8, 'Baroque', 'Gian Lorenzo Bernini', 'Italy', 437800989),
(9, 'Impressionism', 'Camille Pissarro', 'France', 232488067),
(10, 'Impressionism', 'Edouard Manet', 'France', 437333396),
(11, 'Impressionism', 'Edgar Degas', 'France', 743450989),
(12, 'Impressionism', 'Claude Monet', 'France', 437806789),
(13, 'Expressionism', 'Edvard Munch', 'Norway', 233434567),
(14, 'Symbolism', 'Gustav Klimt', 'Hungary', 436589496),
(15, 'Modernism', 'Henri Matisse', 'France', 778889657),
(16, 'Expressionism', 'Paul Klee', 'Germany', 999800989),
(17, 'Cubism', 'Pablo Picasso', 'Spain', 436543496),
(18, 'Realism', 'Edward Hopper', 'USA', 778889777),
(19, 'Abstract', 'Wassily Kandinsky', 'Russia', 98765434),
(20, 'Surrealism', 'Salvador Dali', 'Spain', 987343454);

-- --------------------------------------------------------

--
-- Table structure for table `artist_customer`
--

CREATE TABLE IF NOT EXISTS `artist_customer` (
  `cust_id` int(11) DEFAULT NULL,
  `artist_id` int(11) DEFAULT NULL,
  KEY `FK_is_liked` (`artist_id`),
  KEY `FK_likes` (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artist_customer`
--

INSERT INTO `artist_customer` (`cust_id`, `artist_id`) VALUES
(2, 10),
(1, 13),
(7, 3),
(2, 8),
(2, 12),
(6, 13),
(10, 15),
(1, 16),
(8, 15),
(9, 19),
(1, 18),
(2, 14),
(3, 5),
(4, 11),
(5, 16),
(6, 20),
(7, 3),
(8, 2),
(9, 3),
(10, 9);

-- --------------------------------------------------------

--
-- Table structure for table `artwork`
--

CREATE TABLE IF NOT EXISTS `artwork` (
  `title` varchar(50) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  `artist_id` int(11) NOT NULL,
  `genre` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `year_created` int(11) DEFAULT NULL,
  `year_insert` int(11) DEFAULT NULL,
  PRIMARY KEY (`title`),
  KEY `FK_ordered2` (`order_id`),
  KEY `FK_paints` (`artist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artwork`
--

INSERT INTO `artwork` (`title`, `order_id`, `artist_id`, `genre`, `price`, `year_created`, `year_insert`) VALUES
('Apollo and Daphne', 1, 8, 'Sculpture', 100, 1622, 2005),
('Apparatus and Hand', NULL, 20, 'Painting', 1000, 1927, 2008),
('Automat', NULL, 18, 'Painting', 345, 1937, 2011),
('Beach in Pourville', NULL, 12, 'Painting', 1500, 1882, 2013),
('Black and Violet', 2, 19, 'Painting', 500, 1923, 2009),
('David', 3, 4, 'Sculpture', 850, 1504, 2009),
('Equestrian statue of Gattamelata', 4, 1, 'Sculpture', 600, 1453, 2008),
('Guernica', 5, 17, 'Painting', 500, 1937, 2011),
('Impression Sunrise', 6, 12, 'Painting', 500, 1872, 2012),
('Narcissus', 7, 6, 'Painting', 500, 1599, 2009),
('Olympia', NULL, 10, 'Painting', 1000, 1863, 2013),
('Opening of the Fifth Seal', 8, 5, 'Painting', 450, 1614, 2011),
('Saint Mark', 9, 1, 'Sculpture', 500, 1411, 2008),
('test', 3, 7, 'Painting', 135, 1351, 2001),
('The Birth of Venus', 10, 2, 'Painting', 400, 1486, 2011),
('The Burial of the Count of Orgaz', NULL, 5, 'Painting', 1300, 1586, 2008),
('The Dance', NULL, 15, 'Painting', 450, 1909, 2011),
('The Dance Class', 11, 11, 'Painting', 500, 1879, 2009),
('The Feast of Herod', NULL, 1, 'Sculpture', 300, 1427, 2011),
('The kiss', 12, 14, 'Painting', 100, 1907, 2008),
('The Last Judgment', NULL, 4, 'Painting', 1200, 1540, 2014),
('The Last Supper', 13, 3, 'Painting', 1500, 1495, 2009),
('The Persistence of Memory', 14, 20, 'Painting', 400, 1931, 2008),
('The Raising of the Cross', 15, 7, 'Painting', 500, 1611, 2005),
('The Scream', 16, 13, 'Painting', 500, 1893, 2008),
('Twittering Machine', 17, 16, 'Painting', 200, 1922, 2010),
('Two Women Chatting by the Sea', 18, 9, 'Painting', 200, 1856, 2012),
('Venus and Mars', 19, 2, 'Painting', 200, 1483, 2011),
('View of Toledo', 20, 5, 'Painting', 2500, 1600, 2005),
('Vitruvian Man', 21, 3, 'Drawing', 1000, 1487, 2009),
('Woman Reading', 22, 15, 'Painting', 150, 1894, 2012);

-- --------------------------------------------------------

--
-- Table structure for table `artwork_group`
--

CREATE TABLE IF NOT EXISTS `artwork_group` (
  `title` varchar(50) DEFAULT NULL,
  `name_group` varchar(25) NOT NULL,
  KEY `FK_classify` (`title`),
  KEY `FK_has` (`name_group`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artwork_group`
--

INSERT INTO `artwork_group` (`title`, `name_group`) VALUES
('Apollo and Daphne', 'Marble Sculpture'),
('Apparatus and Hand', 'Geometric'),
('Automat', 'Geometric'),
('Beach in Pourville', 'Oil Canvas'),
('Black and Violet', 'Geometric'),
('Black and Violet', '20th Century'),
('David', 'Italian Renaissance'),
('David', 'Marble Sculpture'),
('Equestrian statue of Gattamelata', 'Bronze Sculpture'),
('Guernica', '20th Century'),
('Guernica', 'Oil Canvas'),
('Impression Sunrise', 'Oil Canvas'),
('Impression Sunrise', '20th Century'),
('Narcissus', 'Oil Canvas'),
('Narcissus', 'Italian Renaissance'),
('Olympia', 'Oil Canvas'),
('Opening of the Fifth Seal', 'Oil Canvas'),
('Saint Mark', 'Marble Sculpture'),
('The Birth of Venus', 'Oil Canvas'),
('The Burial of the Count of Orgaz', '20th Century'),
('The Dance', '20th Century'),
('The Dance Class', '20th Century'),
('The Feast of Herod', 'Oil Canvas'),
('The kiss', 'Geometric'),
('The Last Judgment', 'Oil Canvas'),
('The Last Judgment', 'Italian Renaissance'),
('The Last Supper', 'Italian Renaissance'),
('The Last Supper', 'Oil Canvas'),
('The Persistence of Memory', '20th Century'),
('The Persistence of Memory', 'Oil Canvas'),
('The Raising of the Cross', 'Oil Canvas'),
('The Scream', '20th Century'),
('The Scream', 'Oil Canvas'),
('Twittering Machine', 'Oil Canvas'),
('Two Women Chatting by the Sea', 'Oil Canvas'),
('Venus and Mars', 'Italian Renaissance'),
('View of Toledo', 'Oil Canvas'),
('Vitruvian Man', 'Geometric'),
('Woman Reading', 'Oil Canvas'),
('Woman Reading', '20th Century');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(35) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cust_id`, `cust_name`, `telephone`) VALUES
(1, 'Maria Siapera', 888786898),
(2, 'John Doe', 434232565),
(3, 'Anastasia Geleri', 555786898),
(4, 'Angelina Jolie', 434232777),
(5, 'Johny Depp', 555326898),
(6, 'Jennifer Aniston', 940732777),
(7, 'Carlos Navarro', 432586898),
(8, 'Rodriguez Juanito', 434233435),
(9, 'Nicolas Cage', 555786849),
(10, 'Han Solo', 434232777);

-- --------------------------------------------------------

--
-- Table structure for table `group_`
--

CREATE TABLE IF NOT EXISTS `group_` (
  `name_group` varchar(25) NOT NULL,
  PRIMARY KEY (`name_group`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `group_`
--

INSERT INTO `group_` (`name_group`) VALUES
('20th Century'),
('Bronze Sculpture'),
('Geometric'),
('Italian Renaissance'),
('Marble Sculpture'),
('Oil Canvas'),
('Photographs'),
('Portraits');

-- --------------------------------------------------------

--
-- Table structure for table `order_`
--

CREATE TABLE IF NOT EXISTS `order_` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `cust_id` int(11) NOT NULL,
  `order_year` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK_ordered` (`title`),
  KEY `FK_orders` (`cust_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `order_`
--

INSERT INTO `order_` (`order_id`, `title`, `cust_id`, `order_year`) VALUES
(1, 'Apollo and Daphne', 1, 2012),
(2, 'Black and Violet', 6, 2013),
(3, 'David', 5, 2014),
(4, 'Equestrian statue of Gattamelata', 10, 2010),
(5, 'Guernica', 6, 2013),
(6, 'Impression Sunrise', 6, 2014),
(7, 'Narcissus', 4, 2011),
(8, 'Opening of the Fifth Seal', 2, 2012),
(9, 'Saint Mark', 3, 2010),
(10, 'The Birth of Venus', 7, 2014),
(11, 'The Dance Class', 6, 2013),
(12, 'The kiss', 8, 2010),
(13, 'The Last Supper', 4, 2011),
(14, 'The Persistence of Memory', 1, 2012),
(15, 'The Raising of the Cross', 9, 2010),
(16, 'The Scream', 6, 2009),
(17, 'Twittering Machine', 7, 2014),
(18, 'Two Women Chatting by the Sea', 7, 2014),
(19, 'Venus and Mars', 8, 2014),
(20, 'View of Toledo', 6, 2014),
(21, 'Vitruvian Man', 1, 2014),
(22, 'Woman Reading', 8, 2014);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `artist_customer`
--
ALTER TABLE `artist_customer`
  ADD CONSTRAINT `FK_is_liked` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`artist_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_likes` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `artwork`
--
ALTER TABLE `artwork`
  ADD CONSTRAINT `FK_ordered2` FOREIGN KEY (`order_id`) REFERENCES `order_` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_paints` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`artist_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `artwork_group`
--
ALTER TABLE `artwork_group`
  ADD CONSTRAINT `FK_classify` FOREIGN KEY (`title`) REFERENCES `artwork` (`title`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_has` FOREIGN KEY (`name_group`) REFERENCES `group_` (`name_group`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `order_`
--
ALTER TABLE `order_`
  ADD CONSTRAINT `FK_ordered` FOREIGN KEY (`title`) REFERENCES `artwork` (`title`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_orders` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
