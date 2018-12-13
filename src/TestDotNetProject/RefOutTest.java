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

public class RefOutTest {
  protected NObject javonetHandle;

  public RefOutTest() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.RefOutTest");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RefOutTest(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add2(AtomicReference<java.lang.Integer> val) {
    try {
      javonetHandle.invoke("Add2", new NRef(val));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean TryCast(java.lang.String s, AtomicReference<java.lang.Integer> i) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "TryCast", s, new NOut(i, Helper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
