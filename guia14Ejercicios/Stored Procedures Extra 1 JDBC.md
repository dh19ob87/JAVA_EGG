# Stored Procedures Extra 1 JDBC

## Clientes

````mysql
-- Insertar cliente

DELIMITER //

CREATE PROCEDURE insertar_cliente (IN nombre VARCHAR(50), IN calle VARCHAR(50), IN numero INT, IN codigo_postal VARCHAR(10), IN ciudad VARCHAR(50), IN pais VARCHAR(50), IN email VARCHAR(50))
        BEGIN 
        	INSERT INTO clientes (nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES (nombre, calle, numero, codigo_postal, ciudad, pais, email);
        END //
DELIMITER ;

-- Eliminar cliente

DELIMITER //
CREATE PROCEDURE eliminar_cliente(IN id_cliente INT)
        BEGIN
                DELETE FROM clientes WHERE clientes.id_cliente = id_cliente;
        END //
DELIMITER ;

-- Consultar todos los clientes

DELIMITER //
CREATE PROCEDURE consultar_todos_los_clientes ()
        BEGIN
                SELECT * FROM clientes;
        END //
DELIMITER ;

-- Consultar un cliente

DELIMITER //
CREATE PROCEDURE consultar_un_cliente (IN id_cliente INT)
	BEGIN
		SELECT * FROM clientes WHERE clientes.id_cliente = id_cliente;
	END //
DELIMITER ;

-- Name Procedure = consultar_clientes_que_contrataron_estancias()
-- Listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron.

DELIMITER //
CREATE PROCEDURE consultar_clientes_que_contrataron_estancias()
        BEGIN
                SELECT clientes.*, estancias.*, casas.* FROM clientes INNER JOIN estancias ON clientes.id_cliente = estancias.id_cliente INNER JOIN casas ON
estancias.id_casa = casas.id_casa;
        END //
DELIMITER ;
````

## Estancias

````mysql
-- Consultar estancia por id

DELIMITER //
CREATE PROCEDURE consultar_una_estancia (IN id_estancia INT)
        BEGIN
                SELECT * FROM estancias WHERE estancias.id_estancia = id_estancia;
        END //
DELIMITER ;

-- Insertar estancia

DELIMITER //
CREATE PROCEDURE insertar_estancia (IN id_cliente INT, IN id_casa INT, IN nombre_huesped VARCHAR(70), IN fecha_desde DATE, IN fecha_hasta DATE)
        BEGIN
                INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta)
                        VALUES (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta);
        END //
DELIMITER ;

-- Name Procedure = consultar_historial_clientes_estancia
-- Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior

DELIMITER //
CREATE PROCEDURE consultar_historial_clientes_estancia ()
        BEGIN
                SELECT clientes.nombre, clientes.pais, clientes.ciudad, casas.*
                        FROM clientes INNER JOIN estancias ON clientes.id_cliente = estancias.id_cliente INNER JOIN casas ON estancias.id_casa = casas.id_casa;
        END //
DELIMITER ;

-- Consultar disponobilidad de estancia entre fechas

DELIMITER //
CREATE PROCEDURE verificar_disponibilidad_estancia_fechas(IN fecha_desde DATE, IN fecha_hasta DATE)
        BEGIN
                SELECT * FROM estancias WHERE (fecha_desde NOT BETWEEN estancias.fecha_desde AND estancias.fecha_hasta) AND (fecha_hasta NOT BETWEEN estancias.fecha_desde AND estancias.fecha_hasta);
        END //
DELIMITER ;
````

## Casas

````mysql
-- Consultar una casa

DELIMITER //
CREATE PROCEDURE consultar_casa(IN id_casa INT)
        BEGIN
                SELECT * FROM casas WHERE casas.id_casa = id_casa;
        END //
DELIMITER ;

-- Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’

DELIMITER //
CREATE PROCEDURE casas_limpias_del_reino_unido()
        BEGIN
                SELECT casas.*, comentarios.comentario FROM casas INNER JOIN comentarios ON casas.id_casa = comentarios.id_casa WHERE comentario LIKE "%limpia%" AND pais = "reino unido";
        END //
DELIMITER ;

-- Obtener el número de casas que existen para cada uno de los países diferentes.

DELIMITER //
CREATE PROCEDURE numero_de_casas_por_pais()
        BEGIN
                SELECT COUNT(pais) AS cantidad, pais FROM casas GROUP BY pais;
        END //
DELIMITER ;

-- Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.

DELIMITER //
CREATE PROCEDURE actualizar_precio_habitacion (IN aumento_porcentaje INT)
        BEGIN
                UPDATE casas SET precio_habitacion = (precio_habitacion + (precio_habitacion * (aumento_porcentaje/100)));
                SELECT casas.id_casa, precio_habitacion FROM casas;
        END //
DELIMITER ;

-- Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.

DELIMITER //
CREATE PROCEDURE casa_disponible_desde_fecha_mas_dias(IN fecha_desde DATE, IN dias INT)
        BEGIN
                SELECT casas.* FROM casas WHERE DATEDIFF(ADDDATE(fecha_desde, INTERVAL dias DAY), casas.fecha_hasta) > 0;
        END //
DELIMITER ;

-- Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.

DELIMITER //
CREATE PROCEDURE casas_disponibles_en_intervalo_fechas(IN fecha_desde DATE, IN fecha_hasta DATE)
        BEGIN
                SELECT * FROM casas WHERE (casas.fecha_desde NOT BETWEEN fecha_desde AND fecha_hasta) AND (casas.fecha_hasta NOT BETWEEN fecha_desde AND fecha_hasta);
        END //
DELIMITER ;

-- Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.

DELIMITER //
CREATE PROCEDURE consultar_familias_menos_3_hijos_y_mayores_de_10_anios()
        BEGIN
                SELECT * FROM familias WHERE num_hijos < 3 AND edad_maxima < 10;
        END //
DELIMITER ;

-- Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail

DELIMITER //
CREATE PROCEDURE familias_con_email_hotmail()
        BEGIN
                SELECT * FROM familias WHERE email LIKE "%hotmail%";
        END //
DELIMITER ;
````

