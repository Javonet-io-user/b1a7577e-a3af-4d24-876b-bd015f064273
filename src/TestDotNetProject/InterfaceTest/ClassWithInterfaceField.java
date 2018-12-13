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

public class ClassWithInterfaceField {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setInterfaceProperty(Interface value) {
    try {
      javonetHandle.set("InterfaceProperty", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Interface getInterfaceProperty() {
    try {
      Object res = javonetHandle.<NObject>get("InterfaceProperty");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public Interface getInterfaceField() {
    try {
      Object res = javonetHandle.<NObject>get("InterfaceField");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setInterfaceField(Interface param) {
    try {
      javonetHandle.set("InterfaceField", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassWithInterfaceField() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.InterfaceTest.ClassWithInterfaceField");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassWithInterfaceField(Interface i) {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.InterfaceTest.ClassWithInterfaceField", i);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassWithInterfaceField(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void CallField() {
    try {
      javonetHandle.invoke("CallField");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CallProperty() {
    try {
      javonetHandle.invoke("CallProperty");
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
