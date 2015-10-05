package com.curso.spring.springioc000maven;

import beans.Animal;
import beans.Cosa;
import beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("app.xml");
        
        //Esto se deja para crear un gancho que se ejecute cuando acabe el hilo principal
        AbstractApplicationContext a  = (AbstractApplicationContext) ctx;
        a.registerShutdownHook();
        
        System.out.println("Contexto cargado");

//        //Spring cuando declaramos un bean en un xml lo que interpreta es que es un singleton por lo que ambos objetos son el mismo
//        Persona bean = ctx.getBean(Persona.class);
//        System.out.println(bean);
//        Persona bean1 = ctx.getBean(Persona.class);
//        System.out.println(bean1);
//
//        //Con scope="prototype" consigo definir que no sea singleton si no que lo cree cada vez
//        Animal bean2 = ctx.getBean(Animal.class);
//        System.out.println(bean2);
//        Animal bean3 = ctx.getBean(Animal.class);
//        System.out.println(bean3);
//
//        //Si es un singleton Spring lo preinstancia antes de que tu lo hagas, así comprueba que la aplicación es correcta,
//        //pero si no es un singleton se instancia en el punto donde tu lo instancies
//        
//        //Con el atributo lazy-init puedes hacer la instanciación de singletones pesados
//        Cosa bean4 = ctx.getBean(Cosa.class);
//        System.out.println(bean4);
//        Cosa bean5 = ctx.getBean(Cosa.class);
//        System.out.println(bean5);
        Persona bean = ctx.getBean(Persona.class);
        System.out.println(bean);
    }
}
