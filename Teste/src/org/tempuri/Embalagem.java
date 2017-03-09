/**
 * Embalagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Embalagem  implements java.io.Serializable {
    private int codigo;

    private int unidadeMedida;

    private java.lang.String descricao;

    private java.lang.String descricaoAbreviada;

    private java.lang.String siglaFiscal;

    private java.math.BigDecimal fatorConversao;

    public Embalagem() {
    }

    public Embalagem(
           int codigo,
           int unidadeMedida,
           java.lang.String descricao,
           java.lang.String descricaoAbreviada,
           java.lang.String siglaFiscal,
           java.math.BigDecimal fatorConversao) {
           this.codigo = codigo;
           this.unidadeMedida = unidadeMedida;
           this.descricao = descricao;
           this.descricaoAbreviada = descricaoAbreviada;
           this.siglaFiscal = siglaFiscal;
           this.fatorConversao = fatorConversao;
    }


    /**
     * Gets the codigo value for this Embalagem.
     * 
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Embalagem.
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the unidadeMedida value for this Embalagem.
     * 
     * @return unidadeMedida
     */
    public int getUnidadeMedida() {
        return unidadeMedida;
    }


    /**
     * Sets the unidadeMedida value for this Embalagem.
     * 
     * @param unidadeMedida
     */
    public void setUnidadeMedida(int unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }


    /**
     * Gets the descricao value for this Embalagem.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Embalagem.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the descricaoAbreviada value for this Embalagem.
     * 
     * @return descricaoAbreviada
     */
    public java.lang.String getDescricaoAbreviada() {
        return descricaoAbreviada;
    }


    /**
     * Sets the descricaoAbreviada value for this Embalagem.
     * 
     * @param descricaoAbreviada
     */
    public void setDescricaoAbreviada(java.lang.String descricaoAbreviada) {
        this.descricaoAbreviada = descricaoAbreviada;
    }


    /**
     * Gets the siglaFiscal value for this Embalagem.
     * 
     * @return siglaFiscal
     */
    public java.lang.String getSiglaFiscal() {
        return siglaFiscal;
    }


    /**
     * Sets the siglaFiscal value for this Embalagem.
     * 
     * @param siglaFiscal
     */
    public void setSiglaFiscal(java.lang.String siglaFiscal) {
        this.siglaFiscal = siglaFiscal;
    }


    /**
     * Gets the fatorConversao value for this Embalagem.
     * 
     * @return fatorConversao
     */
    public java.math.BigDecimal getFatorConversao() {
        return fatorConversao;
    }


    /**
     * Sets the fatorConversao value for this Embalagem.
     * 
     * @param fatorConversao
     */
    public void setFatorConversao(java.math.BigDecimal fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Embalagem)) return false;
        Embalagem other = (Embalagem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigo == other.getCodigo() &&
            this.unidadeMedida == other.getUnidadeMedida() &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.descricaoAbreviada==null && other.getDescricaoAbreviada()==null) || 
             (this.descricaoAbreviada!=null &&
              this.descricaoAbreviada.equals(other.getDescricaoAbreviada()))) &&
            ((this.siglaFiscal==null && other.getSiglaFiscal()==null) || 
             (this.siglaFiscal!=null &&
              this.siglaFiscal.equals(other.getSiglaFiscal()))) &&
            ((this.fatorConversao==null && other.getFatorConversao()==null) || 
             (this.fatorConversao!=null &&
              this.fatorConversao.equals(other.getFatorConversao())));
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
        _hashCode += getCodigo();
        _hashCode += getUnidadeMedida();
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getDescricaoAbreviada() != null) {
            _hashCode += getDescricaoAbreviada().hashCode();
        }
        if (getSiglaFiscal() != null) {
            _hashCode += getSiglaFiscal().hashCode();
        }
        if (getFatorConversao() != null) {
            _hashCode += getFatorConversao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Embalagem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Embalagem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeMedida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadeMedida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoAbreviada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DescricaoAbreviada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SiglaFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatorConversao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FatorConversao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
