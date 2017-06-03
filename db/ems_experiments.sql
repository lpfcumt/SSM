-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: ems
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Table structure for table `experiments`
--

DROP TABLE IF EXISTS `experiments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experiments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cate` varchar(255) DEFAULT NULL,
  `createtime` varchar(255) DEFAULT NULL,
  `credit` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `endtime` varchar(255) DEFAULT NULL,
  `field` varchar(255) DEFAULT NULL,
  `frontcate` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `outline` varchar(255) DEFAULT NULL,
  `pay` varchar(255) DEFAULT NULL,
  `principals` varchar(255) DEFAULT NULL,
  `requirement` varchar(255) DEFAULT NULL,
  `screenings` int(11) DEFAULT NULL,
  `starttime` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `teachers_email` varchar(255) DEFAULT NULL,
  `teachers_id` int(11) DEFAULT NULL,
  `teachers_name` varchar(255) DEFAULT NULL,
  `teachers_tel` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `pubexper` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiments`
--

LOCK TABLES `experiments` WRITE;
/*!40000 ALTER TABLE `experiments` DISABLE KEYS */;
INSERT INTO `experiments` VALUES (3,'现场学分实验','2017-05-10 00:00:00','2.5','携带学生证提前5分钟签到','2017-05-13 16:55:00','管理学院嘉庚一512',NULL,'YLJ01_消费者心理实验_SC','日常消费实验，只需按照要求作答',NULL,'贾艳丽',NULL,0,'2017-05-13 14:00:00','已创建','yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','http://baidu.com','已发布'),(4,'现场现金实验','2017-05-14 00:00:00',NULL,'										携带学生证提前5分钟签到\n										','2017-05-20 17:00:00','管理学院嘉庚一512','','YL01_消费者行为学实验_PW','日常消费实验，只需按照要求作答','20','贾艳丽','',0,'2017-05-20 13:00:00','已完成','yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','https://baidu.com','已发布'),(5,'现场现金实验','2017-05-15 00:00:00','','携带学生证提前5分钟签到','2017-05-21 12:00:00','管理学院嘉庚一512','','YL02_消费者行为学实验_PW','日常消费实验，只需按照要求作答','20','贾艳丽','',0,'2017-05-21 08:00:00','已完成','yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','https://baidu.com','已发布'),(6,'现场现金实验','2017-05-16 00:00:00','','携带学生证提前5分钟签到','2017-05-21 17:00:00','管理学院嘉庚一512','','YL03_消费者行为学实验_SC','日常消费实验，只需按照要求作答','30','贾艳丽','',0,'2017-05-21 14:00:00','已完成','yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','http://baidu.com','已发布'),(7,'现场现金实验','2017-05-18 11:30:13',NULL,'日常消费决策，你只需要按照要求作答。','2017-05-26 22:00:00','管理学院嘉庚一406','无前置实验','YL04_消费者行为学实验_PW','请携带学生证提前5分钟到场签到','20','贾艳丽',NULL,0,'2017-05-22 18:30:00',NULL,'yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','www.baidu.com','未发布'),(8,'现场现金实验','2017-05-18 11:36:56',NULL,'																				日常消费决策，按照要求作答即可。\n										\n										','2017-05-27 11:30:00','管理学院嘉庚一512','无前置实验','YL04_消费者行为学实验_PW','请携带学生证，提前5分钟到场签到','20','贾艳丽',NULL,0,'2017-05-27 08:30:00','已创建','yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','www.baidu.com','已发布'),(10,'现场现金实验','2017-05-23 07:34:46',NULL,'										日常消费决策，只需要按照要求作答。\n										','2017-05-27 17:30:00','管理学院嘉庚一512','无前置实验',' YL05_消费者行为学实验_PW','携带学生证，提前5分钟到场签到','20','贾艳丽',NULL,0,'2017-05-27 13:30:00','已创建','yanlijia@xmu.edu.cn',1,'贾艳丽','15959296007','www.baidu.com','已发布');
/*!40000 ALTER TABLE `experiments` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-03  0:11:54
