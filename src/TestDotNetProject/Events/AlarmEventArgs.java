package TestDotNetProject.Events;

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
import TestDotNetProject.Events.*;

public class AlarmEventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAlarmText(java.lang.String value) {
    try {
      javonetHandle.set("AlarmText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAlarmText() {
    try {
      java.lang.String res = javonetHandle.get("AlarmText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getNumRings() {
    try {
      java.lang.Integer res = javonetHandle.get("NumRings");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSnoozePressed() {
    try {
      java.lang.Boolean res = javonetHandle.get("SnoozePressed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public AlarmEventArgs(java.lang.Boolean snoozePressed, java.lang.Integer nRings) {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.Events.AlarmEventArgs", snoozePressed, nRings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AlarmEventArgs(NObject handle) {
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
