package org.omg.DynamicAny;

/**
* org/omg/DynamicAny/DynEnumHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
    * DynEnum objects support the manipulation of IDL enumerated values.
    * The current position of a DynEnum is always -1.
    */
public final class DynEnumHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.DynamicAny.DynEnum value = null;

  public DynEnumHolder ()
  {
  }

  public DynEnumHolder (org.omg.DynamicAny.DynEnum initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.DynamicAny.DynEnumHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.DynamicAny.DynEnumHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.DynamicAny.DynEnumHelper.type ();
  }

}
