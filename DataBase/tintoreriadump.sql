-- MySQL dump 10.13  Distrib 8.1.0, for Win64 (x86_64)
--
-- Host: localhost    Database: tintoreria
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `calcula_total`
--

DROP TABLE IF EXISTS `calcula_total`;
/*!50001 DROP VIEW IF EXISTS `calcula_total`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `calcula_total` AS SELECT 
 1 AS `sum(costo_unitario*cantidad)`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `IdCliente` int NOT NULL AUTO_INCREMENT,
  `Paterno` varchar(20) NOT NULL,
  `Materno` varchar(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `calle` varchar(35) DEFAULT NULL,
  `colonia` varchar(25) DEFAULT NULL,
  `localidad` varchar(25) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`IdCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Rivera','Hernandez','Mauricio','Tatahulcapan \"C\"','Xalapa 2000','Xalapa, Ver.','1873942'),(2,'Trujillo','Martinez','Oscar','Av. Xalapa 132','Centro','Xalapa, Ver.','1962722'),(3,'Ortigoza','Osorio','Miguel','Americas 115','El Mirador','Xalapa, Ver.','1483740'),(4,'Lara','Fernandez','Jose Manuel','Camino Antiguo a Coatepec 22','Emiliano Zapata','Xalapa, Ver.','1292270'),(5,'Perez','Castillo','Omar','Miguel Rebolledo 45','Centro','Coatepec, Ver.','8158587'),(6,'Trujillo','Mendoza','Luis Angel','Av. Principal','Centro','Las Trancas, Ver.','8169272'),(7,'Ramón','González','Pérez',NULL,NULL,NULL,NULL),(8,'Vazquez','Ramirez','Zaid Alexis',NULL,NULL,NULL,NULL),(9,'Pale','Molina','Emmanuel',NULL,NULL,NULL,NULL),(10,'Carrion','Romero','David',NULL,NULL,NULL,NULL),(11,'Velazquez','Chicuellar','Carim','Calle FEI','Del Maistro','Av. Xalapa','2289032271'),(12,'carrion','romero','david','calle circuito','xalapa 3000','xalapa','228223344');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalleservicio`
--

DROP TABLE IF EXISTS `detalleservicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalleservicio` (
  `IdPrenda` int NOT NULL,
  `Folio` int NOT NULL,
  `costo_unitario` double DEFAULT NULL,
  `cantidad` int NOT NULL,
  `subtotal` double NOT NULL,
  KEY `IdPrenda` (`IdPrenda`),
  KEY `Folio` (`Folio`),
  CONSTRAINT `detalleservicio_ibfk_1` FOREIGN KEY (`IdPrenda`) REFERENCES `prendas` (`IdPrenda`),
  CONSTRAINT `detalleservicio_ibfk_2` FOREIGN KEY (`Folio`) REFERENCES `servicio` (`Folio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleservicio`
--

LOCK TABLES `detalleservicio` WRITE;
/*!40000 ALTER TABLE `detalleservicio` DISABLE KEYS */;
INSERT INTO `detalleservicio` VALUES (6,1,70,1,70),(2,1,20,2,40),(4,1,10,1,10),(2,2,40,1,40),(8,2,90,1,90);
/*!40000 ALTER TABLE `detalleservicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `NoPersonal` int NOT NULL AUTO_INCREMENT,
  `Paterno` varchar(20) NOT NULL,
  `materno` varchar(20) DEFAULT NULL,
  `Nombre` varchar(20) NOT NULL,
  `IdPuesto` int NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `ContratacionFecha` date NOT NULL,
  `Turno` varchar(15) NOT NULL,
  PRIMARY KEY (`NoPersonal`),
  KEY `IdPuesto` (`IdPuesto`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`IdPuesto`) REFERENCES `puestos` (`IdPuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Juarez',NULL,'Ricardo',2,'Z.Mercado 4','4578466','2010-02-03','M'),(2,'Hernandez','Gonzalez','Alejandra',1,'Av. Xalapa SN','3457869','2009-03-05','N'),(3,'Vazquez','Ramirez','Zaid Alexis',2,'Andador Capricornio 34','2281032271','2004-12-19','M'),(4,'Atzin','Olarte','Erick Abdiel',2,'Calle Facultades 121','2284032772','2015-05-14','N');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrega`
--

DROP TABLE IF EXISTS `entrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrega` (
  `Repartidor` int NOT NULL,
  `FecharEntrega` date DEFAULT NULL,
  `HoraEntrega` time DEFAULT NULL,
  `Entregado` varchar(10) NOT NULL,
  `Notas` varchar(40) DEFAULT NULL,
  `Folio` int NOT NULL,
  KEY `Repartidor` (`Repartidor`),
  KEY `Folio` (`Folio`),
  CONSTRAINT `entrega_ibfk_1` FOREIGN KEY (`Repartidor`) REFERENCES `empleados` (`NoPersonal`),
  CONSTRAINT `entrega_ibfk_2` FOREIGN KEY (`Folio`) REFERENCES `servicio` (`Folio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrega`
--

LOCK TABLES `entrega` WRITE;
/*!40000 ALTER TABLE `entrega` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prendas`
--

DROP TABLE IF EXISTS `prendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prendas` (
  `IdPrenda` int NOT NULL AUTO_INCREMENT,
  `Prenda` varchar(20) NOT NULL,
  `Costo_plancha` double DEFAULT NULL,
  `Costo_tinto` double DEFAULT NULL,
  `Costo_lavar` double DEFAULT NULL,
  PRIMARY KEY (`IdPrenda`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prendas`
--

LOCK TABLES `prendas` WRITE;
/*!40000 ALTER TABLE `prendas` DISABLE KEYS */;
INSERT INTO `prendas` VALUES (2,'Pantalon',25,40,20),(3,'Saco',25,40,20),(4,'Blusa',10,30,10),(5,'Vestido coctel',40,45,35),(6,'Vestido fiesta',NULL,45,50),(7,'Chamarra corta',NULL,70,50),(8,'Chamarra larga',NULL,90,55);
/*!40000 ALTER TABLE `prendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puestos`
--

DROP TABLE IF EXISTS `puestos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puestos` (
  `IdPuesto` int NOT NULL AUTO_INCREMENT,
  `Puesto` varchar(20) NOT NULL,
  `Salario` double NOT NULL,
  PRIMARY KEY (`IdPuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puestos`
--

LOCK TABLES `puestos` WRITE;
/*!40000 ALTER TABLE `puestos` DISABLE KEYS */;
INSERT INTO `puestos` VALUES (1,'Gerente',15000),(2,'Mostrador',5000);
/*!40000 ALTER TABLE `puestos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `salario_promedio`
--

DROP TABLE IF EXISTS `salario_promedio`;
/*!50001 DROP VIEW IF EXISTS `salario_promedio`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `salario_promedio` AS SELECT 
 1 AS `avg(salario)`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `salario_promedio_gerente`
--

DROP TABLE IF EXISTS `salario_promedio_gerente`;
/*!50001 DROP VIEW IF EXISTS `salario_promedio_gerente`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `salario_promedio_gerente` AS SELECT 
 1 AS `avg(salario)`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicio` (
  `Folio` int NOT NULL AUTO_INCREMENT,
  `Total` double NOT NULL,
  `Fecha` date NOT NULL,
  `IdCliente` int NOT NULL,
  `NoPersonal` int NOT NULL,
  PRIMARY KEY (`Folio`),
  KEY `IdCliente` (`IdCliente`),
  KEY `NoPersonal` (`NoPersonal`),
  CONSTRAINT `servicio_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`),
  CONSTRAINT `servicio_ibfk_2` FOREIGN KEY (`NoPersonal`) REFERENCES `empleados` (`NoPersonal`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
INSERT INTO `servicio` VALUES (1,120,'2012-01-03',2,1),(2,130,'2023-12-19',8,4);
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `Usuario` varchar(15) NOT NULL,
  `contrasenia` varchar(10) NOT NULL,
  `NoPersonal` int NOT NULL,
  PRIMARY KEY (`Usuario`),
  KEY `NoPersonal` (`NoPersonal`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`NoPersonal`) REFERENCES `empleados` (`NoPersonal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `calcula_total`
--

/*!50001 DROP VIEW IF EXISTS `calcula_total`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`tinto`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `calcula_total` AS select sum((`detalleservicio`.`costo_unitario` * `detalleservicio`.`cantidad`)) AS `sum(costo_unitario*cantidad)` from `detalleservicio` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `salario_promedio`
--

/*!50001 DROP VIEW IF EXISTS `salario_promedio`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`tinto`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `salario_promedio` AS select avg(`puestos`.`Salario`) AS `avg(salario)` from `puestos` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `salario_promedio_gerente`
--

/*!50001 DROP VIEW IF EXISTS `salario_promedio_gerente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`tinto`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `salario_promedio_gerente` AS select avg(`puestos`.`Salario`) AS `avg(salario)` from `puestos` where (`puestos`.`IdPuesto` = 1) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-04 10:23:50
