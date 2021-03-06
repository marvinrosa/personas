package com.example.soporte.personas;

/**
 * Created by soporte on 04/04/2017.
 */

public class Persona {
    private String foto;
    private String nombre;
    private String apellido;
    private int edad;
    private String pasatiempos;

    public Persona(String nombre, String apellido, int edad, String pasatiempos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pasatiempos = pasatiempos;
    }

    public Persona(String foto, String nombre, String apellido, int edad, String pasatiempos) {
        this.foto = foto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pasatiempos = pasatiempos;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPasatiempos() {
        return pasatiempos;
    }

    public void setPasatiempos(String pasatiempos) {
        this.pasatiempos = pasatiempos;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
