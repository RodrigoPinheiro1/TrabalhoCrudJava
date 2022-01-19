/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlinha.Interface;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Rodrigo
 */
@Entity
@Table(name = "empresa", catalog = "projeto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Empresa_1.findAll", query = "SELECT e FROM Empresa_1 e")
    , @NamedQuery(name = "Empresa_1.findById", query = "SELECT e FROM Empresa_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Empresa_1.findByNomeEmpresa", query = "SELECT e FROM Empresa_1 e WHERE e.nomeEmpresa = :nomeEmpresa")
    , @NamedQuery(name = "Empresa_1.findByStatusEmpresa", query = "SELECT e FROM Empresa_1 e WHERE e.statusEmpresa = :statusEmpresa")
    , @NamedQuery(name = "Empresa_1.findByEndereco", query = "SELECT e FROM Empresa_1 e WHERE e.endereco = :endereco")
    , @NamedQuery(name = "Empresa_1.findByCnpj", query = "SELECT e FROM Empresa_1 e WHERE e.cnpj = :cnpj")
    , @NamedQuery(name = "Empresa_1.findByCpf", query = "SELECT e FROM Empresa_1 e WHERE e.cpf = :cpf")
    , @NamedQuery(name = "Empresa_1.findByTelefone", query = "SELECT e FROM Empresa_1 e WHERE e.telefone = :telefone")
    , @NamedQuery(name = "Empresa_1.findByEmail", query = "SELECT e FROM Empresa_1 e WHERE e.email = :email")
    , @NamedQuery(name = "Empresa_1.findByEndeSite", query = "SELECT e FROM Empresa_1 e WHERE e.endeSite = :endeSite")
    , @NamedQuery(name = "Empresa_1.findByResponsavel", query = "SELECT e FROM Empresa_1 e WHERE e.responsavel = :responsavel")
    , @NamedQuery(name = "Empresa_1.findByAnotacoes", query = "SELECT e FROM Empresa_1 e WHERE e.anotacoes = :anotacoes")
    , @NamedQuery(name = "Empresa_1.findByDataContrato", query = "SELECT e FROM Empresa_1 e WHERE e.dataContrato = :dataContrato")
    , @NamedQuery(name = "Empresa_1.findByTipoSite", query = "SELECT e FROM Empresa_1 e WHERE e.tipoSite = :tipoSite")
    , @NamedQuery(name = "Empresa_1.findByValorAtualizar", query = "SELECT e FROM Empresa_1 e WHERE e.valorAtualizar = :valorAtualizar")
  
}



)
public class Empresa_1 implements Serializable {






    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "NomeEmpresa")
    private String nomeEmpresa;
    @Column(name = "StatusEmpresa")
    private String statusEmpresa;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Cnpj")
    private String cnpj;
    @Column(name = "Cpf")
    private String cpf;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Email")
    private String email;
    @Column(name = "EndeSite")
    private String endeSite;
    @Column(name = "Responsavel")
    private String responsavel;
    @Column(name = "Anotacoes")
    private String anotacoes;
    @Column(name = "DataContrato")
    private String dataContrato;
    @Column(name = "TipoSite")
    private String tipoSite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ValorAtualizar")
    private Double valorAtualizar;

    public Empresa_1() {
    }

    public Empresa_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        String oldNomeEmpresa = this.nomeEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        changeSupport.firePropertyChange("nomeEmpresa", oldNomeEmpresa, nomeEmpresa);
    }

    public String getStatusEmpresa() {
        return statusEmpresa;
    }

    public void setStatusEmpresa(String statusEmpresa) {
        String oldStatusEmpresa = this.statusEmpresa;
        this.statusEmpresa = statusEmpresa;
        changeSupport.firePropertyChange("statusEmpresa", oldStatusEmpresa, statusEmpresa);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getEndeSite() {
        return endeSite;
    }

    public void setEndeSite(String endeSite) {
        String oldEndeSite = this.endeSite;
        this.endeSite = endeSite;
        changeSupport.firePropertyChange("endeSite", oldEndeSite, endeSite);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        String oldResponsavel = this.responsavel;
        this.responsavel = responsavel;
        changeSupport.firePropertyChange("responsavel", oldResponsavel, responsavel);
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        String oldAnotacoes = this.anotacoes;
        this.anotacoes = anotacoes;
        changeSupport.firePropertyChange("anotacoes", oldAnotacoes, anotacoes);
    }

    public String getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(String dataContrato) {
        String oldDataContrato = this.dataContrato;
        this.dataContrato = dataContrato;
        changeSupport.firePropertyChange("dataContrato", oldDataContrato, dataContrato);
    }

    public String getTipoSite() {
        return tipoSite;
    }

    public void setTipoSite(String tipoSite) {
        String oldTipoSite = this.tipoSite;
        this.tipoSite = tipoSite;
        changeSupport.firePropertyChange("tipoSite", oldTipoSite, tipoSite);
    }

    public Double getValorAtualizar() {
        return valorAtualizar;
    }

    public void setValorAtualizar(Double valorAtualizar) {
        Double oldValorAtualizar = this.valorAtualizar;
        this.valorAtualizar = valorAtualizar;
        changeSupport.firePropertyChange("valorAtualizar", oldValorAtualizar, valorAtualizar);
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
        if (!(object instanceof Empresa_1)) {
            return false;
        }
        Empresa_1 other = (Empresa_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Empresa_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    



    
}
