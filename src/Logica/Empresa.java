/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author Aluno
 */
@Entity
public class Empresa {
    
     @Id
    private int id ;
    private String NomeEmpresa;
    private String StatusEmpresa,Endereco,cnpj,cpf,telefone,email,EndeSite,responsavel,
    Anotacoes,DataContrato,TipoSite;
    private byte[] imagem ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getStatusEmpresa() {
        return StatusEmpresa;
    }

    public void setStatusEmpresa(String StatusEmpresa) {
        this.StatusEmpresa = StatusEmpresa;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndeSite() {
        return EndeSite;
    }

    public void setEndeSite(String EndeSite) {
        this.EndeSite = EndeSite;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getAnotacoes() {
        return Anotacoes;
    }

    public void setAnotacoes(String Anotacoes) {
        this.Anotacoes = Anotacoes;
    }

    public String getDataContrato() {
        return DataContrato;
    }

    public void setDataContrato(String DataContrato) {
        this.DataContrato = DataContrato;
    }

    public String getTipoSite() {
        return TipoSite;
    }

    public void setTipoSite(String TipoSite) {
        this.TipoSite = TipoSite;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    

    
    
}