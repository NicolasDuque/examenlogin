/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Login {

    private ArrayList<Persona> personas;

    public Login() {
        personas = new ArrayList<Persona>();
    }

    public boolean guardarLogin(Persona p) {

        Persona per = buscarLogin(p.getUsuario());
        boolean fueGuardado = true;
        if (per != null) {
            fueGuardado = false;
        } else 
        {
            personas.add(per);
        }
        return fueGuardado;
    }

    //usu = usuario a buscar

    public Persona buscarLogin(String usu) {
//el metodo size de la clase Arraylist retorna
        //la cantidad de objeto que tiene el Arraylist
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getUsuario().equals(usu)) {
                return personas.get(i);
            }

        }
        return null;
    }
}
