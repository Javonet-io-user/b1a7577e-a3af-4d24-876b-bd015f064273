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
import jio.System.Collections.Generic.*;

public class ClassUsingCollections {
  protected NObject javonetHandle;

  public ClassUsingCollections() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.Generics.ClassUsingCollections");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassUsingCollections(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Dictionary<java.lang.Integer, List<java.lang.Integer>> GetDictionary() {
    try {
      Object res = javonetHandle.invoke("GetDictionary");
      if (res == null) return null;
      return new Dictionary<java.lang.Integer, List<java.lang.Integer>>((NObject) res);
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
