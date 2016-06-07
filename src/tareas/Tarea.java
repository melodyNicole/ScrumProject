/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import historiaUsuario.UserStory;

/**
 *
 * @author Carla
 */
public class Tarea {

    private String titulo;
    private String descripcion;
    private UserStory historiaUsuario;

    public Tarea(String titulo, String descripcion, UserStory historiaUsuario) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.historiaUsuario = historiaUsuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public UserStory getHistoriaUsuario() {
        return historiaUsuario;
    }
}
