/**
 * PessoaTipo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PessoaTipo  implements java.io.Serializable {
    private java.lang.String cnpjCpf;

    private int tipo;

    public PessoaTipo() {
    }

    public PessoaTipo(
           java.lang.String cnpjCpf,
           int tipo) {
           this.cnpjCpf = cnpjCpf;
           this.tipo = tipo;
    }


    /**
     * Gets the cnpjCpf value for this PessoaTipo.
     * 
     * @return cnpjCpf
     */
    public java.lang.String getCnpjCpf() {
        return cnpjCpf;
    }


    /**
     * Sets the cnpjCpf value for this PessoaTipo.
     * 
     * @param cnpjCpf
     */
    public void setCnpjCpf(java.lang.String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }


    /**
     * Gets the tipo value for this PessoaTipo.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this PessoaTipo.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PessoaTipo)) return false;
        PessoaTipo other = (PessoaTipo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cnpjCpf==null && other.getCnpjCpf()==null) || 
             (this.cnpjCpf!=null &&
              this.cnpjCpf.equals(other.getCnpjCpf()))) &&
            this.tipo == other.getTipo();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCnpjCpf() != null) {
            _hashCode += getCnpjCpf().hashCode();
        }
        _hashCode += getTipo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PessoaTipo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PessoaTipo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpjCpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CnpjCpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
