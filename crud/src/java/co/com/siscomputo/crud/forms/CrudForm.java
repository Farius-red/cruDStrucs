package co.com.siscomputo.crud.forms;


import org.apache.struts.action.ActionForm;

public class CrudForm extends ActionForm {
    
    private Integer idU;
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String pais;
    private String departamento;
    private String ciudad;
    private String direccion;
    private Integer action;

    public Integer getIdU() {
        return idU;
    }

    public void setIdU(Integer idU) {
        this.idU = idU;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

   

}
