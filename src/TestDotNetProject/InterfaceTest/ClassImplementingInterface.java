package TestDotNetProject.InterfaceTest;

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
import TestDotNetProject.InterfaceTest.*;

public class ClassImplementingInterface implements Interface {
  protected NObject javonetHandle;

  public ClassImplementingInterface() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.InterfaceTest.ClassImplementingInterface");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassImplementingInterface(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Print() {
    try {
      javonetHandle.explicitInterface("TestDotNetProject.InterfaceTest.Interface").invoke("Print");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetA() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("TestDotNetProject.InterfaceTest.Interface")
              .invoke("GetA");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer ConvertToInt(java.lang.String a) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("TestDotNetProject.InterfaceTest.Interface")
              .invoke("ConvertToInt", a);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
