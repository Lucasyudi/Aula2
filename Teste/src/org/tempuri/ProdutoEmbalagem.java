/**
 * ProdutoEmbalagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ProdutoEmbalagem  implements java.io.Serializable {
    private int codigoEmbalagem;

    private java.lang.String codigoIntegracaoItem;

    private java.lang.String codigoIntegracaoProdutoFilho;

    public ProdutoEmbalagem() {
    }

    public ProdutoEmbalagem(
           int codigoEmbalagem,
           java.lang.String codigoIntegracaoItem,
           java.lang.String codigoIntegracaoProdutoFilho) {
           this.codigoEmbalagem = codigoEmbalagem;
           this.codigoIntegracaoItem = codigoIntegracaoItem;
           this.codigoIntegracaoProdutoFilho = codigoIntegracaoProdutoFilho;
    }


    /**
     * Gets the codigoEmbalagem value for this ProdutoEmbalagem.
     * 
     * @return codigoEmbalagem
     */
    public int getCodigoEmbalagem() {
        return codigoEmbalagem;
    }


    /**
     * Sets the codigoEmbalagem value for this ProdutoEmbalagem.
     * 
     * @param codigoEmbalagem
     */
    public void setCodigoEmbalagem(int codigoEmbalagem) {
        this.codigoEmbalagem = codigoEmbalagem;
    }


    /**
     * Gets the codigoIntegracaoItem value for this ProdutoEmbalagem.
     * 
     * @return codigoIntegracaoItem
     */
    public java.lang.String getCodigoIntegracaoItem() {
        return codigoIntegracaoItem;
    }


    /**
     * Sets the codigoIntegracaoItem value for this ProdutoEmbalagem.
     * 
     * @param codigoIntegracaoItem
     */
    public void setCodigoIntegracaoItem(java.lang.String codigoIntegracaoItem) {
        this.codigoIntegracaoItem = codigoIntegracaoItem;
    }


    /**
     * Gets the codigoIntegracaoProdutoFilho value for this ProdutoEmbalagem.
     * 
     * @return codigoIntegracaoProdutoFilho
     */
    public java.lang.String getCodigoIntegracaoProdutoFilho() {
        return codigoIntegracaoProdutoFilho;
    }


    /**
     * Sets the codigoIntegracaoProdutoFilho value for this ProdutoEmbalagem.
     * 
     * @param codigoIntegracaoProdutoFilho
     */
    public void setCodigoIntegracaoProdutoFilho(java.lang.String codigoIntegracaoProdutoFilho) {
        this.codigoIntegracaoProdutoFilho = codigoIntegracaoProdutoFilho;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoEmbalagem)) return false;
        ProdutoEmbalagem other = (ProdutoEmbalagem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoEmbalagem == other.getCodigoEmbalagem() &&
            ((this.codigoIntegracaoItem==null && other.getCodigoIntegracaoItem()==null) || 
             (this.codigoIntegracaoItem!=null &&
              this.codigoIntegracaoItem.equals(other.getCodigoIntegracaoItem()))) &&
            ((this.codigoIntegracaoProdutoFilho==null && other.getCodigoIntegracaoProdutoFilho()==null) || 
             (this.codigoIntegracaoProdutoFilho!=null &&
              this.codigoIntegracaoProdutoFilho.equals(other.getCodigoIntegracaoProdutoFilho())));
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
        _hashCode += getCodigoEmbalagem();
        if (getCodigoIntegracaoItem() != null) {
            _hashCode += getCodigoIntegracaoItem().hashCode();
        }
        if (getCodigoIntegracaoProdutoFilho() != null) {
            _hashCode += getCodigoIntegracaoProdutoFilho().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoEmbalagem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ProdutoEmbalagem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEmbalagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CodigoEmbalagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIntegracaoItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CodigoIntegracaoItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIntegracaoProdutoFilho");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "codigoIntegracaoProdutoFilho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
