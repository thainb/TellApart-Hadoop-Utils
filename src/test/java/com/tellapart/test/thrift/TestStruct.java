/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.tellapart.test.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class TestStruct implements TBase<TestStruct, TestStruct._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TestStruct");

  private static final TField INT_FIELD_FIELD_DESC = new TField("intField", TType.I32, (short)1);
  private static final TField LONG_FIELD_FIELD_DESC = new TField("longField", TType.I64, (short)2);
  private static final TField STRING_FIELD_FIELD_DESC = new TField("stringField", TType.STRING, (short)3);
  private static final TField LIST_FIELD_FIELD_DESC = new TField("listField", TType.LIST, (short)4);
  private static final TField MAP_OF_LISTS_FIELD_DESC = new TField("mapOfLists", TType.MAP, (short)5);

  private int intField;
  private long longField;
  private String stringField;
  private List<String> listField;
  private Map<String,List<Integer>> mapOfLists;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    INT_FIELD((short)1, "intField"),
    LONG_FIELD((short)2, "longField"),
    STRING_FIELD((short)3, "stringField"),
    LIST_FIELD((short)4, "listField"),
    MAP_OF_LISTS((short)5, "mapOfLists");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INT_FIELD
          return INT_FIELD;
        case 2: // LONG_FIELD
          return LONG_FIELD;
        case 3: // STRING_FIELD
          return STRING_FIELD;
        case 4: // LIST_FIELD
          return LIST_FIELD;
        case 5: // MAP_OF_LISTS
          return MAP_OF_LISTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __INTFIELD_ISSET_ID = 0;
  private static final int __LONGFIELD_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INT_FIELD, new FieldMetaData("intField", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.LONG_FIELD, new FieldMetaData("longField", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.STRING_FIELD, new FieldMetaData("stringField", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.LIST_FIELD, new FieldMetaData("listField", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.MAP_OF_LISTS, new FieldMetaData("mapOfLists", TFieldRequirementType.OPTIONAL, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I32)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TestStruct.class, metaDataMap);
  }

  public TestStruct() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TestStruct(TestStruct other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.intField = other.intField;
    this.longField = other.longField;
    if (other.isSetStringField()) {
      this.stringField = other.stringField;
    }
    if (other.isSetListField()) {
      List<String> __this__listField = new ArrayList<String>();
      for (String other_element : other.listField) {
        __this__listField.add(other_element);
      }
      this.listField = __this__listField;
    }
    if (other.isSetMapOfLists()) {
      Map<String,List<Integer>> __this__mapOfLists = new HashMap<String,List<Integer>>();
      for (Map.Entry<String, List<Integer>> other_element : other.mapOfLists.entrySet()) {

        String other_element_key = other_element.getKey();
        List<Integer> other_element_value = other_element.getValue();

        String __this__mapOfLists_copy_key = other_element_key;

        List<Integer> __this__mapOfLists_copy_value = new ArrayList<Integer>();
        for (Integer other_element_value_element : other_element_value) {
          __this__mapOfLists_copy_value.add(other_element_value_element);
        }

        __this__mapOfLists.put(__this__mapOfLists_copy_key, __this__mapOfLists_copy_value);
      }
      this.mapOfLists = __this__mapOfLists;
    }
  }

  public TestStruct deepCopy() {
    return new TestStruct(this);
  }

  @Deprecated
  public TestStruct clone() {
    return new TestStruct(this);
  }

  @Override
  public void clear() {
    setIntFieldIsSet(false);
    this.intField = 0;
    setLongFieldIsSet(false);
    this.longField = 0;
    this.stringField = null;
    this.listField = null;
    this.mapOfLists = null;
  }

  public int getIntField() {
    return this.intField;
  }

  public void setIntField(int intField) {
    this.intField = intField;
    setIntFieldIsSet(true);
  }

  public void unsetIntField() {
    __isset_bit_vector.clear(__INTFIELD_ISSET_ID);
  }

  /** Returns true if field intField is set (has been asigned a value) and false otherwise */
  public boolean isSetIntField() {
    return __isset_bit_vector.get(__INTFIELD_ISSET_ID);
  }

  public void setIntFieldIsSet(boolean value) {
    __isset_bit_vector.set(__INTFIELD_ISSET_ID, value);
  }

  public long getLongField() {
    return this.longField;
  }

  public void setLongField(long longField) {
    this.longField = longField;
    setLongFieldIsSet(true);
  }

  public void unsetLongField() {
    __isset_bit_vector.clear(__LONGFIELD_ISSET_ID);
  }

  /** Returns true if field longField is set (has been asigned a value) and false otherwise */
  public boolean isSetLongField() {
    return __isset_bit_vector.get(__LONGFIELD_ISSET_ID);
  }

  public void setLongFieldIsSet(boolean value) {
    __isset_bit_vector.set(__LONGFIELD_ISSET_ID, value);
  }

  public String getStringField() {
    return this.stringField;
  }

  public void setStringField(String stringField) {
    this.stringField = stringField;
  }

  public void unsetStringField() {
    this.stringField = null;
  }

  /** Returns true if field stringField is set (has been asigned a value) and false otherwise */
  public boolean isSetStringField() {
    return this.stringField != null;
  }

  public void setStringFieldIsSet(boolean value) {
    if (!value) {
      this.stringField = null;
    }
  }

  public int getListFieldSize() {
    return (this.listField == null) ? 0 : this.listField.size();
  }

  public java.util.Iterator<String> getListFieldIterator() {
    return (this.listField == null) ? null : this.listField.iterator();
  }

  public void addToListField(String elem) {
    if (this.listField == null) {
      this.listField = new ArrayList<String>();
    }
    this.listField.add(elem);
  }

  public List<String> getListField() {
    return this.listField;
  }

  public void setListField(List<String> listField) {
    this.listField = listField;
  }

  public void unsetListField() {
    this.listField = null;
  }

  /** Returns true if field listField is set (has been asigned a value) and false otherwise */
  public boolean isSetListField() {
    return this.listField != null;
  }

  public void setListFieldIsSet(boolean value) {
    if (!value) {
      this.listField = null;
    }
  }

  public int getMapOfListsSize() {
    return (this.mapOfLists == null) ? 0 : this.mapOfLists.size();
  }

  public void putToMapOfLists(String key, List<Integer> val) {
    if (this.mapOfLists == null) {
      this.mapOfLists = new HashMap<String,List<Integer>>();
    }
    this.mapOfLists.put(key, val);
  }

  public Map<String,List<Integer>> getMapOfLists() {
    return this.mapOfLists;
  }

  public void setMapOfLists(Map<String,List<Integer>> mapOfLists) {
    this.mapOfLists = mapOfLists;
  }

  public void unsetMapOfLists() {
    this.mapOfLists = null;
  }

  /** Returns true if field mapOfLists is set (has been asigned a value) and false otherwise */
  public boolean isSetMapOfLists() {
    return this.mapOfLists != null;
  }

  public void setMapOfListsIsSet(boolean value) {
    if (!value) {
      this.mapOfLists = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INT_FIELD:
      if (value == null) {
        unsetIntField();
      } else {
        setIntField((Integer)value);
      }
      break;

    case LONG_FIELD:
      if (value == null) {
        unsetLongField();
      } else {
        setLongField((Long)value);
      }
      break;

    case STRING_FIELD:
      if (value == null) {
        unsetStringField();
      } else {
        setStringField((String)value);
      }
      break;

    case LIST_FIELD:
      if (value == null) {
        unsetListField();
      } else {
        setListField((List<String>)value);
      }
      break;

    case MAP_OF_LISTS:
      if (value == null) {
        unsetMapOfLists();
      } else {
        setMapOfLists((Map<String,List<Integer>>)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INT_FIELD:
      return new Integer(getIntField());

    case LONG_FIELD:
      return new Long(getLongField());

    case STRING_FIELD:
      return getStringField();

    case LIST_FIELD:
      return getListField();

    case MAP_OF_LISTS:
      return getMapOfLists();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case INT_FIELD:
      return isSetIntField();
    case LONG_FIELD:
      return isSetLongField();
    case STRING_FIELD:
      return isSetStringField();
    case LIST_FIELD:
      return isSetListField();
    case MAP_OF_LISTS:
      return isSetMapOfLists();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TestStruct)
      return this.equals((TestStruct)that);
    return false;
  }

  public boolean equals(TestStruct that) {
    if (that == null)
      return false;

    boolean this_present_intField = true && this.isSetIntField();
    boolean that_present_intField = true && that.isSetIntField();
    if (this_present_intField || that_present_intField) {
      if (!(this_present_intField && that_present_intField))
        return false;
      if (this.intField != that.intField)
        return false;
    }

    boolean this_present_longField = true && this.isSetLongField();
    boolean that_present_longField = true && that.isSetLongField();
    if (this_present_longField || that_present_longField) {
      if (!(this_present_longField && that_present_longField))
        return false;
      if (this.longField != that.longField)
        return false;
    }

    boolean this_present_stringField = true && this.isSetStringField();
    boolean that_present_stringField = true && that.isSetStringField();
    if (this_present_stringField || that_present_stringField) {
      if (!(this_present_stringField && that_present_stringField))
        return false;
      if (!this.stringField.equals(that.stringField))
        return false;
    }

    boolean this_present_listField = true && this.isSetListField();
    boolean that_present_listField = true && that.isSetListField();
    if (this_present_listField || that_present_listField) {
      if (!(this_present_listField && that_present_listField))
        return false;
      if (!this.listField.equals(that.listField))
        return false;
    }

    boolean this_present_mapOfLists = true && this.isSetMapOfLists();
    boolean that_present_mapOfLists = true && that.isSetMapOfLists();
    if (this_present_mapOfLists || that_present_mapOfLists) {
      if (!(this_present_mapOfLists && that_present_mapOfLists))
        return false;
      if (!this.mapOfLists.equals(that.mapOfLists))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_intField = true && (isSetIntField());
    builder.append(present_intField);
    if (present_intField)
      builder.append(intField);

    boolean present_longField = true && (isSetLongField());
    builder.append(present_longField);
    if (present_longField)
      builder.append(longField);

    boolean present_stringField = true && (isSetStringField());
    builder.append(present_stringField);
    if (present_stringField)
      builder.append(stringField);

    boolean present_listField = true && (isSetListField());
    builder.append(present_listField);
    if (present_listField)
      builder.append(listField);

    boolean present_mapOfLists = true && (isSetMapOfLists());
    builder.append(present_mapOfLists);
    if (present_mapOfLists)
      builder.append(mapOfLists);

    return builder.toHashCode();
  }

  public int compareTo(TestStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TestStruct typedOther = (TestStruct)other;

    lastComparison = Boolean.valueOf(isSetIntField()).compareTo(typedOther.isSetIntField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntField()) {      lastComparison = TBaseHelper.compareTo(this.intField, typedOther.intField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLongField()).compareTo(typedOther.isSetLongField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongField()) {      lastComparison = TBaseHelper.compareTo(this.longField, typedOther.longField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStringField()).compareTo(typedOther.isSetStringField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringField()) {      lastComparison = TBaseHelper.compareTo(this.stringField, typedOther.stringField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetListField()).compareTo(typedOther.isSetListField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetListField()) {      lastComparison = TBaseHelper.compareTo(this.listField, typedOther.listField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMapOfLists()).compareTo(typedOther.isSetMapOfLists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapOfLists()) {      lastComparison = TBaseHelper.compareTo(this.mapOfLists, typedOther.mapOfLists);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // INT_FIELD
          if (field.type == TType.I32) {
            this.intField = iprot.readI32();
            setIntFieldIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LONG_FIELD
          if (field.type == TType.I64) {
            this.longField = iprot.readI64();
            setLongFieldIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // STRING_FIELD
          if (field.type == TType.STRING) {
            this.stringField = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LIST_FIELD
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.listField = new ArrayList<String>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2;
                _elem2 = iprot.readString();
                this.listField.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // MAP_OF_LISTS
          if (field.type == TType.MAP) {
            {
              TMap _map3 = iprot.readMapBegin();
              this.mapOfLists = new HashMap<String,List<Integer>>(2*_map3.size);
              for (int _i4 = 0; _i4 < _map3.size; ++_i4)
              {
                String _key5;
                List<Integer> _val6;
                _key5 = iprot.readString();
                {
                  TList _list7 = iprot.readListBegin();
                  _val6 = new ArrayList<Integer>(_list7.size);
                  for (int _i8 = 0; _i8 < _list7.size; ++_i8)
                  {
                    int _elem9;
                    _elem9 = iprot.readI32();
                    _val6.add(_elem9);
                  }
                  iprot.readListEnd();
                }
                this.mapOfLists.put(_key5, _val6);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (isSetIntField()) {
      oprot.writeFieldBegin(INT_FIELD_FIELD_DESC);
      oprot.writeI32(this.intField);
      oprot.writeFieldEnd();
    }
    if (isSetLongField()) {
      oprot.writeFieldBegin(LONG_FIELD_FIELD_DESC);
      oprot.writeI64(this.longField);
      oprot.writeFieldEnd();
    }
    if (this.stringField != null) {
      if (isSetStringField()) {
        oprot.writeFieldBegin(STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.stringField);
        oprot.writeFieldEnd();
      }
    }
    if (this.listField != null) {
      if (isSetListField()) {
        oprot.writeFieldBegin(LIST_FIELD_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.listField.size()));
          for (String _iter10 : this.listField)
          {
            oprot.writeString(_iter10);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.mapOfLists != null) {
      if (isSetMapOfLists()) {
        oprot.writeFieldBegin(MAP_OF_LISTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.mapOfLists.size()));
          for (Map.Entry<String, List<Integer>> _iter11 : this.mapOfLists.entrySet())
          {
            oprot.writeString(_iter11.getKey());
            {
              oprot.writeListBegin(new TList(TType.I32, _iter11.getValue().size()));
              for (int _iter12 : _iter11.getValue())
              {
                oprot.writeI32(_iter12);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TestStruct(");
    boolean first = true;

    if (isSetIntField()) {
      sb.append("intField:");
      sb.append(this.intField);
      first = false;
    }
    if (isSetLongField()) {
      if (!first) sb.append(", ");
      sb.append("longField:");
      sb.append(this.longField);
      first = false;
    }
    if (isSetStringField()) {
      if (!first) sb.append(", ");
      sb.append("stringField:");
      if (this.stringField == null) {
        sb.append("null");
      } else {
        sb.append(this.stringField);
      }
      first = false;
    }
    if (isSetListField()) {
      if (!first) sb.append(", ");
      sb.append("listField:");
      if (this.listField == null) {
        sb.append("null");
      } else {
        sb.append(this.listField);
      }
      first = false;
    }
    if (isSetMapOfLists()) {
      if (!first) sb.append(", ");
      sb.append("mapOfLists:");
      if (this.mapOfLists == null) {
        sb.append("null");
      } else {
        sb.append(this.mapOfLists);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

