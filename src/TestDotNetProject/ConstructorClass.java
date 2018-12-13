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

public class ConstructorClass {
  public NObject javonetHandle;

  public ConstructorClass() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.ConstructorClass");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConstructorClass(java.lang.Integer a) {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.ConstructorClass", a);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConstructorClass(java.lang.Integer a, java.lang.String b) {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.ConstructorClass", a, b);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConstructorClass(java.lang.Integer a, java.lang.String b, jio.System.Type t) {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.ConstructorClass", a, b, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConstructorClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
