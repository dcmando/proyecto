// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="persona")
public class Persona implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** Primary key. */
    protected static final String PK = "id";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=50)
    private String nombre;
    @Column(nullable=false, length=50)
    private String apellidos;
    @Column(nullable=false, length=50)
    private String razonsocial;
    @Column(nullable=false, length=50)
    private String pass;

    /** Default constructor. */
    public Persona() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
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
     * Access method for razonsocial.
     *
     * @return the current value of razonsocial
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * Setter method for razonsocial.
     *
     * @param aRazonsocial the new value for razonsocial
     */
    public void setRazonsocial(String aRazonsocial) {
        razonsocial = aRazonsocial;
    }

    /**
     * Access method for pass.
     *
     * @return the current value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Setter method for pass.
     *
     * @param aPass the new value for pass
     */
    public void setPass(String aPass) {
        pass = aPass;
    }

    /**
     * Compares the key for this instance with another Persona.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Persona and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Persona)) {
            return false;
        }
        Persona that = (Persona) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Persona.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Persona)) return false;
        return this.equalKeys(other) && ((Persona)other).equalKeys(this);
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
        i = getId();
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
        StringBuffer sb = new StringBuffer("[Persona |");
        sb.append(" id=").append(getId());
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
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
