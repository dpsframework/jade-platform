package org.omg.CORBA;


/**
* org/omg/CORBA/ConstantDescription.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class ConstantDescription implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String id = null;
  public String defined_in = null;
  public String version = null;
  public org.omg.CORBA.TypeCode type = null;
  public org.omg.CORBA.Any value = null;

  public ConstantDescription ()
  {
  } // ctor

  public ConstantDescription (String _name, String _id, String _defined_in, String _version, org.omg.CORBA.TypeCode _type, org.omg.CORBA.Any _value)
  {
    name = _name;
    id = _id;
    defined_in = _defined_in;
    version = _version;
    type = _type;
    value = _value;
  } // ctor

} // class ConstantDescription
