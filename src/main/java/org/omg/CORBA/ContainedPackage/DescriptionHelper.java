package org.omg.CORBA.ContainedPackage;


/**
* org/omg/CORBA/ContainedPackage/DescriptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

abstract public class DescriptionHelper
{
  private static String  _id = "IDL:omg.org/CORBA/Contained/Description:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.ContainedPackage.Description that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.ContainedPackage.Description extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.DefinitionKindHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "kind",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_any);
          _members0[1] = new org.omg.CORBA.StructMember (
            "value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.omg.CORBA.ContainedPackage.DescriptionHelper.id (), "Description", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.ContainedPackage.Description read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CORBA.ContainedPackage.Description value = new org.omg.CORBA.ContainedPackage.Description ();
    value.kind = org.omg.CORBA.DefinitionKindHelper.read (istream);
    value.value = istream.read_any ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.ContainedPackage.Description value)
  {
    org.omg.CORBA.DefinitionKindHelper.write (ostream, value.kind);
    ostream.write_any (value.value);
  }

}
