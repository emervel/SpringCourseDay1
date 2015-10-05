/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Equipo04
 */
public class Persona {

    private String Nombre;

    private Aficion aficion;

        private Trabajo trabajo;

    /**
     * Get the value of trabajo
     *
     * @return the value of trabajo
     */
    public Trabajo getTrabajo() {
        return trabajo;
    }

    /**
     * Set the value of trabajo
     *
     * @param trabajo new value of trabajo
     */
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", aficion=" + aficion + ", trabajo=" + trabajo + '}';
    }



    //Este metodo se llama despues del constructor, cuando ya se ha hecho la inyeccion de dependencias
    //Spring ignora el ambito (private o public) en esta inyección
    public void metodoInicial() {
        System.out.println("En inicio");
    }
    
    //Este metodo lo llama spring siempre que lo va a destruir
    public void limpiar() {
        System.out.println("En final");
    }
    /**
     * Get the value of aficion
     *
     * @return the value of aficion
     */
    public Aficion getAficion() {
        return aficion;
    }

    /**
     * Set the value of aficion
     *
     * @param aficion new value of aficion
     */
    public void setAficion(Aficion aficion) {
        this.aficion = aficion;
    }

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
        System.out.println("En setNombr. valor:"+Nombre);
        //Esto es una Inyeccion de Dependencias (DI) xq cojo el valor y se lo paso para que lo setee        
    }

    public Persona() {
        System.out.println("Constructor de Persona");
        //Esto es Inversion de control porque yo instancio una clase pero java ejecuta el codigo del constructor por mi privandome del control
    }

}
