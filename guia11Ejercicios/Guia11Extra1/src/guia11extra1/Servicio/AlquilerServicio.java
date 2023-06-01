/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11extra1.Servicio;

import guia11extra1.Interfaces.CalculoAlquiler;
import guia11extra1.Entidad.Alquiler;
import guia11extra1.Entidad.Motorizado;
import guia11extra1.Entidad.Velero;
import guia11extra1.Entidad.YateLujo;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author diego
 */
public class AlquilerServicio {
    CalculoAlquiler barco = (Alquiler cobro) -> Period.between(cobro.getFechaAlquiler(), cobro.getFechaDevolucion()).getDays() * (cobro.getBarco().getEslora() * 10);
    CalculoAlquiler velero = (Alquiler cobro) -> Period.between(cobro.getFechaAlquiler(), cobro.getFechaDevolucion()).getDays() * ((cobro.getBarco().getEslora() * 10) + ((Velero) cobro.getBarco()).getCantidadMastiles());
    CalculoAlquiler yateDeLujo = (Alquiler cobro) -> Period.between(cobro.getFechaAlquiler(), cobro.getFechaDevolucion()).getDays() * ((cobro.getBarco().getEslora() * 10) + ((YateLujo) cobro.getBarco()).getCantidadCamarotes() + ((YateLujo) cobro.getBarco()).getPotenciaCv());
    CalculoAlquiler barcoMotorizado = (Alquiler cobro) -> Period.between(cobro.getFechaAlquiler(), cobro.getFechaDevolucion()).getDays() * ((cobro.getBarco().getEslora() * 10) + ((Motorizado) cobro.getBarco()).getPotenciaCv());
    
    
}
