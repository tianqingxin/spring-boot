/**
 * DemoServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example;

public class DemoServiceImplServiceLocator extends org.apache.axis.client.Service implements example.DemoServiceImplService {

    public DemoServiceImplServiceLocator() {
    }


    public DemoServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemoServicePort
    private java.lang.String DemoServicePort_address = "http://localhost:8089/app/webApp/api";

    public java.lang.String getDemoServicePortAddress() {
        return DemoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemoServicePortWSDDServiceName = "DemoServicePort";

    public java.lang.String getDemoServicePortWSDDServiceName() {
        return DemoServicePortWSDDServiceName;
    }

    public void setDemoServicePortWSDDServiceName(java.lang.String name) {
        DemoServicePortWSDDServiceName = name;
    }

    public example.DemoService getDemoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemoServicePort(endpoint);
    }

    public example.DemoService getDemoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            example.DemoServiceImplServiceSoapBindingStub _stub = new example.DemoServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDemoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoServicePortEndpointAddress(java.lang.String address) {
        DemoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (example.DemoService.class.isAssignableFrom(serviceEndpointInterface)) {
                example.DemoServiceImplServiceSoapBindingStub _stub = new example.DemoServiceImplServiceSoapBindingStub(new java.net.URL(DemoServicePort_address), this);
                _stub.setPortName(getDemoServicePortWSDDServiceName());
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
        if ("DemoServicePort".equals(inputPortName)) {
            return getDemoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.webservice.inspur.com", "DemoServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.webservice.inspur.com", "DemoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DemoServicePort".equals(portName)) {
            setDemoServicePortEndpointAddress(address);
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
