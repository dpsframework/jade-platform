package org.omg.IOP.CodecPackage;

/**
* org/omg/IOP/CodecPackage/InvalidTypeForEncodingHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/IOP.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class InvalidTypeForEncodingHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.CodecPackage.InvalidTypeForEncoding value = null;

  public InvalidTypeForEncodingHolder ()
  {
  }

  public InvalidTypeForEncodingHolder (org.omg.IOP.CodecPackage.InvalidTypeForEncoding initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper.type ();
  }

}
