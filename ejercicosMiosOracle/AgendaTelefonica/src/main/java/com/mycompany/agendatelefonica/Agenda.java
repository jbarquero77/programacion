/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;

public class Agenda {

    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[10];
    }

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio];
    }

    public void AgregarContacto(Contacto c) {

        if (existeContacto(c)) {
            System.out.println("Ya existe un contacto con ese nombre");
        } else if (agendaLlena()) {
            System.out.println("La agenda esta llena y no se pueden agregar más contactos");
        } else {
            boolean encontrado = false;

            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        }
    }

    /*Buscar si el contacto existe*/

    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                contactos[i] = c;
                return true;
            }
        }
        return false;

    }

    /*listar contactos */
    public void listarContactos() {

        if (huecosLibres() == contactos.length) {
            System.out.println("No hay contactos que mostrar");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println(contactos[i]);
                }
            }
        }

    }

    /*Buscar contactos por nombre */
    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Su teléfono es " + contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto no se ha encontrado");
        }
    }

    /*Agenda llena */

    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }
        return true;
    }

    /* Eliminar Contactos */
    public void eliminarContacto(Contacto c) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;

            }
        }

        if (encontrado) {
            System.out.println("El contacto se ha eliminado");
        }else{
            System.out.println("No se ha podido eliminar el contacto");
        }

    }

    public int huecosLibres() {

        int contadorLibres = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorLibres++;
            }
        }
        return contadorLibres;

    }

}
