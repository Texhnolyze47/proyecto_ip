DROP DATABASE IF EXISTS ipdb;
CREATE DATABASE ipdb;
USE ipdb;

DROP TABLE IF EXISTS config_ip

CREATE TABLE `config_ip` (
  `id` int(11) NOT NULL,
  `numero_computador` text NOT NULL,
  `ip` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `config_ip`
  ADD PRIMARY KEY (`id`);

  ALTER TABLE `config_ip`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;
