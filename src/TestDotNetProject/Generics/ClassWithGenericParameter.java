package TestDotNetProject.Generics;

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
import TestDotNetProject.Generics.*;
import jio.System.*;

public class ClassWithGenericParameter<T> {
  protected NObject javonetHandle;
  /** GenericConstructor */
  public ClassWithGenericParameter(Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType(
                  "TestDotNetProject.Generics.ClassWithGenericParameter`1", getReturnObjectName(T))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassWithGenericParameter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Type GetGenericType() {
    try {
      Object res = javonetHandle.invoke("GetGenericType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void MethodWithGenericParam(T arg) {
    try {
      javonetHandle.invoke("MethodWithGenericParam", arg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public T MethodReturnsGeneric(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("MethodReturnsGeneric");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <K> void ConvertKToT(K arg) {
    try {
      javonetHandle.generic(getGetObjectName(arg)).invoke("ConvertKToT", arg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
