/**
 * MyServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.zttc.service;

public interface MyServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getMyServiceImplPortAddress();

    public org.zttc.service.IMyService getMyServiceImplPort() throws javax.xml.rpc.ServiceException;

    public org.zttc.service.IMyService getMyServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
