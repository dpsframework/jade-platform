package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantRetentionPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * This policy specifies whether the created POA retains 
         * active servants in an Active Object Map. 
         */
public interface ServantRetentionPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
           * specifies the policy value
           */
  org.omg.PortableServer.ServantRetentionPolicyValue value ();
} // interface ServantRetentionPolicyOperations
