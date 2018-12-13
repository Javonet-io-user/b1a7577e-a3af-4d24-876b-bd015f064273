package TestDotNetProject.Arrays;

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
import TestDotNetProject.Arrays.*;

public class ArrayClass {
  protected NObject javonetHandle;

  public ArrayClass() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.Arrays.ArrayClass");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ArrayClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer SumArray(java.lang.Integer[] a) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SumArray", new Object[] {a});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer[] Sequence(java.lang.Integer n, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Sequence", n);
      if (res == null) return null;
      return (java.lang.Integer[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer[][] a(Class<?> returnArrayType) {
    try {
      Object[][] res = javonetHandle.invoke("a");
      if (res == null) return null;
      return (java.lang.Integer[][])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer[][] b(Class<?> returnArrayType) {
    try {
      Object[][] res = javonetHandle.invoke("b");
      if (res == null) return null;
      return (java.lang.Integer[][])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer[][][] c(Class<?> returnArrayType) {
    try {
      Object[][][] res = javonetHandle.invoke("c");
      if (res == null) return null;
      return (java.lang.Integer[][][])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer[][][] d(Class<?> returnArrayType) {
    try {
      Object[][][] res = javonetHandle.invoke("d");
      if (res == null) return null;
      return (java.lang.Integer[][][])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
