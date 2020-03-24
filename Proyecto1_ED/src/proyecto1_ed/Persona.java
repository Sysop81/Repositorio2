/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_ed;

import java.time.LocalDate;

/**
 *
 * @author sysop
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    
    public Persona(String dni,String nombre, String apellidos,int dia, int mes, int año){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento= LocalDate.of(año, mes, dia);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Dni\t\t"+this.dni+"\nNombre\t\t"+this.nombre+"\nApellidos\t"+this.apellidos+"\nF_Nac\t\t"+this.fechaNacimiento;
    }
    
    
}
