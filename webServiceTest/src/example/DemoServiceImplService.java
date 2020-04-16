/**
 * DemoServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example;

public interface DemoServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getDemoServicePortAddress();

    public example.DemoService getDemoServicePort() throws javax.xml.rpc.ServiceException;

    public example.DemoService getDemoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
