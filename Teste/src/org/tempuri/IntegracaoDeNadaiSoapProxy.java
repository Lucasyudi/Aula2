package org.tempuri;

public class IntegracaoDeNadaiSoapProxy implements org.tempuri.IntegracaoDeNadaiSoap {
  private String _endpoint = null;
  private org.tempuri.IntegracaoDeNadaiSoap integracaoDeNadaiSoap = null;
  
  public IntegracaoDeNadaiSoapProxy() {
    _initIntegracaoDeNadaiSoapProxy();
  }
  
  public IntegracaoDeNadaiSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initIntegracaoDeNadaiSoapProxy();
  }
  
  private void _initIntegracaoDeNadaiSoapProxy() {
    try {
      integracaoDeNadaiSoap = (new org.tempuri.IntegracaoDeNadaiLocator()).getIntegracaoDeNadaiSoap();
      if (integracaoDeNadaiSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)integracaoDeNadaiSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)integracaoDeNadaiSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (integracaoDeNadaiSoap != null)
      ((javax.xml.rpc.Stub)integracaoDeNadaiSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IntegracaoDeNadaiSoap getIntegracaoDeNadaiSoap() {
    if (integracaoDeNadaiSoap == null)
      _initIntegracaoDeNadaiSoapProxy();
    return integracaoDeNadaiSoap;
  }
  
  public java.lang.String atualizarEmbalagem(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Embalagem embalagem) throws java.rmi.RemoteException{
    if (integracaoDeNadaiSoap == null)
      _initIntegracaoDeNadaiSoapProxy();
    return integracaoDeNadaiSoap.atualizarEmbalagem(clienteCodigo, usuario, senha, embalagem);
  }
  
  public java.lang.String atualizarProduto(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Produto produto) throws java.rmi.RemoteException{
    if (integracaoDeNadaiSoap == null)
      _initIntegracaoDeNadaiSoapProxy();
    return integracaoDeNadaiSoap.atualizarProduto(clienteCodigo, usuario, senha, produto);
  }
  
  public java.lang.String atualizarUnidade(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Unidade unidade) throws java.rmi.RemoteException{
    if (integracaoDeNadaiSoap == null)
      _initIntegracaoDeNadaiSoapProxy();
    return integracaoDeNadaiSoap.atualizarUnidade(clienteCodigo, usuario, senha, unidade);
  }
  
  public java.lang.String atualizarPessoa(int clienteCodigo, java.lang.String usuario, java.lang.String senha, org.tempuri.Pessoa pessoa) throws java.rmi.RemoteException{
    if (integracaoDeNadaiSoap == null)
      _initIntegracaoDeNadaiSoapProxy();
    return integracaoDeNadaiSoap.atualizarPessoa(clienteCodigo, usuario, senha, pessoa);
  }
  
  
}