# Integrador bases de datos

````mysql
-- Candado A

	-- Query 1 Posición

SELECT COUNT(estadisticas.Asistencias_por_partido) FROM estadisticas WHERE estadisticas.Asistencias_por_partido = (SELECT MAX(estadisticas.Asistencias_por_partido) FROM estadisticas);

+---------------------------------------------+
| COUNT(estadisticas.Asistencias_por_partido) |
+---------------------------------------------+
|                                           2 |
+---------------------------------------------+

	-- Query 2 Clave

SELECT SUM(jugadores.peso) FROM jugadores INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre WHERE equipos.Conferencia = "east" AND jugadores.Posicion LIKE "%C%";

+---------------------+
| SUM(jugadores.peso) |
+---------------------+
|               14043 |
+---------------------+

-- Candado B

	-- Query 1 Posición

SELECT COUNT(*) FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador WHERE Asistencias_por_partido > (SELECT COUNT(*) FROM jugadores WHERE Nombre_equipo = "Heat");

+----------+
| COUNT(*) |
+----------+
|        3 |
+----------+

	-- Query 2 Clave

SELECT COUNT(*) FROM partidos WHERE temporada LIKE "99%";

+----------+
| COUNT(*) |
+----------+
|     1740 |
+----------+

SELECT COUNT(*) FROM partidos WHERE temporada LIKE "%99" ;
+----------+
| COUNT(*) |
+----------+
|     1740 |
+----------+

SELECT COUNT(*) FROM partidos WHERE temporada LIKE "%99%" ;
+----------+
| COUNT(*) |
+----------+
|     3480 |
+----------+

-- Candado C

	-- Query 1 Posición

SELECT ROUND((((SELECT COUNT(*) FROM jugadores INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre WHERE jugadores.Nombre_equipo = "Michigan" AND equipos.Division = "west") / (SELECT COUNT(*) FROM jugadores WHERE Peso >= 195)) + 0.9945)) AS posicion;

+----------+
| posicion |
+----------+
|        1 |
+----------+

	-- Query 2 Clave

SELECT FLOOR(passwordC.promedio + passwordC.conteo + passwordC.sumatoria) AS claveC FROM (SELECT AVG(estadisticas.Puntos_por_partido) AS promedio, COUNT(estadisticas.Asistencias_por_partido) AS conteo, SUM(estadisticas.Tapones_por_partido) AS sumatoria FROM estadisticas INNER JOIN jugadores ON jugadores.codigo = estadisticas.jugador INNER JOIN equipos ON equipos.Nombre = jugadores.Nombre_equipo WHERE equipos.Division = "central") AS passwordC;

+--------+
| claveC |
+--------+
|    631 |
+--------+

-- Candado D

	-- Query 1 Posición
	
SELECT ROUND(estadisticas.Tapones_por_partido) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo WHERE jugadores.Nombre = "Corey Maggette" AND estadisticas.temporada = "00/01";

+-----------------------------------------+
| ROUND(estadisticas.Tapones_por_partido) |
+-----------------------------------------+
|                                       4 |
+-----------------------------------------+

	-- Query 2 Clave
	
SELECT FLOOR(SUM(estadisticas.Puntos_por_partido)) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo WHERE jugadores.Procedencia = "Argentina";

+---------------------------------------------+
| FLOOR(SUM(estadisticas.Puntos_por_partido)) |
+---------------------------------------------+
|                                         191 |
+---------------------------------------------+
````

