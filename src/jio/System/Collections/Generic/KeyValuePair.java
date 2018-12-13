package jio.System.Collections.Generic;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class KeyValuePair<TKey, TValue> extends ValueType {
  protected NObject javonetHandle;
  /** GetProperty */
  public TKey get_Key(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Key");
      if (res == null) return null;
      return (TKey) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public TValue get_Value(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Value");
      if (res == null) return null;
      return (TValue) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public KeyValuePair(TKey key, TValue value, Class<?> TKey, Class<?> TValue) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.KeyValuePair`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyValuePair(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
