package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantManagerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * A servant manager supplies a POA with the ability 
         * to activate objects on demand when the POA receives 
         * a request targeted at an inactive object. A servant 
         * manager is registered with a POA as a callback object, 
         * to be invoked by the POA when necessary.
         * ServantManagers can either be ServantActivators or
         * ServantLocators. A ServantManager object must be 
         * local to the process containing the POA objects 
         * it is registered with.
         */
public interface ServantManagerOperations 
{
} // interface ServantManagerOperations
