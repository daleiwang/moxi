-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: moxi
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `news_category`
--

DROP TABLE IF EXISTS `news_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `addDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '0，正常\n1，删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_category`
--

LOCK TABLES `news_category` WRITE;
/*!40000 ALTER TABLE `news_category` DISABLE KEYS */;
INSERT INTO `news_category` VALUES (1,'11','11asdasdasd','','2017-04-25 00:00:00',0),(2,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(3,'222','222','/img/profile_small.jpg','2017-04-25 00:00:00',3333),(4,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(5,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(6,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(7,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(8,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(9,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(10,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(11,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(12,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(13,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(14,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(15,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(16,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(17,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(18,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(19,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(20,'11','11','/userfiles/20170428161107.jpg','2017-04-25 00:00:00',0),(21,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(22,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(23,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(24,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(25,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(26,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(27,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(28,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(29,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(30,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(31,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(32,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(33,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(34,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(35,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(36,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(37,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(38,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(39,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(40,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(41,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(42,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(43,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(44,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(45,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(46,'11','11','/img/profile_small.jpg','2017-04-25 00:00:00',0),(47,'4444','4444','','2017-04-27 00:00:00',0),(48,'qweqe','qweqweqwe','','2017-04-27 00:00:00',0),(49,'890','890','','2017-04-27 16:27:30',0),(50,'123123','1231322','','2017-04-27 17:08:00',0),(51,'123123','123123123','','2017-04-27 17:08:51',0),(52,'qwewq','驱蚊器二','','2017-04-27 17:09:21',0),(53,'123','123213','','2017-04-27 17:10:07',0),(54,'12','12','','2017-04-28 10:41:12',0),(55,'21321','3123213','','2017-04-28 10:45:42',0),(56,'123123','21312313','/userfiles/20170428162510.jpg','2017-04-28 10:46:24',0);
/*!40000 ALTER TABLE `news_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-29 15:24:41
