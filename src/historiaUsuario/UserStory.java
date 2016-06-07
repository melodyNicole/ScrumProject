/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historiaUsuario;

/**
 *
 * @author Nicole
 */
public class UserStory {

    private Long id;
    private String titulo;
    private String descripcion;
    private String criteriosAceptacion;
    private int complejidad;
    private int prioridad;

    public UserStory(String titulo, String descripcion, String criteriosAceptacion, int complejidad, int prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.criteriosAceptacion = criteriosAceptacion;
        this.complejidad = complejidad;
        this.prioridad = prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCriterios() {
        return criteriosAceptacion;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
