package org.omg.CORBA;


/**
* org/omg/CORBA/ValueMemberDefOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// orbos 98-01-18: Objects By Value -- begin
public interface ValueMemberDefOperations  extends org.omg.CORBA.ContainedOperations
{
  org.omg.CORBA.TypeCode type ();
  org.omg.CORBA.IDLType type_def ();
  void type_def (org.omg.CORBA.IDLType newType_def);
  short access ();
  void access (short newAccess);
} // interface ValueMemberDefOperations
