/*Generated by WaveMaker Studio*/

package com.web_19thjan.services.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-01-19T07:20:14.973Z
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "CalculatorSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CalculatorSoap {

    /**
     * Adds two integers. This is a test WebService. ??DNE Online
     */
    @WebResult(name = "AddResponse", targetNamespace = "http://tempuri.org/", partName = "parameters")
    @WebMethod(operationName = "Add", action = "http://tempuri.org/Add")
    public AddResponse add(
        @WebParam(partName = "parameters", name = "Add", targetNamespace = "http://tempuri.org/")
        Add parameters
    );

    @WebResult(name = "DivideResponse", targetNamespace = "http://tempuri.org/", partName = "parameters")
    @WebMethod(operationName = "Divide", action = "http://tempuri.org/Divide")
    public DivideResponse divide(
        @WebParam(partName = "parameters", name = "Divide", targetNamespace = "http://tempuri.org/")
        Divide parameters
    );

    @WebResult(name = "MultiplyResponse", targetNamespace = "http://tempuri.org/", partName = "parameters")
    @WebMethod(operationName = "Multiply", action = "http://tempuri.org/Multiply")
    public MultiplyResponse multiply(
        @WebParam(partName = "parameters", name = "Multiply", targetNamespace = "http://tempuri.org/")
        Multiply parameters
    );

    @WebResult(name = "SubtractResponse", targetNamespace = "http://tempuri.org/", partName = "parameters")
    @WebMethod(operationName = "Subtract", action = "http://tempuri.org/Subtract")
    public SubtractResponse subtract(
        @WebParam(partName = "parameters", name = "Subtract", targetNamespace = "http://tempuri.org/")
        Subtract parameters
    );
}