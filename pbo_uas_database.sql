-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2024 at 05:10 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_uas_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `form_mahasiswa`
--

CREATE TABLE `form_mahasiswa` (
  `nim` int(10) NOT NULL,
  `nama_mahasiswa` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kelamin` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `form_mahasiswa`
--

INSERT INTO `form_mahasiswa` (`nim`, `nama_mahasiswa`, `alamat`, `kelamin`, `jurusan`) VALUES
(2110010653, 'Azza Ilman ', 'Jl. Sukarelawan', 'Laki-laki', 'Teknik Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `form_matakuliah`
--

CREATE TABLE `form_matakuliah` (
  `id_matkul` varchar(12) NOT NULL,
  `mata_kuliah` varchar(20) NOT NULL,
  `waktu` varchar(20) NOT NULL,
  `semester` varchar(4) NOT NULL,
  `dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `form_matakuliah`
--

INSERT INTO `form_matakuliah` (`id_matkul`, `mata_kuliah`, `waktu`, `semester`, `dosen`) VALUES
('11', 'Visual 2', '09:40 - 11:00', '5', 'Fajar'),
('12', 'Logika Matematika', '08:00 - 09:30', '5', 'Azza Ilman'),
('22', 'PBO 2', '09:40 - 11:00', '5', 'Edya Rosadi');

-- --------------------------------------------------------

--
-- Table structure for table `inputkrs`
--

CREATE TABLE `inputkrs` (
  `nim` int(10) NOT NULL,
  `id_krs` varchar(50) NOT NULL,
  `mata_kuliah` varchar(50) NOT NULL,
  `sks` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `nama_dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inputkrs`
--

INSERT INTO `inputkrs` (`nim`, `id_krs`, `mata_kuliah`, `sks`, `semester`, `nama_dosen`) VALUES
(2110010653, '09', 'Pemrograman Berbasis Objek 2', '2', '5', 'Azza Ilman K');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `per_semester` int(9) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `biaya_semester` bigint(50) NOT NULL,
  `total_biaya` bigint(50) NOT NULL,
  `pajak` bigint(50) NOT NULL,
  `total_keseluruhan` bigint(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`per_semester`, `jurusan`, `biaya_semester`, `total_biaya`, `pajak`, `total_keseluruhan`) VALUES
(3, 'Teknik Informatika', 32499000, 81247500, 8937225, 90184725),
(600000, 'Teknik Informatika', 32499000, 19499400000000, 2144934000000, 21644334000000),
(230000, 'Hukum', 42499000, 9774770000000, 1075224700000, 10849994700000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `form_mahasiswa`
--
ALTER TABLE `form_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `form_matakuliah`
--
ALTER TABLE `form_matakuliah`
  ADD PRIMARY KEY (`id_matkul`);

--
-- Indexes for table `inputkrs`
--
ALTER TABLE `inputkrs`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
