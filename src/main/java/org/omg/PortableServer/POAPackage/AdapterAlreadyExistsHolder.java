package org.omg.PortableServer.POAPackage;

/**
* org/omg/PortableServer/POAPackage/AdapterAlreadyExistsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class AdapterAlreadyExistsHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableServer.POAPackage.AdapterAlreadyExists value = null;

  public AdapterAlreadyExistsHolder ()
  {
  }

  public AdapterAlreadyExistsHolder (org.omg.PortableServer.POAPackage.AdapterAlreadyExists initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper.type ();
  }

}
