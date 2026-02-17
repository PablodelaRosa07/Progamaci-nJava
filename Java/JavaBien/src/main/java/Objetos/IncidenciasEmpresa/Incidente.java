package Objetos.IncidenciasEmpresa;

public class Incidente {

    private int identificadorNum;
    private String nombre;
    private String descripcion;
    private String fechaRegistro;
    private String fechaCierre;
    private String estado;
    private String criticidad;
    Equipo equipoIncidencia;

    public Incidente(String criticidad, String descripcion, Equipo equipoIncidencia, String estado, String fechaCierre, String fechaRegistro, int identificadorNum, String nombre) {
        this.criticidad = criticidad;
        this.descripcion = descripcion;
        this.equipoIncidencia = equipoIncidencia;
        this.estado = estado;
        this.fechaCierre = null;
        this.fechaRegistro = fechaRegistro;
        this.identificadorNum = identificadorNum;
        this.nombre = nombre;
    }

    public String getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(String criticidad) {
        this.criticidad = criticidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Equipo getEquipoIncidencia() {
        return equipoIncidencia;
    }

    public void setEquipoIncidencia(Equipo equipoIncidencia) {
        this.equipoIncidencia = equipoIncidencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdentificadorNum() {
        return identificadorNum;
    }

    public void setIdentificadorNum(int identificadorNum) {
        this.identificadorNum = identificadorNum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
