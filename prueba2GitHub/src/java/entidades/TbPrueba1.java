/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "tb_prueba1")
@NamedQueries({
    @NamedQuery(name = "TbPrueba1.findAll", query = "SELECT t FROM TbPrueba1 t")
    , @NamedQuery(name = "TbPrueba1.findById", query = "SELECT t FROM TbPrueba1 t WHERE t.id = :id")
    , @NamedQuery(name = "TbPrueba1.findByNombre", query = "SELECT t FROM TbPrueba1 t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbPrueba1.findByApellido", query = "SELECT t FROM TbPrueba1 t WHERE t.apellido = :apellido")})
public class TbPrueba1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "apellido")
    private String apellido;

    public TbPrueba1() {
    }

    public TbPrueba1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPrueba1)) {
            return false;
        }
        TbPrueba1 other = (TbPrueba1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.TbPrueba1[ id=" + id + " ]";
    }
    
}
