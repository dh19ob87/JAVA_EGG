/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g12eintegrador.Entidad;

/**
 * Módulo de un vector
 * 
 * Sea \vec{a} = \left(a_{x}, a_{y}, a_{z}\right)
 * Módulo de un vector: \abs{\vec{a}} = \sqrt{\left(a_{x}\right)^{2} +\left(a_{y}\right)^{2} + \left(a_{z}\right)^{2}}
 * 
 * Longitud de un vector definido entre:
 * 
 * sea P_{0} = \left(x_{0}. y_{0}, z_{0}\right) y P_{1} = \left( x_{1}, y_{1}, z_{1} \right)
 * Modulo \abs{\vec{a}} ? \sqrt{\left( x_{1} - x_{0}  \right) + \left( y_{1} - y_{0}  \right) + \left( z_{1} - z_{0}  \right)}
 * 
 * Una esfera de radio $r$ con centro en $(a,b,c)$ puede representarse mediante la ecuación:
 * 
 * r^{2} = \left( x - a \right)^{2} + \left( y - b \right)^{2} + \left( z - c \right)^{2}
 * 
 * De este modo se puede representar una esfera con base a su centro y un punto que contenga:
 * 
 * Sea P_{0} = \left( 10, 7, 4 \right) y P_{1} = \left( -1, 3, -2 \right)
 * 
 * Solución:
 * 
 * El radio de la esfera es:
 * 
 * r = \sqrt{\left( -1 - 10 \right)^{2} + \left( 3 - 7 \right)^{2} + \left( -2 - 4 \right)^{2}}
 * r = \sqrt{\left( -11 \right)^{2} + \left( -4 \right)^{2} + \left( -6 \right)^{2}}
 * r = \sqrt{173}
 * 
 * Entonces la ecuación estándar de la esfera es:
 * 
 * \left( x - 10 \right)^{2} + \left( y - 7 \right)^{2} + \left( z - 4 \right)^{2} = 173
 * 
 * Si la unidad de medida del rádio fuese km entonces tendríamos una esfera con un radio de 173 km:
 * 
 * De este modo el máximo valor de $x$ para que llegue al radio de la esfera es cunado $y = 0$ y $z = 0$:
 * 
 * x = {183, - 163}
 * 
 * El máximo valor de $y$ para que sea igual al radio máximo de la esfera con $x = 0$ y $z = 0$ es:
 * 
 * y = {180, -166}
 * 
 * El máximo valor de $z$ para que sea igual al radio máximo de la esfera con $x = 0$ y $y = 0$ es:
 * 
 * z = {177, -169}
 * 
 * Ahora, el problema es encontrar los valores de $x, y, z$ para los que no se supere el valor del radio de la esfera y así mantenernos dentro del rango definido.
 * 
 * Para abordar este problema implementaremos un convertidos de coordenadas cartesianas a esféricas.
 * 
 * Las coordenadas esféricas están en términos de $\left( \rho, \theta, \varphi \right)$:
 * 
 *      \rho -> Es la distancia desde el origen hasta el punto. Este va por el eje de las x.
 *      \theta -> Es el ángulo formado con respecto al eje x. Lo que nos daría el componente y.
 *      \varphi -> Es el ángulo formado con respecto al eje z. Lo que daría el componente z.
 * 
 * Esto nos evita buscar por longitud en los tres ejes. Nos permite centrarnos en buscar solo en el $\rho$ y un ángulo (en radianes) rango de $\pi, 2*\pi$.
 * 
 * Para convertir de coordenadas cartesianas a Esféricas usamos:
 * 
 * \rho = \sqrt{x^{2} + y^{2} + z^{2}}
 * 
 * \theta = \tan^{-1}\left( \frac{y}{x} \right)
 * 
 * \varphi = \cos^{-1} \left( \frac{z}{\rho} \right)
 * 
 * El proceso contrario, de coordenadas esféricas a cartesianas:
 * 
 * x = \rho \sin{\left( \varphi \right)} \cos{\left( \theta \right)}
 * y = \rho \sin{\left( \varphi \right)} \sin{\left( \theta \right)}
 * z = \rho \cos{\left( \varphi \right)}
 * 
 * @author diego
 */
public abstract class Posicion {

    protected int x;
    protected int y;
    protected int z;

    /**
     *
     * @param x
     * @param y
     * @param z
     */
    
    public Posicion() {
    }

    public Posicion(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posicion{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", z=").append(z);
        sb.append('}');
        return sb.toString();
    }
}
