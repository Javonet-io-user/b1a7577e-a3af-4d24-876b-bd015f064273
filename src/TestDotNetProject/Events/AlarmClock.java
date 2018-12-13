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
import jio.System.*;

public class AlarmClock {
  protected NObject javonetHandle;

  public AlarmClock() {
    try {
      javonetHandle = Javonet.New("TestDotNetProject.Events.AlarmClock");
      javonetHandle.addEventListener(
          "Alarm",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (AlarmEventHandler handler : _AlarmListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], AlarmEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AlarmClock(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Start() {
    try {
      javonetHandle.invoke("Start");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<AlarmEventHandler> _AlarmListeners =
      new java.util.ArrayList<AlarmEventHandler>();

  public void addAlarm(AlarmEventHandler toAdd) {
    _AlarmListeners.add(toAdd);
  }

  public void removeAlarm(AlarmEventHandler toRemove) {
    _AlarmListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
