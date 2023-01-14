package org.omg.CORBA;


/**
* org/omg/CORBA/ArrayDefPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public abstract class ArrayDefPOA extends org.omg.PortableServer.Servant
 implements org.omg.CORBA.ArrayDefOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_length", new java.lang.Integer (0));
    _methods.put ("_set_length", new java.lang.Integer (1));
    _methods.put ("_get_element_type", new java.lang.Integer (2));
    _methods.put ("_get_element_type_def", new java.lang.Integer (3));
    _methods.put ("_set_element_type_def", new java.lang.Integer (4));
    _methods.put ("_get_type", new java.lang.Integer (5));
    _methods.put ("_get_def_kind", new java.lang.Integer (6));
    _methods.put ("destroy", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // org/omg/CORBA/ArrayDef/_get_length
       {
         int $result = (int)0;
         $result = this.length ();
         out = $rh.createReply();
         out.write_ulong ($result);
         break;
       }

       case 1:  // org/omg/CORBA/ArrayDef/_set_length
       {
         int newLength = in.read_ulong ();
         this.length (newLength);
         out = $rh.createReply();
         break;
       }

       case 2:  // org/omg/CORBA/ArrayDef/_get_element_type
       {
         org.omg.CORBA.TypeCode $result = null;
         $result = this.element_type ();
         out = $rh.createReply();
         out.write_TypeCode ($result);
         break;
       }

       case 3:  // org/omg/CORBA/ArrayDef/_get_element_type_def
       {
         org.omg.CORBA.IDLType $result = null;
         $result = this.element_type_def ();
         out = $rh.createReply();
         org.omg.CORBA.IDLTypeHelper.write (out, $result);
         break;
       }

       case 4:  // org/omg/CORBA/ArrayDef/_set_element_type_def
       {
         org.omg.CORBA.IDLType newElement_type_def = org.omg.CORBA.IDLTypeHelper.read (in);
         this.element_type_def (newElement_type_def);
         out = $rh.createReply();
         break;
       }

       case 5:  // org/omg/CORBA/IDLType/_get_type
       {
         org.omg.CORBA.TypeCode $result = null;
         $result = this.type ();
         out = $rh.createReply();
         out.write_TypeCode ($result);
         break;
       }


  // read interface
       case 6:  // org/omg/CORBA/IRObject/_get_def_kind
       {
         org.omg.CORBA.DefinitionKind $result = null;
         $result = this.def_kind ();
         out = $rh.createReply();
         org.omg.CORBA.DefinitionKindHelper.write (out, $result);
         break;
       }


  // write interface
       case 7:  // org/omg/CORBA/IRObject/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CORBA/ArrayDef:1.0", 
    "IDL:CORBA/IDLType:1.0", 
    "IDL:CORBA/IRObject:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ArrayDef _this() 
  {
    return ArrayDefHelper.narrow(
    super._this_object());
  }

  public ArrayDef _this(org.omg.CORBA.ORB orb) 
  {
    return ArrayDefHelper.narrow(
    super._this_object(orb));
  }


} // class ArrayDefPOA
