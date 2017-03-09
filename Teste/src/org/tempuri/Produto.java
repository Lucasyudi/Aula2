/**
 * Produto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Produto  implements java.io.Serializable {
    private java.lang.String descricao;

    private int unidadeMedida;

    private java.lang.String codigoIntegracao;

    private org.tempuri.ProdutoEmbalagem[] produtoEmbalagens;

    public Produto() {
    }

    public Produto(
           java.lang.String descricao,
           int unidadeMedida,
           java.lang.String codigoIntegracao,
           org.tempuri.ProdutoEmbalagem[] produtoEmbalagens) {
           this.descricao = descricao;
           this.unidadeMedida = unidadeMedida;
           this.codigoIntegracao = codigoIntegracao;
           this.produtoEmbalagens = produtoEmbalagens;
    }


    /**
     * Gets the descricao value for this Produto.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Produto.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the unidadeMedida value for this Produto.
     * 
     * @return unidadeMedida
     */
    public int getUnidadeMedida() {
        return unidadeMedida;
    }


    /**
     * Sets the unidadeMedida value for this Produto.
     * 
     * @param unidadeMedida
     */
    public void setUnidadeMedida(int unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }


    /**
     * Gets the codigoIntegracao value for this Produto.
     * 
     * @return codigoIntegracao
     */
    public java.lang.String getCodigoIntegracao() {
        return codigoIntegracao;
    }


    /**
     * Sets the codigoIntegracao value for this Produto.
     * 
     * @param codigoIntegracao
     */
    public void setCodigoIntegracao(java.lang.String codigoIntegracao) {
        this.codigoIntegracao = codigoIntegracao;
    }


    /**
     * Gets the produtoEmbalagens value for this Produto.
     * 
     * @return produtoEmbalagens
     */
    public org.tempuri.ProdutoEmbalagem[] getProdutoEmbalagens() {
        return produtoEmbalagens;
    }


    /**
     * Sets the produtoEmbalagens value for this Produto.
     * 
     * @param produtoEmbalagens
     */
    public void setProdutoEmbalagens(org.tempuri.ProdutoEmbalagem[] produtoEmbalagens) {
        this.produtoEmbalagens = produtoEmbalagens;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.unidadeMedida == other.getUnidadeMedida() &&
            ((this.codigoIntegracao==null && other.getCodigoIntegracao()==null) || 
             (this.codigoIntegracao!=null &&
              this.codigoIntegracao.equals(other.getCodigoIntegracao()))) &&
            ((this.produtoEmbalagens==null && other.getProdutoEmbalagens()==null) || 
             (this.produtoEmbalagens!=null &&
              java.util.Arrays.equals(this.produtoEmbalagens, other.getProdutoEmbalagens())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += getUnidadeMedida();
        if (getCodigoIntegracao() != null) {
            _hashCode += getCodigoIntegracao().hashCode();
        }
        if (getProdutoEmbalagens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdutoEmbalagens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdutoEmbalagens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Produto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeMedida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadeMedida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIntegracao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CodigoIntegracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produtoEmbalagens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProdutoEmbalagens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ProdutoEmbalagem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ProdutoEmbalagem"));
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
