-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-04-2021 a las 04:18:33
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_envios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `Empleados_ID` varchar(10) NOT NULL,
  `Contraseña` varchar(10) NOT NULL,
  `Primer_Nombre` varchar(30) NOT NULL,
  `Segundo_Nombre` varchar(30) DEFAULT NULL,
  `Primer_Apellido` varchar(30) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Telefono` varchar(10) DEFAULT NULL,
  `Rol` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `envios`
--

CREATE TABLE `envios` (
  `Envios_ID` varchar(10) NOT NULL,
  `Usuario_ID` varchar(10) DEFAULT NULL,
  `Nombre_Usuario` varchar(30) NOT NULL,
  `Apellido_Usuario` varchar(30) DEFAULT NULL,
  `Ciudad_Origen` varchar(30) NOT NULL,
  `Ciudad_Destino` varchar(30) NOT NULL,
  `Fecha` date NOT NULL,
  `Costo_Envio` varchar(30) DEFAULT NULL,
  `Usuarios_Usuarios_ID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Usuarios_ID` varchar(10) NOT NULL,
  `Primer_Nombre` varchar(30) NOT NULL,
  `Segundo_Nombre` varchar(30) DEFAULT NULL,
  `Primer_Apellido` varchar(30) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Direccion` varchar(30) DEFAULT NULL,
  `Telefon` varchar(30) DEFAULT NULL,
  `Ciudad` varchar(30) DEFAULT NULL,
  `Empleados_Empleados_ID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`Empleados_ID`);

--
-- Indices de la tabla `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`Envios_ID`),
  ADD KEY `fk_Envios_Usuarios1_idx` (`Usuarios_Usuarios_ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Usuarios_ID`),
  ADD KEY `fk_Usuarios_Empleados1_idx` (`Empleados_Empleados_ID`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `envios`
--
ALTER TABLE `envios`
  ADD CONSTRAINT `fk_Envios_Usuarios1` FOREIGN KEY (`Usuarios_Usuarios_ID`) REFERENCES `usuarios` (`Usuarios_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_Usuarios_Empleados1` FOREIGN KEY (`Empleados_Empleados_ID`) REFERENCES `empleados` (`Empleados_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
