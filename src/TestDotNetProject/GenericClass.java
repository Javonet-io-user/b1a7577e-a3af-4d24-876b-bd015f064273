package TestDotNetProject;

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
import TestDotNetProject.*;

public class GenericClass {
  protected NObject javonetHandle;

  public GenericClass() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.GenericClass");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GenericClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public <T> void MethodWithGenericParameter(T arg1) {
    try {
      javonetHandle.generic(getGetObjectName(arg1)).invoke("MethodWithGenericParameter", arg1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T, K> K MethodGenericReturnAndArg(T arg1, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(arg1), getReturnObjectName(returnType))
              .invoke("MethodGenericReturnAndArg", arg1);
      if (res == null) return null;
      return (K) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <K> K MethodGenericReturn(Class<?> returnType) {
    try {
      Object res =
          javonetHandle.generic(getReturnObjectName(returnType)).invoke("MethodGenericReturn");
      if (res == null) return null;
      return (K) Convert(res, returnType);
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
