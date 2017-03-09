/**
 * IntegracaoDeNadaiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IntegracaoDeNadaiLocator extends org.apache.axis.client.Service implements org.tempuri.IntegracaoDeNadai {

    public IntegracaoDeNadaiLocator() {
    }


    public IntegracaoDeNadaiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IntegracaoDeNadaiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IntegracaoDeNadaiSoap
    private java.lang.String IntegracaoDeNadaiSoap_address = "http://suporte.genialnet.com.br/IntegracaoDenadai/IntegracaoDenadai.asmx";

    public java.lang.String getIntegracaoDeNadaiSoapAddress() {
        return IntegracaoDeNadaiSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IntegracaoDeNadaiSoapWSDDServiceName = "IntegracaoDeNadaiSoap";

    public java.lang.String getIntegracaoDeNadaiSoapWSDDServiceName() {
        return IntegracaoDeNadaiSoapWSDDServiceName;
    }

    public void setIntegracaoDeNadaiSoapWSDDServiceName(java.lang.String name) {
        IntegracaoDeNadaiSoapWSDDServiceName = name;
    }

    public org.tempuri.IntegracaoDeNadaiSoap getIntegracaoDeNadaiSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IntegracaoDeNadaiSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIntegracaoDeNadaiSoap(endpoint);
    }

    public org.tempuri.IntegracaoDeNadaiSoap getIntegracaoDeNadaiSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.IntegracaoDeNadaiSoapStub _stub = new org.tempuri.IntegracaoDeNadaiSoapStub(portAddress, this);
            _stub.setPortName(getIntegracaoDeNadaiSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIntegracaoDeNadaiSoapEndpointAddress(java.lang.String address) {
        IntegracaoDeNadaiSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IntegracaoDeNadaiSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.IntegracaoDeNadaiSoapStub _stub = new org.tempuri.IntegracaoDeNadaiSoapStub(new java.net.URL(IntegracaoDeNadaiSoap_address), this);
                _stub.setPortName(getIntegracaoDeNadaiSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IntegracaoDeNadaiSoap".equals(inputPortName)) {
            return getIntegracaoDeNadaiSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "IntegracaoDeNadai");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "IntegracaoDeNadaiSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IntegracaoDeNadaiSoap".equals(portName)) {
            setIntegracaoDeNadaiSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
