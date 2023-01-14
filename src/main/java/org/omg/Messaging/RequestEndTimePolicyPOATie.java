package org.omg.Messaging;


/**
* org/omg/Messaging/RequestEndTimePolicyPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class RequestEndTimePolicyPOATie extends RequestEndTimePolicyPOA
{

  // Constructors

  public RequestEndTimePolicyPOATie ( org.omg.Messaging.RequestEndTimePolicyOperations delegate ) {
      this._impl = delegate;
  }
  public RequestEndTimePolicyPOATie ( org.omg.Messaging.RequestEndTimePolicyOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.Messaging.RequestEndTimePolicyOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.Messaging.RequestEndTimePolicyOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public org.omg.TimeBase.UtcT end_time ()
  {
    return _impl.end_time();
  } // end_time


  /** Return the constant value that corresponds to the 
                  * type of the policy object.  The values of 
                  * the polivy objectys are allocated by the OMG.
                  * New values for PolicyType should be obtained from the OMG by
                  * sending mail to request@omg.org.  In general the constant
                  * values that are allocated are defined in conjunction with
                  * the definition of the corresponding policy object.
                  * @return the constant value that corresponds to the type of
                  * the policy object.
                  */
  public int policy_type ()
  {
    return _impl.policy_type();
  } // policy_type


  /** Copies the policy object. The copy does not retain any
                  * relationships that the policy had with any domain or object.
                  * @return the copy of the policy object.
                  */
  public org.omg.CORBA.Policy copy ()
  {
    return _impl.copy();
  } // copy


  /** Destroys the policy object.  It is the responsibility of
                  * the policy object to determine whether it can be destroyed.
                  */
  public void destroy ()
  {
    _impl.destroy();
  } // destroy

  private org.omg.Messaging.RequestEndTimePolicyOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class RequestEndTimePolicyPOATie
