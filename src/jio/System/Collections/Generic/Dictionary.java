package jio.System.Collections.Generic;

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
import jio.System.Collections.Generic.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Collections.*;

public class Dictionary<TKey, TValue>
    implements jio.System.Collections.Generic.IDictionary<TKey, TValue>,
        jio.System.Collections.Generic.ICollection<KeyValuePair<TKey, TValue>>,
        jio.System.Collections.Generic.IEnumerable<KeyValuePair<TKey, TValue>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<TKey, TValue>,
        IReadOnlyCollection<KeyValuePair<TKey, TValue>>,
        ISerializable,
        IDeserializationCallback,
        Iterable<KeyValuePair<TKey, TValue>> {
  protected NObject javonetHandle;

  @Override
  public Iterator<KeyValuePair<TKey, TValue>> iterator() {
    return (Iterator<KeyValuePair<TKey, TValue>>) this.GetEnumerator();
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEqualityComparer<TKey> getComparer() {
    try {
      Object res = javonetHandle.<NObject>get("Comparer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.ICollection").invoke("get_Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public KeyCollection<TKey, TValue> getKeysProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Keys");
      if (res == null) return null;
      return new KeyCollection<TKey, TValue>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ValueCollection<TKey, TValue> getValuesProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Values");
      if (res == null) return null;
      return new ValueCollection<TKey, TValue>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void set_ItemProperty(TKey key, TValue value) {
    try {
      javonetHandle.invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TValue get_ItemProperty(TKey key, Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Item", key);
      if (res == null) return null;
      return (TValue) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public Dictionary(Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(java.lang.Integer capacity, Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      jio.System.Collections.Generic.IEqualityComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      java.lang.Integer capacity,
      jio.System.Collections.Generic.IEqualityComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      jio.System.Collections.Generic.IEqualityComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Dictionary(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(TKey key, TValue value) {
    try {
      javonetHandle.invoke("Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean ContainsKey(TKey key) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsKey", key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Object get_Values() {
    try {
      Object res = javonetHandle.invoke("get_Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Remove(TKey key) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean TryGetValue(TKey key, TValue value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryGetValue", key, value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsValue(TValue value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsValue", value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDeserialization(Object sender) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
          .invoke("OnDeserialization", sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Object get_Keys() {
    try {
      Object res = javonetHandle.invoke("get_Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Object GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Add(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      javonetHandle.invoke("Add", keyValuePair);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Contains(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", keyValuePair);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(KeyValuePair[] array, java.lang.Integer index) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Remove(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", keyValuePair);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object get_Item(Object key) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_Item", key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void set_Item(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public jio.System.Collections.ICollection IDictionary_get_Keys() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("get_Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.ICollection IDictionary_get_Values() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Contains(Object key) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("Contains", key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IDictionary_Add(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_IsFixedSize");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IDictionary_Remove(Object key) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("Remove", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object get_SyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public static class Enumerator<TKey, TValue> extends ValueType
      implements jio.System.Collections.Generic.IEnumerator<KeyValuePair<TKey, TValue>>,
          IDisposable,
          jio.System.Collections.IEnumerator,
          IDictionaryEnumerator,
          Iterator<KeyValuePair<TKey, TValue>> {
    protected NObject javonetHandle;

    @Override
    public boolean hasNext() {
      return (java.lang.Boolean) this.MoveNext();
    }

    @Override
    public KeyValuePair<TKey, TValue> next() {
      return (KeyValuePair<TKey, TValue>) this.get_Current();
    }
    /** GetProperty */

    public KeyValuePair<TKey, TValue> getCurrent() {
      try {
        Object res = javonetHandle.<NObject>get("Current");
        if (res == null) return null;
        return new KeyValuePair<TKey, TValue>((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public Enumerator(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Boolean MoveNext() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("MoveNext");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Dispose() {
      try {
        javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_Current() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("get_Current");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void Reset() {
      try {
        javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_Key() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
                .invoke("get_Key");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public Object get_Value() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
                .invoke("get_Value");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public DictionaryEntry get_Entry() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
                .invoke("get_Entry");
        if (res == null) return null;
        return new DictionaryEntry((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class KeyCollection<TKey, TValue>
      implements jio.System.Collections.Generic.ICollection<TKey>,
          jio.System.Collections.Generic.IEnumerable<TKey>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.ICollection,
          IReadOnlyCollection<TKey>,
          Iterable<TKey> {
    protected NObject javonetHandle;

    @Override
    public Iterator<TKey> iterator() {
      return (Iterator<TKey>) this.GetEnumerator();
    }
    /** GetProperty */

    public java.lang.Integer getCount() {
      try {
        java.lang.Integer res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_Count");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** GenericConstructor */

    public KeyCollection(Dictionary<TKey, TValue> dictionary, Class<?> TKey, Class<?> TValue) {
      try {
        javonetHandle =
            Javonet.getType(
                    "System.Collections.Generic.Dictionary`2+KeyCollection",
                    getReturnObjectName(TKey),
                    getReturnObjectName(TValue))
                .create();
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public KeyCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object GetEnumerator() {
      try {
        Object res = javonetHandle.invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(TKey[] array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("CopyTo", new Object[] {array}, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean get_IsReadOnly() {
      try {
        java.lang.Boolean res = javonetHandle.invoke("get_IsReadOnly");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Add(TKey item) {
      try {
        javonetHandle.invoke("Add", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void Clear() {
      try {
        javonetHandle.invoke("Clear");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean Contains(TKey item) {
      try {
        java.lang.Boolean res = javonetHandle.invoke("Contains", item);
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public java.lang.Boolean Remove(TKey item) {
      try {
        java.lang.Boolean res = javonetHandle.invoke("Remove", item);
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_SyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public java.lang.Boolean get_IsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }

    public static class Enumerator<TKey, TValue> extends ValueType
        implements jio.System.Collections.Generic.IEnumerator<TKey>,
            IDisposable,
            jio.System.Collections.IEnumerator,
            Iterator<TKey> {
      protected NObject javonetHandle;

      @Override
      public boolean hasNext() {
        return (java.lang.Boolean) this.MoveNext();
      }

      @Override
      public TKey next() {
        return (TKey) this.get_Current();
      }
      /** GetProperty */

      public TKey get_Current(Class<?> returnType) {
        try {
          Object res = javonetHandle.invoke("get_Current");
          if (res == null) return null;
          return (TKey) Convert(res, returnType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }

      public Enumerator(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      public java.lang.Boolean MoveNext() {
        try {
          java.lang.Boolean res =
              javonetHandle
                  .explicitInterface("jio.System.Collections.IEnumerator")
                  .invoke("MoveNext");
          if (res == null) return false;
          return res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }
      /** Method */

      public void Dispose() {
        try {
          javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
      /** Method */

      public Object get_Current() {
        try {
          Object res =
              javonetHandle
                  .explicitInterface("jio.System.Collections.IEnumerator")
                  .invoke("get_Current");
          if (res == null) return null;
          return ConvertToConcreteInterfaceImplementation(res);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** Method */

      public void Reset() {
        try {
          javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
    }
  }

  public static class ValueCollection<TKey, TValue>
      implements jio.System.Collections.Generic.ICollection<TValue>,
          jio.System.Collections.Generic.IEnumerable<TValue>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.ICollection,
          IReadOnlyCollection<TValue>,
          Iterable<TValue> {
    protected NObject javonetHandle;

    @Override
    public Iterator<TValue> iterator() {
      return (Iterator<TValue>) this.GetEnumerator();
    }
    /** GetProperty */

    public java.lang.Integer getCount() {
      try {
        java.lang.Integer res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_Count");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** GenericConstructor */

    public ValueCollection(Dictionary<TKey, TValue> dictionary, Class<?> TKey, Class<?> TValue) {
      try {
        javonetHandle =
            Javonet.getType(
                    "System.Collections.Generic.Dictionary`2+ValueCollection",
                    getReturnObjectName(TKey),
                    getReturnObjectName(TValue))
                .create();
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ValueCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object GetEnumerator() {
      try {
        Object res = javonetHandle.invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(TValue[] array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("CopyTo", new Object[] {array}, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean get_IsReadOnly() {
      try {
        java.lang.Boolean res = javonetHandle.invoke("get_IsReadOnly");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Add(TValue item) {
      try {
        javonetHandle.invoke("Add", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void Clear() {
      try {
        javonetHandle.invoke("Clear");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean Contains(TValue item) {
      try {
        java.lang.Boolean res = javonetHandle.invoke("Contains", item);
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public java.lang.Boolean Remove(TValue item) {
      try {
        java.lang.Boolean res = javonetHandle.invoke("Remove", item);
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_SyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public java.lang.Boolean get_IsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }

    public static class Enumerator<TKey, TValue> extends ValueType
        implements jio.System.Collections.Generic.IEnumerator<TValue>,
            IDisposable,
            jio.System.Collections.IEnumerator,
            Iterator<TValue> {
      protected NObject javonetHandle;

      @Override
      public boolean hasNext() {
        return (java.lang.Boolean) this.MoveNext();
      }

      @Override
      public TValue next() {
        return (TValue) this.get_Current();
      }
      /** GetProperty */

      public TValue get_Current(Class<?> returnType) {
        try {
          Object res = javonetHandle.invoke("get_Current");
          if (res == null) return null;
          return (TValue) Convert(res, returnType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }

      public Enumerator(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      public java.lang.Boolean MoveNext() {
        try {
          java.lang.Boolean res =
              javonetHandle
                  .explicitInterface("jio.System.Collections.IEnumerator")
                  .invoke("MoveNext");
          if (res == null) return false;
          return res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }
      /** Method */

      public void Dispose() {
        try {
          javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
      /** Method */

      public Object get_Current() {
        try {
          Object res =
              javonetHandle
                  .explicitInterface("jio.System.Collections.IEnumerator")
                  .invoke("get_Current");
          if (res == null) return null;
          return ConvertToConcreteInterfaceImplementation(res);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** Method */

      public void Reset() {
        try {
          javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
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
