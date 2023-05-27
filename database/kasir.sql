-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2023 at 08:51 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga` int(50) NOT NULL,
  `jumlah` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `nama`, `harga`, `jumlah`) VALUES
(21, 'Gula', 5000, 50),
(22, 'Mie Instan', 2000, 175),
(23, 'Kopi', 10000, 20),
(24, 'Sabun Mandi', 8000, 60),
(25, 'Minyak Goreng', 15000, 120),
(26, 'Tepung Terigu', 7000, 150),
(27, 'Susu Kental Manis', 12000, 60),
(28, 'Sarden Kaleng', 9000, 100),
(29, 'Teh Celup', 6000, 70),
(30, 'Garam', 3000, 100),
(31, 'Kecap Manis', 5000, 90),
(32, 'Saus Tomat', 7000, 100),
(33, 'Mentega', 10000, 35),
(34, 'Tepung Maizena', 4000, 90),
(35, 'Sikat Gigi', 3000, 200),
(36, 'Tissue Toilet', 6000, 150),
(37, 'Telur', 15000, 40),
(38, 'Beras', 20000, 6),
(39, 'Kacang Tanah', 5000, 40),
(40, 'Sirup', 10000, 60);

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `id` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `barang` varchar(50) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `harga` int(50) NOT NULL,
  `total` int(50) NOT NULL,
  `waktu_pembelian` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id`, `id_barang`, `barang`, `jumlah`, `harga`, `total`, `waktu_pembelian`) VALUES
(3, 30, 'Garam', 30, 3000, 90000, '2023-05-28 00:08:41'),
(4, 39, 'Kacang Tanah', 20, 5000, 100000, '2023-05-28 00:08:41'),
(5, 22, 'Mie Instan', 25, 2000, 50000, '2023-05-28 00:08:41'),
(6, 38, 'Beras', 24, 20000, 480000, '2023-05-28 00:16:51'),
(7, 33, 'Mentega', 15, 10000, 150000, '2023-05-28 00:16:51'),
(8, 21, 'Gula', 40, 5000, 200000, '2023-05-28 01:32:32'),
(9, 39, 'Kacang Tanah', 10, 5000, 50000, '2023-05-28 01:34:12'),
(10, 30, 'Garam', 20, 3000, 60000, '2023-05-28 01:37:41'),
(11, 23, 'Kopi', 30, 10000, 300000, '2023-05-28 01:37:41'),
(12, 31, 'Kecap Manis', 25, 5000, 125000, '2023-05-28 01:42:56'),
(13, 31, 'Kecap Manis', 5, 5000, 25000, '2023-05-28 01:49:03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_barang` (`id_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
