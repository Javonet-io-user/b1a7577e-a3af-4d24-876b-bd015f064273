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
import jio.System.*;

public class InstanceClass {
  protected NObject javonetHandle;

  public InstanceClass(java.lang.Integer a, java.lang.String s, jio.System.Type t) {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.InstanceClass", a, s, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InstanceClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetX(java.lang.Integer a) {
    try {
      javonetHandle.invoke("SetX", a);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SayHiToJavonetWrapperGenerator() {
    try {
      javonetHandle.invoke("SayHiToJavonetWrapperGenerator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EnumTestParam(TestEnum sw) {
    try {
      javonetHandle.invoke("EnumTestParam", NEnum.fromJavaEnum(sw));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public TestEnum ReturnEnumFromInt(java.lang.Integer en) {
    try {
      Object res = javonetHandle.invoke("ReturnEnumFromInt", en);
      if (res == null) return null;
      return TestEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TestEnum ReturnEnumFromString(java.lang.String en) {
    try {
      Object res = javonetHandle.invoke("ReturnEnumFromString", en);
      if (res == null) return null;
      return TestEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void DoNothing() {
    try {
      javonetHandle.invoke("DoNothing");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticSetX(java.lang.Integer a) {
    try {
      Javonet.getType("InstanceClass").invoke("StaticSetX", a);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticDoNothing() {
    try {
      Javonet.getType("InstanceClass").invoke("StaticDoNothing");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Integer Add2(java.lang.Integer i) {
    try {
      java.lang.Integer res = Javonet.getType("InstanceClass").invoke("Add2", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.String AppendAaa(java.lang.String a) {
    try {
      java.lang.String res = Javonet.getType("InstanceClass").invoke("AppendAaa", a);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static jio.System.Type MyGetType(Object o) {
    try {
      Object res = Javonet.getType("InstanceClass").invoke("MyGetType", o);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer NonStaticAdd2() {
    try {
      java.lang.Integer res = javonetHandle.invoke("NonStaticAdd2");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String NonStaticAppendAaa() {
    try {
      java.lang.String res = javonetHandle.invoke("NonStaticAppendAaa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public jio.System.Type NonStaticMyGetType() {
    try {
      Object res = javonetHandle.invoke("NonStaticMyGetType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
