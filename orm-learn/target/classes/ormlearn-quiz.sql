DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `us_id` int NOT NULL AUTO_INCREMENT,
  `us_name` varchar(45) NOT NULL,
  `us_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`us_id`));
INSERT INTO `user` VALUES (1,'Akilan','akilan@gmail.com'),(2,'Tom','tom@gmail.com');

DROP TABLE IF EXISTS `attempt`;
CREATE TABLE `attempt` (
  `at_id` int NOT NULL AUTO_INCREMENT,
  `at_date` date DEFAULT NULL,
  `at_us_id` int DEFAULT NULL,
  `at_score` double DEFAULT NULL,
  PRIMARY KEY (`at_id`),
  KEY `at_us_id_fkey_idx` (`at_us_id`),
  CONSTRAINT `at_us_id_fkey` FOREIGN KEY (`at_us_id`) REFERENCES `user` (`us_id`));
  INSERT INTO `attempt` VALUES (1,'2019-10-18',1,NULL);

DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `qt_id` int NOT NULL AUTO_INCREMENT,
  `qt_text` varchar(150) NOT NULL,
  PRIMARY KEY (`qt_id`));
INSERT INTO `question` VALUES (1,'What is the extendsion of the hyper text markup language file?'),
(2,'What is the maximum level of heading tag can be used in a HTML page?'),
(3,'The HTML document itself begins with <html> and  ends </html>. State True of False'),
(4,'Choose the right option to store text value in a variable');
  
DROP TABLE IF EXISTS `attempt_question`;
CREATE TABLE `attempt_question` (
  `aq_id` int NOT NULL AUTO_INCREMENT,
  `aq_at_id` int DEFAULT NULL,
  `aq_qt_id` int DEFAULT NULL,
  PRIMARY KEY (`aq_id`),
  KEY `qz_at_id_fkey_idx` (`aq_at_id`),
  KEY `ad_qt_id_idx` (`aq_qt_id`),
  CONSTRAINT `aq_at_id_fk` FOREIGN KEY (`aq_at_id`) REFERENCES `attempt` (`at_id`),
  CONSTRAINT `aq_qt_id_fk` FOREIGN KEY (`aq_qt_id`) REFERENCES `question` (`qt_id`));
INSERT INTO `attempt_question` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4);


DROP TABLE IF EXISTS `options`;
CREATE TABLE `options` (
  `op_id` int NOT NULL AUTO_INCREMENT,
  `op_qt_id` int DEFAULT NULL,
  `op_score` double DEFAULT NULL,
  `op_text` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`op_id`),
  KEY `op_qt_id_fkey_idx` (`op_qt_id`),
  CONSTRAINT `op_qt_id_fkey` FOREIGN KEY (`op_qt_id`) REFERENCES `question` (`qt_id`));
INSERT INTO `options` VALUES (1,1,0,'.ht'),(2,1,0,'.xhtm'),(3,1,1,'.html'),
(4,1,0,'.htmx'),(5,2,0,'3'),(6,2,1,'6'),(7,2,0,'4'),(8,2,0,'5'),(9,3,1,'true'),
(10,3,0,'false'),(11,4,0.5,'\"John\"'),(12,4,0,'/John/'),(13,4,0,'John'),(14,4,0.5,'\'John\'');

DROP TABLE IF EXISTS `attempt_question`;
CREATE TABLE `attempt_question` (
  `aq_id` int NOT NULL AUTO_INCREMENT,
  `aq_at_id` int DEFAULT NULL,
  `aq_qt_id` int DEFAULT NULL,
  PRIMARY KEY (`aq_id`),
  KEY `qz_at_id_fkey_idx` (`aq_at_id`),
  KEY `ad_qt_id_idx` (`aq_qt_id`),
  CONSTRAINT `aq_at_id_fk` FOREIGN KEY (`aq_at_id`) REFERENCES `attempt` (`at_id`),
  CONSTRAINT `aq_qt_id_fk` FOREIGN KEY (`aq_qt_id`) REFERENCES `question` (`qt_id`));
INSERT INTO `attempt_question` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4);

commit;