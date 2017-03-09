/**
 * IntegracaoDeNadaiSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IntegracaoDeNadaiSoap extends java.rmi.Remote {
    public java.lang.String atualizarEmbalagem(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Embalagem embalagem) throws java.rmi.RemoteException;
    public java.lang.String atualizarProduto(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Produto produto) throws java.rmi.RemoteException;
    public java.lang.String atualizarUnidade(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Unidade unidade) throws java.rmi.RemoteException;
    public java.lang.String atualizarPessoa(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Pessoa pessoa) throws java.rmi.RemoteException;
}
