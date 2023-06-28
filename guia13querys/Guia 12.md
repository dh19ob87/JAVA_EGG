# Guia 12

## Ejercicio 1 Querys

````mysql
-- Query 1

SELECT * FROM empleados;

-- Query 2

SELECT * FROM departamentos;

-- Query 3

SELECT NOMBRE_DEPTO AS 'NOMBRE DEL DEPARTAMENTO' FROM DEPARTAMENTOS;

-- Query 4

SELECT nombre AS "Nombre Empleado", sal_emp AS Salario from empleados;

-- Query 5

SELECT comision_emp as "Comisión" from empleados;

-- Query 6

SELECT * FROM empleados WHERE cargo_emp = "Secretaria";

-- Query 7

SELECT * FROM empleados WHERE cargo_emp = "Secretaria";

-- Query 8

SELECT nombre, cargo_emp from empleados order by sal_emp asc;

-- Query 9

SELECT NOMBRE_JEFE_DEPTO FROM DEPARTAMENTOS WHERE CIUDAD = "CIUDAD REAL";

-- Query 10

SELECT CONCAT("Nombre: ", nombre) AS Nombre, CONCAT("Cargo: ", cargo_emp) from empleados;

-- Query 11

SELECT sal_emp AS Salario, comision_emp AS Comision, (sal_emp + comision_emp) AS "Sueldo bruto" FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp ASC;

-- Query 12

SELECT nombre, (sal_emp + comision_emp + 500) AS "Salario bruto" FROM empleados WHERE id_depto = 3000 ORDER BY nombre ASC;

-- Query 13

SELECT * FROM empleados WHERE nombre LIKE "J%";

-- Query 14

SELECT sal_emp AS Salario, comision_emp AS Comision, nombre FROM empleados WHERE comision_emp > 1000;

-- Query 15

SELECT sal_emp AS Salario, comision_emp AS Comision, nombre FROM empleados WHERE comision_emp = 0;

-- Query 16

SELECT * FROM empleados WHERE comision_emp > sal_emp;

-- Query 17

SELECT * FROM empleados WHERE comision_emp <= (sal_emp * 0.3);

-- Query 18

SELECT * FROM empleados WHERE nombre NOT LIKE "%MA%";

-- Query 19

SELECT * FROM departamentos WHERE nombre_depto IN ('Ventas', 'Investigación', 'Mantenimiento');

-- Query 20

SELECT * FROM departamentos WHERE nombre_depto NOT IN ('Ventas', 'Investigación', 'Mantenimiento');

-- Query 21

SELECT MAX(sal_emp) FROM empleados;

-- Query 22

SELECT nombre FROM empleados ORDER BY nombre DESC LIMIT 1;

-- Query 23

SELECT MAX(sal_emp) AS "Salario Máximo", MIN(sal_emp) AS "Salario Mínimo", (MAX(sal_emp) - MIN(sal_emp)) FROM empleados;

-- Query 24

SELECT AVG(sal_emp) AS "Salario Promedio" FROM empleados;

-- Query 25

SELECT COUNT(*) AS "Numero De Empleados", nombre_depto AS "Nombre Departamento" FROM empleados RIGHT JOIN departamentos ON empleados.id_emp = departamentos.id_depto GROUP BY nombre_depto HAVING COUNT(*) > 3;

SELECT COUNT(*) AS number, nombre_depto AS "Nombre Departamento" FROM empleados RIGHT JOIN departamentos ON empleados.id_emp = departamentos.id_depto GROUP BY nombre_depto HAVING number > 3;

-- Query 26

SELECT COUNT(*) AS number, nombre_depto AS "Nombre Departamento" FROM empleados RIGHT OUTER JOIN departamentos ON empleados.id_emp = departamentos.id_depto GROUP BY nombre_depto HAVING number = 0;

-- Query 27

SELECT nombre, fec_nac, cargo_emp, sal_emp, nombre_depto, ciudad, nombre_jefe_depto FROM departamentos RIGHT JOIN empleados ON departamentos.id_depto = empleados.id_depto;

-- Query 28

SELECT nombre, sal_emp FROM empleados WHERE sal_emp > (SELECT AVG(sal_emp) FROM empleados);
````

## Ejercicio 2 Querys

`````mysql
-- Query 1

SELECT nombre FROM producto;

-- Query 2

SELECT nombre, precio FROM producto;

-- Query 3

SELECT * FROM producto;

-- Query 4

SELECT nombre, ROUND(precio) AS "Precio Redondeado" FROM producto;

-- Query 5

SELECT codigo_fabricante FROM producto;

-- Query 6

SELECT DISTINCT codigo_fabricante FROM producto;

-- Query 7

SELECT nombre FROM fabricante ORDER BY nombre ASC;

-- Query 8

SELECT nombre FROM producto ORDER BY nombre ASC;

-- Query 9

SELECT nombre, precio FROM producto ORDER BY precio DESC;

-- Query 10

SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;

-- Query 11

SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;

-- Query 12

SELECT nombre, precio FROM producto WHERE precio <= 120  ORDER BY precio ASC;

-- Query 13

SELECT nombre, precio FROM producto WHERE precio BETWEEN 60 AND 200  ORDER BY precio ASC;

-- Query 14

SELECT nombre, precio FROM producto WHERE codigo_fabricante IN (1,3,5) ORDER BY precio ASC;

-- Query 15

SELECT nombre, precio FROM producto WHERE nombre LIKE "%Portátil%";
`````

### Consultas Multitabla Ejercicio 2

````mysql
-- Query 1

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante;

-- Query 2

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante ORDER BY fabricante.nombre ASC;

-- Query 3

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre, precio FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante ORDER BY precio ASC LIMIT 1;

-- Query 4

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre, precio FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante WHERE fabricante.nombre = "Lenovo" ORDER BY precio ASC;

-- Query 5

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre, precio FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante WHERE fabricante.nombre = "Crucial" AND precio > 200 ORDER BY precio ASC;

-- Query 6

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre, precio FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante WHERE fabricante.nombre IN ("Asus", "Hewlett-Packard") ORDER BY precio ASC;

-- Query 7

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre, precio FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante WHERE precio >= 180 ORDER BY precio DESC;

SELECT fabricante.codigo, producto.nombre, codigo_fabricante, fabricante.nombre, precio FROM producto INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante WHERE precio >= 180 ORDER BY producto.nombre ASC;
````

### Consultas multitabla solo con left y right join

````mysql
-- Query 1

SELECT fabricante.*, producto.nombre, precio FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante;

-- Query 2

SELECT fabricante.*, producto.nombre, precio FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante WHERE producto.nombre IS NULL;


````

### Subconsultas en Where

````mysql
-- Query 1

SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo");

-- Query 2

SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo" ));

-- Query 3

SELECT nombre FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo" ));

-- Query 4

SELECT * FROM producto WHERE precio > (SELECT AVG(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus")) AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus");
````

### Subconsultas con IN y NOT IN

````mysql
-- Query 1

SELECT * FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto);

-- Query 2

SELECT * FROM fabricante WHERE codigo NOT IN (SELECT codigo_fabricante FROM producto);
````

### Subconsultas en cláusula having

````mysql
-- Query 1 Falta mejorarla, aún me aparece el registro lenovo

SELECT nombre FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto GROUP BY codigo_fabricante HAVING COUNT(*) = (SELECT COUNT(*) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo")));

-- Forma de eliminar el registro lenovo

SELECT nombre FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto GROUP BY codigo_fabricante HAVING COUNT(*) = (SELECT COUNT(*) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo"))) AND nombre != "Lenovo";
````

## Ejercicio Extra 1

````mysql
-- Query 1

SELECT nombre FROM jugadores ORDER BY nombre asc;

-- Query 2

SELECT nombre FROM jugadores WHERE posicion = 'C' AND peso > 200 ORDER BY nombre asc;

-- Query 3

SELECT nombre FROM equipos ORDER BY nombre ASC;

-- Query 4

SELECT nombre FROM equipos WHERE conferencia = "East" ORDER BY nombre ASC;

-- Query 5

SELECT nombre FROM equipos WHERE ciudad LIKE "c%" ORDER BY nombre ASC;

-- Query 6

SELECT nombre, nombre_equipo FROM jugadores ORDER BY nombre ASC;

-- Query 7

SELECT nombre FROM jugadores WHERE nombre_equipo = "Raptors" ORDER BY nombre ASC;

-- Query 8

SELECT Puntos_por_partido, nombre FROM estadisticas, jugadores WHERE nombre = "Pau Gasol";

-- Query 9

SELECT Puntos_por_partido, nombre FROM estadisticas, jugadores WHERE nombre = "Pau Gasol" AND temporada = "04/05";

-- Query 10

SELECT nombre, Puntos_por_partido FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo;

SELECT nombre, SUM(Puntos_por_partido) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo GROUP BY nombre;

-- Query 11

SELECT COUNT(*), equipos.nombre FROM equipos INNER JOIN jugadores ON equipos.nombre = jugadores.nombre_equipo GROUP BY equipos.nombre;

-- Query 12

SELECT SUM(Puntos_por_partido) AS puntos, nombre FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador GROUP BY nombre ORDER BY puntos DESC LIMIT 1;

-- Sin embargo debe haber una manera con inner y max.

SELECT MAX(puntos) FROM (SELECT SUM(Puntos_por_partido) AS puntos, codigo FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador GROUP BY codigo) AS estadisticaPuntos;

-- Explorrando ANY_VALUE()
SELECT MAX(puntos), ANY_VALUE(codigo) FROM (SELECT SUM(Puntos_por_partido) AS puntos, codigo FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador GROUP BY codigo ORDER BY puntos DESC) AS estadisticaPuntos;

-- Query 13

SELECT * FROM jugadores LEFT JOIN equipos ON jugadores.nombre_equipo = equipos.nombre WHERE altura = (SELECT MAX(altura) FROM jugadores);

-- Query 14

SELECT AVG(puntos_local), AVG(puntos_visitante), division FROM partidos INNER JOIN equipos ON equipos.nombre IN (equipo_local, equipo_visitante) WHERE equipos.division = "Pacific";

-- Query 15
                        
SELECT partidos.*
        FROM partidos
        WHERE CASE
                WHEN (puntos_local - puntos_visitante) < 0 THEN (puntos_visitante - puntos_local) ELSE (puntos_local - puntos_visitante)
              END = (SELECT MAX(diferencia)
                        FROM (SELECT
                                CASE
                                        WHEN (puntos_visitante - puntos_local) < 0 THEN (puntos_local - puntos_visitante)
                                        ELSE (puntos_visitante - puntos_local)
                                END AS diferencia
                                FROM partidos) AS dif_points);
                                
-- También Query 15 pero con la columna de diferencia máxima
                                
SELECT partidos.*, diferencia_maxima
        FROM partidos, (SELECT MAX(diferencia) AS diferencia_maxima
                        FROM (SELECT
                                CASE
                                        WHEN (puntos_visitante - puntos_local) < 0 THEN (puntos_local - puntos_visitante)
                                        ELSE (puntos_visitante - puntos_local)
                                END AS diferencia
                                FROM partidos) AS maxdif) AS maxdif
        WHERE CASE
                WHEN (puntos_local - puntos_visitante) < 0 THEN (puntos_visitante - puntos_local) ELSE (puntos_local - puntos_visitante)
              END = (SELECT MAX(diferencia)
                        FROM (SELECT
                                CASE
                                        WHEN (puntos_visitante - puntos_local) < 0 THEN (puntos_local - puntos_visitante)
                                        ELSE (puntos_visitante - puntos_local)
                                END AS diferencia
                                FROM partidos) AS maxdif);
                                
-- Query 16 ! Tengo dudas

SELECT AVG(puntos_local + puntos_visitante), division FROM partidos INNER JOIN equipos ON equipos.nombre = partidos.equipo_local OR equipos.nombre = partidos.equipo_visitante WHERE equipos.division = "Pacific";

-- Query 17

SELECT puntos_local, equipo_local, equipo_visitante, puntos_visitante FROM partidos INNER JOIN equipos ON partidos.equipo_local = equipos.nombre;

-- Query 18

SELECT
        CASE
                WHEN (puntos_local > puntos_visitante) THEN equipo_local
                WHEN (puntos_local < puntos_visitante) THEN equipo_visitante
                ELSE "EMPATE"
        END AS Ganador, codigo
        FROM partidos;
        


-- Nombre del equipo de cada jugador junto con los puntos por partido de toda su carrera

SELECT Stats_per_player.*, equipo.nombre FROM equipo INNER JOIN (SELECT nombre, Puntos_por_partido, nombre_equipo FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo) AS Stats_per_player ON equipo.nombre = Stats_per_player.nombre_equipo;
````

## Ejercicio extra 2

````mysql
-- Query 1

SELECT codigo_oficina, ciudad FROM oficina;

-- Query 2

SELECT codigo_oficina, telefono FROM oficina WHERE pais = "España";

-- Query 3

SELECT nombre, CONCAT(apellido1, apellido2), email FROM empleado WHERE codigo_jefe = 7;

-- Query 4

SELECT nombre, CONCAT(apellido1, apellido2), email FROM empleado WHERE puesto = "Director general";

-- Query 5

SELECT puesto, nombre, CONCAT(apellido1, apellido2) FROM empleado WHERE puesto != "representante ventas";

-- Query 6

SELECT nombre_cliente FROM cliente WHERE pais = "Spain";

-- Query 7

SELECT DISTINCT estado FROM pedido;

-- Query 8

SELECT DISTINCT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente WHERE YEAR(pago.fecha_pago) = 2008;

SELECT DISTINCT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente WHERE DATE_FORMAT(pago.fecha_pago, "%Y") = 2008;

SELECT DISTINCT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente WHERE fecha_pago LIKE "%2008%";

-- Query 9

SELECT pedido.codigo_cliente, nombre_cliente, fecha_esperada, fecha_entrega
        FROM pedido INNER JOIN cliente ON pedido.codigo_cliente = cliente.codigo_cliente
        WHERE (fecha_entrega - fecha_esperada) > 0;
        
-- Query 10

SELECT pedido.codigo_pedido, pedido.codigo_cliente, nombre_cliente, fecha_esperada, fecha_entrega FROM pedido INNER JOIN cliente ON pedido.codigo_cliente = cliente.codigo_cliente WHERE fecha_entrega = ADDDATE(fecha_esperada, INTERVAL -2 DAY);

SELECT pedido.codigo_pedido, pedido.codigo_cliente, nombre_cliente, fecha_esperada, fecha_entrega FROM pedido INNER JOIN cliente ON pedido.codigo_cliente = cliente.codigo_cliente WHERE DATEDIFF(fecha_esperada, fecha_entrega) = 2;

-- Query 11

SELECT * FROM pedido WHERE estado = "rechazado" AND YEAR(fecha_pedido) = 2009;

-- Query 12

SELECT * FROM pedido WHERE estado = "entregado" AND MONTH(fecha_entrega) = 1;

-- Query 13

SELECT * FROM pago WHERE YEAR(fecha_pago) = 2008 ORDER BY codigo_cliente;

-- Query 14

SELECT DISTINCT forma_pago FROM pago;

-- Query 15

SELECT * FROM producto INNER JOIN gama_producto ON producto.gama = gama_producto.gama WHERE gama_producto.gama = "ornamentales" AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;

-- Query 16

SELECT * FROM cliente WHERE ciudad = "Madrid" AND codigo_empleado_rep_ventas IN (11, 30);
````

### Consultas multitabla (Composición interna)

````mysql
-- Query 1

SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2) FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas;

-- Query 2

SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2) FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente;

-- Query 3

SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2) FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- Query 4

SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2), oficina.ciudad FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;

-- Query 5

SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2), oficina.ciudad FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- Query 6

SELECT oficina.linea_direccion1, oficina.linea_direccion2, cliente.nombre_cliente, cliente.ciudad FROM oficina INNER JOIN empleado ON oficina.codigo_oficina = empleado.codigo_oficina INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.ciudad = "Fuenlabrada";

-- Query 7

SELECT cliente.nombre_cliente, codigo_empleado, empleado.nombre, oficina.ciudad FROM cliente INNER JOIN empleado ON cliente.codigo_cliente = empleado.codigo_empleado INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;

-- Query 8

SELECT A.nombre AS "Nombre jefe", A.codigo_empleado AS "Código jefe", B.nombre "Nombre empleado", B.codigo_empleado AS "Código empleado" FROM empleado AS A INNER JOIN empleado AS B ON A.codigo_empleado = B.codigo_jefe;

-- Query 9

SELECT cliente.codigo_cliente, nombre_cliente, pedido.codigo_pedido, estado FROM cliente INNER JOIN pedido ON pedido.codigo_cliente = cliente.codigo_cliente WHERE estado = "pendiente";

-- Query 10 ¡Tengo dudas! Confome más agrego campos se nota que todos son registros diferentes

SELECT cliente.codigo_cliente, nombre_cliente, gama_producto.gama FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido INNER JOIN producto ON detalle_pedido.codigo_producto = producto.codigo_producto INNER JOIN gama_producto ON gama_producto.gama = producto.gama;

-- Observa cómo sí es correcta la primera consulta. La siguiente consulta retorna los mismos 318 registros al agregar muchos campos más. Nota que el distinct actúa sobre lo retornado por eso en la primera salen tantos repetidos.

SELECT cliente.codigo_cliente, nombre_cliente, fecha_pedido, fecha_esperada, fecha_entrega, estado, gama_producto.gama, producto.nombre FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido INNER JOIN producto ON detalle_pedido.codigo_producto = producto.codigo_producto INNER JOIN gama_producto ON gama_producto.gama = producto.gama;
````

### Consultas multitabla (Composición externa)

````mysql
-- Query 1

SELECT cliente.nombre_cliente FROM cliente LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente WHERE pago.codigo_cliente IS NULL;

-- Query 2

SELECT cliente.nombre_cliente FROM cliente LEFT JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente WHERE pedido.codigo_cliente IS NULL;

-- Query 3

SELECT nombre_cliente, pedido.codigo_cliente, pago.codigo_cliente FROM cliente LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente LEFT JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente WHERE pedido.codigo_cliente IS NULL AND pago.codigo_cliente IS NULL;

-- Query 4

SELECT empleado.* FROM empleado LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE oficina.codigo_oficina IS NULL;

-- Query 5

SELECT empleado.* FROM cliente RIGHT JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.codigo_empleado_rep_ventas IS NULL;

-- Query 6

SELECT empleado.* FROM cliente RIGHT JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE cliente.codigo_empleado_rep_ventas IS NULL AND oficina.codigo_oficina IS NULL;

-- Query 7

SELECT producto.codigo_producto, producto.nombre, detalle_pedido.codigo_pedido FROM producto LEFT JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto WHERE detalle_pedido.codigo_pedido IS NULL;

-- Query 8 -- tEMPORAL HAY QUE VERIFICAR

SELECT DISTINCT oficina.codigo_oficina FROM producto LEFT JOIN gama_producto ON producto.gama = gama_producto.gama LEFT JOIN detalle_pedido ON detalle_pedido.codigo_producto = producto.codigo_producto LEFT JOIN pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido LEFT JOIN cliente ON cliente.codigo_cliente = pedido.codigo_cliente LEFT JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas RIGHT JOIN oficina ON oficina.codigo_oficina = empleado.codigo_oficina WHERE producto.gama != "Frutales" AND detalle_pedido.codigo_producto IS NOT NULL;

+----------------+
| codigo_oficina |
+----------------+
| TAL-ES         |
| MAD-ES         |
| BCN-ES         |
| SFC-USA        |
| BOS-USA        |
| SYD-AU         |
+----------------+

-- Mismo resultado con INNER

SELECT DISTINCT oficina.codigo_oficina FROM producto INNER JOIN gama_producto ON producto.gama = gama_producto.gama INNER JOIN detalle_pedido ON detalle_pedido.codigo_producto = producto.codigo_producto INNER JOIN pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido INNER JOIN cliente ON cliente.codigo_cliente = pedido.codigo_cliente INNER JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN oficina ON oficina.codigo_oficina = empleado.codigo_oficina WHERE producto.gama != "Frutales";

-- Alternativa

WITH         
	clientes_no_compran_frutales AS                 
		(SELECT empleado.codigo_empleado, empleado.codigo_oficina
         FROM producto
         	INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto                                         					INNER JOIN pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido                                         
         	INNER JOIN cliente ON cliente.codigo_cliente = pedido.codigo_cliente                                         
         	INNER JOIN pago ON pago.codigo_cliente = cliente.codigo_cliente                                         
         	INNER JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas                         
         WHERE producto.gama != "frutales") 
         SELECT DISTINCT oficina.codigo_oficina         
         	FROM oficina 
         		LEFT JOIN clientes_no_compran_frutales ON oficina.codigo_oficina = clientes_no_compran_frutales.codigo_oficina 
         WHERE clientes_no_compran_frutales.codigo_oficina IS NOT NULL;

-- Query 9

SELECT cliente.nombre_cliente, cliente.codigo_cliente, pedido.codigo_pedido FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente WHERE cliente.codigo_cliente NOT IN (SELECT DISTINCT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente);

+----------------+----------------+---------------+
| nombre_cliente | codigo_cliente | codigo_pedido |
+----------------+----------------+---------------+
| Flores S.L.    |             36 |           111 |
| Flores S.L.    |             36 |           112 |
| Flores S.L.    |             36 |           113 |
| Flores S.L.    |             36 |           114 |
| Flores S.L.    |             36 |           115 |
+----------------+----------------+---------------+

-- Alternativa

SELECT pedido.codigo_pedido, cliente.codigo_cliente, cliente.nombre_cliente, pago.codigo_cliente, pago.id_transaccion FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente WHERE pago.codigo_cliente IS NULL;

+---------------+----------------+----------------+----------------+----------------+
| codigo_pedido | codigo_cliente | nombre_cliente | codigo_cliente | id_transaccion |
+---------------+----------------+----------------+----------------+----------------+
|           111 |             36 | Flores S.L.    |           NULL | NULL           |
|           112 |             36 | Flores S.L.    |           NULL | NULL           |
|           113 |             36 | Flores S.L.    |           NULL | NULL           |
|           114 |             36 | Flores S.L.    |           NULL | NULL           |
|           115 |             36 | Flores S.L.    |           NULL | NULL           |
+---------------+----------------+----------------+----------------+----------------+

-- Query 10

SELECT EMP.nombre AS jefe, EMP2.*, cliente.codigo_empleado_rep_ventas FROM empleado AS EMP LEFT JOIN cliente ON EMP.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN empleado AS EMP2 ON EMP.codigo_empleado = EMP2.codigo_jefe WHERE cliente.codigo_empleado_rep_ventas IS NULL;
+----------+-----------------+-------------+------------+-----------+-----------+---------------------------+----------------+-------------+-----------------------+----------------------------+
| jefe     | codigo_empleado | nombre      | apellido1  | apellido2 | extension | email                     | codigo_oficina | codigo_jefe | puesto                | codigo_empleado_rep_ventas |
+----------+-----------------+-------------+------------+-----------+-----------+---------------------------+----------------+-------------+-----------------------+----------------------------+
| Marcos   |               2 | Ruben       | López      | Martinez  | 2899      | rlopez@jardineria.es      | TAL-ES         |           1 | Subdirector Marketing |                       NULL |
| Ruben    |               3 | Alberto     | Soria      | Carrasco  | 2837      | asoria@jardineria.es      | TAL-ES         |           2 | Subdirector Ventas    |                       NULL |
| Ruben    |               4 | Maria       | Solís      | Jerez     | 2847      | msolis@jardineria.es      | TAL-ES         |           2 | Secretaria            |                       NULL |
| Alberto  |               5 | Felipe      | Rosas      | Marquez   | 2844      | frosas@jardineria.es      | TAL-ES         |           3 | Representante Ventas  |                       NULL |
| Alberto  |               6 | Juan Carlos | Ortiz      | Serrano   | 2845      | cortiz@jardineria.es      | TAL-ES         |           3 | Representante Ventas  |                       NULL |
| Alberto  |               7 | Carlos      | Soria      | Jimenez   | 2444      | csoria@jardineria.es      | MAD-ES         |           3 | Director Oficina      |                       NULL |
| Carlos   |               8 | Mariano     | López      | Murcia    | 2442      | mlopez@jardineria.es      | MAD-ES         |           7 | Representante Ventas  |                       NULL |
| Carlos   |               9 | Lucio       | Campoamor  | Martín    | 2442      | lcampoamor@jardineria.es  | MAD-ES         |           7 | Representante Ventas  |                       NULL |
| Carlos   |              10 | Hilario     | Rodriguez  | Huertas   | 2444      | hrodriguez@jardineria.es  | MAD-ES         |           7 | Representante Ventas  |                       NULL |
| Alberto  |              11 | Emmanuel    | Magaña     | Perez     | 2518      | manu@jardineria.es        | BCN-ES         |           3 | Director Oficina      |                       NULL |
| Alberto  |              15 | Francois    | Fignon     |           | 9981      | ffignon@gardening.com     | PAR-FR         |           3 | Director Oficina      |                       NULL |
| Francois |              16 | Lionel      | Narvaez    |           | 9982      | lnarvaez@gardening.com    | PAR-FR         |          15 | Representante Ventas  |                       NULL |
| Francois |              17 | Laurent     | Serra      |           | 9982      | lserra@gardening.com      | PAR-FR         |          15 | Representante Ventas  |                       NULL |
| Alberto  |              18 | Michael     | Bolton     |           | 7454      | mbolton@gardening.com     | SFC-USA        |           3 | Director Oficina      |                       NULL |
| Alberto  |              20 | Hilary      | Washington |           | 7565      | hwashington@gardening.com | BOS-USA        |           3 | Director Oficina      |                       NULL |
| Hilary   |              21 | Marcus      | Paxton     |           | 7565      | mpaxton@gardening.com     | BOS-USA        |          20 | Representante Ventas  |                       NULL |
| Hilary   |              22 | Lorena      | Paxton     |           | 7665      | lpaxton@gardening.com     | BOS-USA        |          20 | Representante Ventas  |                       NULL |
| Alberto  |              23 | Nei         | Nishikori  |           | 8734      | nnishikori@gardening.com  | TOK-JP         |           3 | Director Oficina      |                       NULL |
| Nei      |              24 | Narumi      | Riko       |           | 8734      | nriko@gardening.com       | TOK-JP         |          23 | Representante Ventas  |                       NULL |
| Nei      |              25 | Takuma      | Nomura     |           | 8735      | tnomura@gardening.com     | TOK-JP         |          23 | Representante Ventas  |                       NULL |
| Alberto  |              26 | Amy         | Johnson    |           | 3321      | ajohnson@gardening.com    | LON-UK         |           3 | Director Oficina      |                       NULL |
| Amy      |              27 | Larry       | Westfalls  |           | 3322      | lwestfalls@gardening.com  | LON-UK         |          26 | Representante Ventas  |                       NULL |
| Amy      |              28 | John        | Walton     |           | 3322      | jwalton@gardening.com     | LON-UK         |          26 | Representante Ventas  |                       NULL |
| Alberto  |              29 | Kevin       | Fallmer    |           | 3210      | kfalmer@gardening.com     | SYD-AU         |           3 | Director Oficina      |                       NULL |
| Kevin    |              30 | Julian      | Bellinelli |           | 3211      | jbellinelli@gardening.com | SYD-AU         |          29 | Representante Ventas  |                       NULL |
| Kevin    |              31 | Mariko      | Kishi      |           | 3211      | mkishi@gardening.com      | SYD-AU         |          29 | Representante Ventas  |                       NULL |
+----------+-----------------+-------------+------------+-----------+-----------+---------------------------+----------------+-------------+-----------------------+----------------------------+


````

### Consultas resumen

````mysql
-- Query 1

SELECT COUNT(empleado.codigo_empleado) FROM empleado;

-- Query 2

SELECT COUNT(cliente.pais), pais FROM cliente GROUP BY pais;

-- Query 3

SELECT AVG(total), YEAR(fecha_pago) FROM pago GROUP BY YEAR(fecha_pago);

SELECT AVG(total), YEAR(fecha_pago) AS anio_pago FROM pago GROUP BY YEAR(fecha_pago) HAVING anio_pago = 2009;

-- Query 4

SELECT COUNT(estado) AS "Numero de Pedidos", estado FROM pedido GROUP BY estado ORDER BY "Numero de Pedidos" DESC;

-- Query 5 

SELECT MAX(precio_venta), MIN(precio_venta) FROM producto;

-- Query 6

SELECT COUNT(*) AS "Cantidad de clientes" FROM cliente;

-- Query 7

SELECT COUNT(ciudad) AS "Clientes ciudad", ciudad FROM cliente GROUP BY ciudad HAVING ciudad = "MAdrid";

-- Query 8

SELECT COUNT(ciudad), ciudad FROM cliente GROUP BY ciudad HAVING ciudad LIKE "M%";

-- Query 9

SELECT COUNT(codigo_cliente), codigo_empleado_rep_ventas, empleado.nombre FROM cliente INNER JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas GROUP BY codigo_empleado_rep_ventas;

-- Query 10

SELECT COUNT(*) AS "Clientes sin representante de ventas" FROM cliente LEFT JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado WHERE cliente.codigo_empleado_rep_ventas IS NULL; 

	-- Total clientes con representante de ventas
	
SELECT COUNT(*) AS "Clientes sin representante de ventas" FROM cliente LEFT JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado WHERE cliente.codigo_empleado_rep_ventas IS NOT NULL;

-- Query 11

SELECT MAX(fecha_pago) AS "Último pago", MIN(fecha_pago) AS "Primer pago", cliente.nombre_cliente, cliente.codigo_cliente FROM pago INNER JOIN cliente ON cliente.codigo_cliente = pago.codigo_cliente GROUP BY cliente.codigo_cliente;

-- Query 12

SELECT COUNT(codigo_producto), pedido.codigo_pedido FROM pedido INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido GROUP BY pedido.codigo_pedido;

	-- Probando que la cantidad corresponda verificando la cantidad de productos del pedido 1
	
SELECT codigo_producto FROM pedido INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido WHERE pedido.codigo_pedido = 1;

-- Query 13 No entendí bien qué había que sumar.

SELECT SUM(cantidad) FROM detalle_pedido;

SELECT SUM((SELECT COUNT(cantidad) FROM detalle_pedido));

SELECT SUM((SELECT COUNT(codigo_producto) FROM pedido INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido));

-- Query 14

SELECT COUNT(producto.codigo_producto) AS Cantidad_vendida, producto.nombre FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.nombre ORDER BY Cantidad_vendida DESC LIMIT 20;

-- Query 15

SELECT (producto.precio_venta * detalle_pedido.cantidad) AS "Base Imponible", ((producto.precio_venta * detalle_pedido.cantidad) * 0.21) AS "I.V.A.", ((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "Total Facturado" FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto;

-- Query 16

SELECT producto.codigo_producto, SUM((producto.precio_venta * detalle_pedido.cantidad)) AS "Base Imponible", SUM(((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "I.V.A.", SUM(((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21))) AS "Total Facturado" FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.codigo_producto ORDER BY producto.codigo_producto ASC;

-- Query 17

SELECT producto.codigo_producto, SUM((producto.precio_venta * detalle_pedido.cantidad)) AS "Base Imponible", SUM(((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "I.V.A.", SUM(((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21))) AS "Total Facturado" FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.codigo_producto HAVING producto.codigo_producto LIKE "OR%" ORDER BY producto.codigo_producto ASC;

-- Query 18

SELECT producto.codigo_producto, producto.nombre, COUNT(producto.codigo_producto) AS "Cantidad vendida", SUM((producto.precio_venta * detalle_pedido.cantidad)) AS "Base Imponible", SUM(((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "I.V.A.", SUM(((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21))) AS Total_Facturado FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.codigo_producto HAVING Total_facturado > 3000 ORDER BY producto.codigo_producto ASC;
````

### Subconsultas con operadores básicos de comparación

````mysql
-- Query 1

SELECT * FROM cliente WHERE limite_credito = (SELECT MAX(limite_credito) FROM cliente);

-- Query 2

SELECT * FROM producto WHERE precio_venta = (SELECT MAX(precio_venta) FROM producto);

-- Query 3

SELECT nombre FROM producto WHERE producto.codigo_producto = (SELECT codigo_producto FROM(SELECT SUM(cantidad) AS cantidad_vendida, codigo_producto FROM detalle_pedido GROUP BY codigo_producto ORDER BY cantidad_vendida DESC LIMIT 1) AS sumatoria);

-- Query 4

SELECT cliente.codigo_cliente, cliente.nombre_cliente, cliente.limite_credito, suma_pago.suma_pagos FROM cliente, (SELECT SUM(total) AS suma_pagos, codigo_cliente FROM pago GROUP BY codigo_cliente) AS suma_pago WHERE cliente.limite_credito > suma_pago.suma_pagos AND cliente.codigo_cliente = suma_pago.codigo_cliente;

-- Query 5

SELECT nombre, codigo_producto, cantidad_en_stock FROM producto WHERE cantidad_en_stock = (SELECT MAX(cantidad_en_stock) FROM producto);

-- Query 6

SELECT nombre, codigo_producto, cantidad_en_stock FROM producto WHERE cantidad_en_stock = (SELECT MIN(cantidad_en_stock) FROM producto);

-- Query 7

SELECT nombre, CONCAT(apellido1, " ", apellido2) FROM empleado WHERE empleado.codigo_jefe = (SELECT codigo_empleado FROM empleado WHERE nombre = "Alberto" AND apellido1 = "Soria");
````

### Subconsultas con ALL y ANY

````mysql
-- Query 1

SELECT * FROM cliente WHERE limite_credito = ANY (SELECT MAX(limite_credito) FROM cliente);

SELECT * FROM cliente WHERE limite_credito = ALL (SELECT MAX(limite_credito) FROM cliente); -- Nótese que este retorna el mismo resultado porque el limite de crédito sí es igual a todos los registros de la subconsulta del ALL. Si existiera un registro adicional en la subconsulta y limite_credido no fuese igual no nos retornaría nada.

-- Query 2

SELECT producto.nombre, producto.precio_venta FROM producto WHERE precio_venta = ALL (SELECT MAX(precio_venta) FROM producto);

-- Nótese que este retorna el mismo resultado porque precio_venta sí es igual a todos los registros de la subconsulta del ALL. Si existiera un registro adicional en la subconsulta y limite_credido no fuese igual no nos retornaría nada. OBSERVA lo que sucede si retornamos productos por un rango de precio:

SELECT producto.nombre, producto.precio_venta FROM producto WHERE precio_venta = ALL (SELECT precio_venta FROM producto WHERE precio_venta BETWEEN 100 AND 500000);

> Empty set (0.0065 sec)

-- Si cambiamos la KEYWORD a ANY entonces nos retorna los productos en ese rango de precios:

SELECT producto.nombre, producto.precio_venta FROM producto WHERE precio_venta = ANY (SELECT precio_venta FROM producto WHERE precio_venta BETWEEN 100 AND 500000);
+---------------------------+--------------+
| nombre                    | precio_venta |
+---------------------------+--------------+
| Limonero 30/40            |       100.00 |
| Camelia japonica ejemplar |       110.00 |
| Bismarckia Nobilis        |       217.00 |
| Bismarckia Nobilis        |       266.00 |
| Brahea Armata             |       112.00 |
| Trachycarpus Fortunei     |       462.00 |
| Zamia Furfuracaea         |       168.00 |
+---------------------------+--------------+

-- Query 3

SELECT producto.nombre, producto.cantidad_en_stock FROM producto WHERE cantidad_en_stock = ALL (SELECT MIN(cantidad_en_stock) FROM producto);
+---------------+-------------------+
| nombre        | cantidad_en_stock |
+---------------+-------------------+
| Brahea Armata |                 0 |
+---------------+-------------------+
````

### Subconsultas con IN y NOT IN

````mysql
-- Query 1

SELECT empleado.nombre, empleado.apellido1, empleado.puesto FROM empleado WHERE empleado.codigo_empleado NOT IN (SELECT cliente.codigo_empleado_rep_ventas FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado);

-- Query 2

SELECT cliente.codigo_cliente, cliente.nombre_cliente FROM cliente WHERE cliente.codigo_cliente NOT IN (SELECT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente);
+----------------+-----------------------------+
| codigo_cliente | nombre_cliente              |
+----------------+-----------------------------+
|              6 | Lasas S.A.                  |
|              8 | Club Golf Puerta del hierro |
|             10 | DaraDistribuciones          |
|             11 | Madrileña de riegos         |
|             12 | Lasas S.A.                  |
|             17 | Flowers, S.A                |
|             18 | Naturajardin                |
|             20 | Americh Golf Management SL  |
|             21 | Aloha                       |
|             22 | El Prat                     |
|             24 | Vivero Humanes              |
|             25 | Fuenla City                 |
|             29 | Top Campo                   |
|             31 | Campohermoso                |
|             32 | france telecom              |
|             33 | Musée du Louvre             |
|             36 | Flores S.L.                 |
|             37 | The Magic Garden            |
+----------------+-----------------------------+

-- Query 3

SELECT cliente.codigo_cliente, cliente.nombre_cliente FROM cliente WHERE cliente.codigo_cliente IN (SELECT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente);
+----------------+--------------------------------+
| codigo_cliente | nombre_cliente                 |
+----------------+--------------------------------+
|              1 | GoldFish Garden                |
|              3 | Gardening Associates           |
|              4 | Gerudo Valley                  |
|              5 | Tendo Garden                   |
|              7 | Beragua                        |
|              9 | Naturagua                      |
|             13 | Camunas Jardines S.L.          |
|             14 | Dardena S.A.                   |
|             15 | Jardin de Flores               |
|             16 | Flores Marivi                  |
|             19 | Golf S.A.                      |
|             23 | Sotogrande                     |
|             26 | Jardines y Mansiones Cactus SL |
|             27 | Jardinerías Matías SL          |
|             28 | Agrojardin                     |
|             30 | Jardineria Sara                |
|             35 | Tutifruti S.A                  |
|             38 | El Jardin Viviente S.L         |
+----------------+--------------------------------+

-- Query 4

SELECT producto.codigo_producto, producto.nombre FROM producto WHERE producto.codigo_producto NOT IN (SELECT detalle_pedido.codigo_producto FROM detalle_pedido);

-- Query 5

SELECT empleado.codigo_empleado, empleado.nombre, CONCAT(empleado.apellido1, empleado.apellido2), empleado.puesto, oficina.telefono FROM empleado INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE empleado.codigo_empleado NOT IN (SELECT empleado.codigo_empleado FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas);
````

### Subconsultas con EXISTS y NOT EXISTS

````mysql
-- Query 1

SELECT codigo_cliente FROM cliente WHERE NOT EXISTS (SELECT * FROM pago WHERE cliente.codigo_cliente = pago.codigo_cliente);

-- Query 2

SELECT codigo_cliente FROM cliente WHERE EXISTS (SELECT * FROM pago WHERE cliente.codigo_cliente = pago.codigo_cliente);

-- Query 3

SELECT producto.nombre FROM producto WHERE NOT EXISTS (SELECT * FROM detalle_pedido WHERE detalle_pedido.codigo_producto = producto.codigo_producto);

-- Query 4

SELECT producto.nombre FROM producto WHERE EXISTS (SELECT * FROM detalle_pedido WHERE detalle_pedido.codigo_producto = producto.codigo_producto);
````

## Ejercicio Extra 3

