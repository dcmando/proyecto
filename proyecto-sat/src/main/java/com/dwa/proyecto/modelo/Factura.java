// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="factura")
public class Factura implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "idFactura";

    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idFactura;
    @Column(name="RFC", nullable=false, length=20)
    private String rfc;
    @Column(nullable=false, length=80)
    private String nomRazonEmisor;
    @Column(nullable=false, length=50)
    private String regimenFiscal;
    @Column(nullable=false, length=20)
    private String tipoFactura;
    @Column(nullable=false, length=30)
    private String fechaExpedicion;
    @Column(nullable=false, precision=10)
    private int cp;
    @Column(nullable=false, length=50)
    private String moneda;
    @Column(nullable=false, length=80)
    private String formaPago;
    @Column(nullable=false, length=80)
    private String metodoPago;
    @Column(nullable=false, length=10)
    private String tipoCambio;
    @Column(nullable=false, length=50)
    private String serie;
    @Column(nullable=false, precision=10)
    private int folio;
    @Column(nullable=false, length=50)
    private String confirmacion;
    @Column(nullable=false, precision=10)
    private int claveProducto;
    @Column(nullable=false, precision=10)
    private int claveUnidad;
    @Column(nullable=false, precision=30, scale=2)
    private BigDecimal cantidad;
    @Column(nullable=false, precision=10)
    private int unidad;
    @Column(name="noIdentificación", nullable=false, precision=10)
    private int noIdentificacion;
    @Column(nullable=false, length=100)
    private String descripcion;
    @Column(nullable=false, precision=10)
    private int valorUnitario;
    @Column(nullable=false, precision=10)
    private BigDecimal importe;
    @Column(nullable=false, precision=30, scale=2)
    private BigDecimal descuento;
    @Column(nullable=false, length=20)
    private String adicionales;
    @Column(nullable=false, length=50)
    private String complementos;

    /** Default constructor. */
    public Factura() {
        super();
    }

    /**
     * Access method for idFactura.
     *
     * @return the current value of idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * Setter method for idFactura.
     *
     * @param aIdFactura the new value for idFactura
     */
    public void setIdFactura(int aIdFactura) {
        idFactura = aIdFactura;
    }

    /**
     * Access method for rfc.
     *
     * @return the current value of rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Setter method for rfc.
     *
     * @param aRfc the new value for rfc
     */
    public void setRfc(String aRfc) {
        rfc = aRfc;
    }

    /**
     * Access method for nomRazonEmisor.
     *
     * @return the current value of nomRazonEmisor
     */
    public String getNomRazonEmisor() {
        return nomRazonEmisor;
    }

    /**
     * Setter method for nomRazonEmisor.
     *
     * @param aNomRazonEmisor the new value for nomRazonEmisor
     */
    public void setNomRazonEmisor(String aNomRazonEmisor) {
        nomRazonEmisor = aNomRazonEmisor;
    }

    /**
     * Access method for regimenFiscal.
     *
     * @return the current value of regimenFiscal
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Setter method for regimenFiscal.
     *
     * @param aRegimenFiscal the new value for regimenFiscal
     */
    public void setRegimenFiscal(String aRegimenFiscal) {
        regimenFiscal = aRegimenFiscal;
    }

    /**
     * Access method for tipoFactura.
     *
     * @return the current value of tipoFactura
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Setter method for tipoFactura.
     *
     * @param aTipoFactura the new value for tipoFactura
     */
    public void setTipoFactura(String aTipoFactura) {
        tipoFactura = aTipoFactura;
    }

    /**
     * Access method for fechaExpedicion.
     *
     * @return the current value of fechaExpedicion
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Setter method for fechaExpedicion.
     *
     * @param aFechaExpedicion the new value for fechaExpedicion
     */
    public void setFechaExpedicion(String aFechaExpedicion) {
        fechaExpedicion = aFechaExpedicion;
    }

    /**
     * Access method for cp.
     *
     * @return the current value of cp
     */
    public int getCp() {
        return cp;
    }

    /**
     * Setter method for cp.
     *
     * @param aCp the new value for cp
     */
    public void setCp(int aCp) {
        cp = aCp;
    }

    /**
     * Access method for moneda.
     *
     * @return the current value of moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Setter method for moneda.
     *
     * @param aMoneda the new value for moneda
     */
    public void setMoneda(String aMoneda) {
        moneda = aMoneda;
    }

    /**
     * Access method for formaPago.
     *
     * @return the current value of formaPago
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Setter method for formaPago.
     *
     * @param aFormaPago the new value for formaPago
     */
    public void setFormaPago(String aFormaPago) {
        formaPago = aFormaPago;
    }

    /**
     * Access method for metodoPago.
     *
     * @return the current value of metodoPago
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Setter method for metodoPago.
     *
     * @param aMetodoPago the new value for metodoPago
     */
    public void setMetodoPago(String aMetodoPago) {
        metodoPago = aMetodoPago;
    }

    /**
     * Access method for tipoCambio.
     *
     * @return the current value of tipoCambio
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Setter method for tipoCambio.
     *
     * @param aTipoCambio the new value for tipoCambio
     */
    public void setTipoCambio(String aTipoCambio) {
        tipoCambio = aTipoCambio;
    }

    /**
     * Access method for serie.
     *
     * @return the current value of serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Setter method for serie.
     *
     * @param aSerie the new value for serie
     */
    public void setSerie(String aSerie) {
        serie = aSerie;
    }

    /**
     * Access method for folio.
     *
     * @return the current value of folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Setter method for folio.
     *
     * @param aFolio the new value for folio
     */
    public void setFolio(int aFolio) {
        folio = aFolio;
    }

    /**
     * Access method for confirmacion.
     *
     * @return the current value of confirmacion
     */
    public String getConfirmacion() {
        return confirmacion;
    }

    /**
     * Setter method for confirmacion.
     *
     * @param aConfirmacion the new value for confirmacion
     */
    public void setConfirmacion(String aConfirmacion) {
        confirmacion = aConfirmacion;
    }

    /**
     * Access method for claveProducto.
     *
     * @return the current value of claveProducto
     */
    public int getClaveProducto() {
        return claveProducto;
    }

    /**
     * Setter method for claveProducto.
     *
     * @param aClaveProducto the new value for claveProducto
     */
    public void setClaveProducto(int aClaveProducto) {
        claveProducto = aClaveProducto;
    }

    /**
     * Access method for claveUnidad.
     *
     * @return the current value of claveUnidad
     */
    public int getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * Setter method for claveUnidad.
     *
     * @param aClaveUnidad the new value for claveUnidad
     */
    public void setClaveUnidad(int aClaveUnidad) {
        claveUnidad = aClaveUnidad;
    }

    /**
     * Access method for cantidad.
     *
     * @return the current value of cantidad
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Setter method for cantidad.
     *
     * @param aCantidad the new value for cantidad
     */
    public void setCantidad(BigDecimal aCantidad) {
        cantidad = aCantidad;
    }

    /**
     * Access method for unidad.
     *
     * @return the current value of unidad
     */
    public int getUnidad() {
        return unidad;
    }

    /**
     * Setter method for unidad.
     *
     * @param aUnidad the new value for unidad
     */
    public void setUnidad(int aUnidad) {
        unidad = aUnidad;
    }

    /**
     * Access method for noIdentificacion.
     *
     * @return the current value of noIdentificacion
     */
    public int getNoIdentificacion() {
        return noIdentificacion;
    }

    /**
     * Setter method for noIdentificacion.
     *
     * @param aNoIdentificacion the new value for noIdentificacion
     */
    public void setNoIdentificacion(int aNoIdentificacion) {
        noIdentificacion = aNoIdentificacion;
    }

    /**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for valorUnitario.
     *
     * @return the current value of valorUnitario
     */
    public int getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Setter method for valorUnitario.
     *
     * @param aValorUnitario the new value for valorUnitario
     */
    public void setValorUnitario(int aValorUnitario) {
        valorUnitario = aValorUnitario;
    }

    /**
     * Access method for importe.
     *
     * @return the current value of importe
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Setter method for importe.
     *
     * @param aImporte the new value for importe
     */
    public void setImporte(BigDecimal aImporte) {
        importe = aImporte;
    }

    /**
     * Access method for descuento.
     *
     * @return the current value of descuento
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Setter method for descuento.
     *
     * @param aDescuento the new value for descuento
     */
    public void setDescuento(BigDecimal aDescuento) {
        descuento = aDescuento;
    }

    /**
     * Access method for adicionales.
     *
     * @return the current value of adicionales
     */
    public String getAdicionales() {
        return adicionales;
    }

    /**
     * Setter method for adicionales.
     *
     * @param aAdicionales the new value for adicionales
     */
    public void setAdicionales(String aAdicionales) {
        adicionales = aAdicionales;
    }

    /**
     * Access method for complementos.
     *
     * @return the current value of complementos
     */
    public String getComplementos() {
        return complementos;
    }

    /**
     * Setter method for complementos.
     *
     * @param aComplementos the new value for complementos
     */
    public void setComplementos(String aComplementos) {
        complementos = aComplementos;
    }

    /**
     * Compares the key for this instance with another Factura.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Factura and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Factura)) {
            return false;
        }
        Factura that = (Factura) other;
        if (this.getIdFactura() != that.getIdFactura()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Factura.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Factura)) return false;
        return this.equalKeys(other) && ((Factura)other).equalKeys(this);
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
        i = getIdFactura();
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
        StringBuffer sb = new StringBuffer("[Factura |");
        sb.append(" idFactura=").append(getIdFactura());
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
        ret.put("idFactura", Integer.valueOf(getIdFactura()));
        return ret;
    }

}
