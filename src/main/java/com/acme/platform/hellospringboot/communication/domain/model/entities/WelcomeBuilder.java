package com.acme.platform.hellospringboot.communication.domain.model.entities;

public class WelcomeBuilder {
    //atributo no editable con una cadena de mensaje
    private static final String WELCOME_TEMPLATE = "Hello %s!. Now You are an Spring Boot Developer";

    //metodo que devuelve un string dando la vienvenida al developer x
    private static String build(String name){
        String finalName = name == null? "Developer": name;
        return String.format(WELCOME_TEMPLATE, finalName);
    }




}
