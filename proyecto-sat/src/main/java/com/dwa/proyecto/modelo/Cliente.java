// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="cliente")
public class Cliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "rfcCliente";

   

    @Id
    @Column(name="RFC_Cliente", unique=true, nullable=false, length=20)
    private String rfcCliente;
    @Column(nullable=false, length=30)
    private String nombre;
    @Column(nullable=false, length=60)
    private String apellidos;
    @Column(nullable=false, length=80)
    private String correo;
    @Column(nullable=false, length=30)
    private String fechaNac;

    /** Default constructor. */
    public Cliente() {
        super();
    }

    /**
     * Access method for rfcCliente.
     *
     * @return the current value of rfcCliente
     */
    public String getRfcCliente() {
        return rfcCliente;
    }

    /**
     * Setter method for rfcCliente.
     *
     * @param aRfcCliente the new value for rfcCliente
     */
    public void setRfcCliente(String aRfcCliente) {
        rfcCliente = aRfcCliente;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for apellidos.
     *
     * @return the current value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter method for apellidos.
     *
     * @param aApellidos the new value for apellidos
     */
    public void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    /**
     * Access method for correo.
     *
     * @return the current value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter method for correo.
     *
     * @param aCorreo the new value for correo
     */
    public void setCorreo(String aCorreo) {
        correo = aCorreo;
    }

    /**
     * Access method for fechaNac.
     *
     * @return the current value of fechaNac
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * Setter method for fechaNac.
     *
     * @param aFechaNac the new value for fechaNac
     */
    public void setFechaNac(String aFechaNac) {
        fechaNac = aFechaNac;
    }

    /**
     * Compares the key for this instance with another Cliente.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cliente and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cliente)) {
            return false;
        }
        Cliente that = (Cliente) other;
        Object myRfcCliente = this.getRfcCliente();
        Object yourRfcCliente = that.getRfcCliente();
        if (myRfcCliente==null ? yourRfcCliente!=null : !myRfcCliente.equals(yourRfcCliente)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cliente.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cliente)) return false;
        return this.equalKeys(other) && ((Cliente)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getRfcCliente() == null) {
            i = 0;
        } else {
            i = getRfcCliente().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Cliente |");
        sb.append(" rfcCliente=").append(getRfcCliente());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("rfcCliente", getRfcCliente());
        return ret;
    }

}
