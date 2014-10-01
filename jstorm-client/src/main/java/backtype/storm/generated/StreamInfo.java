/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class StreamInfo implements org.apache.thrift.TBase<StreamInfo, StreamInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StreamInfo");

  private static final org.apache.thrift.protocol.TField OUTPUT_FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("output_fields", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField DIRECT_FIELD_DESC = new org.apache.thrift.protocol.TField("direct", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StreamInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StreamInfoTupleSchemeFactory());
  }

  private List<String> output_fields; // required
  private boolean direct; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OUTPUT_FIELDS((short)1, "output_fields"),
    DIRECT((short)2, "direct");

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
        case 1: // OUTPUT_FIELDS
          return OUTPUT_FIELDS;
        case 2: // DIRECT
          return DIRECT;
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
  private static final int __DIRECT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OUTPUT_FIELDS, new org.apache.thrift.meta_data.FieldMetaData("output_fields", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DIRECT, new org.apache.thrift.meta_data.FieldMetaData("direct", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StreamInfo.class, metaDataMap);
  }

  public StreamInfo() {
  }

  public StreamInfo(
    List<String> output_fields,
    boolean direct)
  {
    this();
    this.output_fields = output_fields;
    this.direct = direct;
    set_direct_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StreamInfo(StreamInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_output_fields()) {
      List<String> __this__output_fields = new ArrayList<String>();
      for (String other_element : other.output_fields) {
        __this__output_fields.add(other_element);
      }
      this.output_fields = __this__output_fields;
    }
    this.direct = other.direct;
  }

  public StreamInfo deepCopy() {
    return new StreamInfo(this);
  }

  @Override
  public void clear() {
    this.output_fields = null;
    set_direct_isSet(false);
    this.direct = false;
  }

  public int get_output_fields_size() {
    return (this.output_fields == null) ? 0 : this.output_fields.size();
  }

  public java.util.Iterator<String> get_output_fields_iterator() {
    return (this.output_fields == null) ? null : this.output_fields.iterator();
  }

  public void add_to_output_fields(String elem) {
    if (this.output_fields == null) {
      this.output_fields = new ArrayList<String>();
    }
    this.output_fields.add(elem);
  }

  public List<String> get_output_fields() {
    return this.output_fields;
  }

  public void set_output_fields(List<String> output_fields) {
    this.output_fields = output_fields;
  }

  public void unset_output_fields() {
    this.output_fields = null;
  }

  /** Returns true if field output_fields is set (has been assigned a value) and false otherwise */
  public boolean is_set_output_fields() {
    return this.output_fields != null;
  }

  public void set_output_fields_isSet(boolean value) {
    if (!value) {
      this.output_fields = null;
    }
  }

  public boolean is_direct() {
    return this.direct;
  }

  public void set_direct(boolean direct) {
    this.direct = direct;
    set_direct_isSet(true);
  }

  public void unset_direct() {
    __isset_bit_vector.clear(__DIRECT_ISSET_ID);
  }

  /** Returns true if field direct is set (has been assigned a value) and false otherwise */
  public boolean is_set_direct() {
    return __isset_bit_vector.get(__DIRECT_ISSET_ID);
  }

  public void set_direct_isSet(boolean value) {
    __isset_bit_vector.set(__DIRECT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OUTPUT_FIELDS:
      if (value == null) {
        unset_output_fields();
      } else {
        set_output_fields((List<String>)value);
      }
      break;

    case DIRECT:
      if (value == null) {
        unset_direct();
      } else {
        set_direct((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OUTPUT_FIELDS:
      return get_output_fields();

    case DIRECT:
      return Boolean.valueOf(is_direct());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OUTPUT_FIELDS:
      return is_set_output_fields();
    case DIRECT:
      return is_set_direct();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StreamInfo)
      return this.equals((StreamInfo)that);
    return false;
  }

  public boolean equals(StreamInfo that) {
    if (that == null)
      return false;

    boolean this_present_output_fields = true && this.is_set_output_fields();
    boolean that_present_output_fields = true && that.is_set_output_fields();
    if (this_present_output_fields || that_present_output_fields) {
      if (!(this_present_output_fields && that_present_output_fields))
        return false;
      if (!this.output_fields.equals(that.output_fields))
        return false;
    }

    boolean this_present_direct = true;
    boolean that_present_direct = true;
    if (this_present_direct || that_present_direct) {
      if (!(this_present_direct && that_present_direct))
        return false;
      if (this.direct != that.direct)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_output_fields = true && (is_set_output_fields());
    builder.append(present_output_fields);
    if (present_output_fields)
      builder.append(output_fields);

    boolean present_direct = true;
    builder.append(present_direct);
    if (present_direct)
      builder.append(direct);

    return builder.toHashCode();
  }

  public int compareTo(StreamInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StreamInfo typedOther = (StreamInfo)other;

    lastComparison = Boolean.valueOf(is_set_output_fields()).compareTo(typedOther.is_set_output_fields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_output_fields()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_fields, typedOther.output_fields);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_direct()).compareTo(typedOther.is_set_direct());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_direct()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direct, typedOther.direct);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StreamInfo(");
    boolean first = true;

    sb.append("output_fields:");
    if (this.output_fields == null) {
      sb.append("null");
    } else {
      sb.append(this.output_fields);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("direct:");
    sb.append(this.direct);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_output_fields()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'output_fields' is unset! Struct:" + toString());
    }

    if (!is_set_direct()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'direct' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StreamInfoStandardSchemeFactory implements SchemeFactory {
    public StreamInfoStandardScheme getScheme() {
      return new StreamInfoStandardScheme();
    }
  }

  private static class StreamInfoStandardScheme extends StandardScheme<StreamInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StreamInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OUTPUT_FIELDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.output_fields = new ArrayList<String>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  String _elem18; // required
                  _elem18 = iprot.readString();
                  struct.output_fields.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.set_output_fields_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DIRECT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.direct = iprot.readBool();
              struct.set_direct_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StreamInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.output_fields != null) {
        oprot.writeFieldBegin(OUTPUT_FIELDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.output_fields.size()));
          for (String _iter19 : struct.output_fields)
          {
            oprot.writeString(_iter19);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DIRECT_FIELD_DESC);
      oprot.writeBool(struct.direct);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StreamInfoTupleSchemeFactory implements SchemeFactory {
    public StreamInfoTupleScheme getScheme() {
      return new StreamInfoTupleScheme();
    }
  }

  private static class StreamInfoTupleScheme extends TupleScheme<StreamInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StreamInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.output_fields.size());
        for (String _iter20 : struct.output_fields)
        {
          oprot.writeString(_iter20);
        }
      }
      oprot.writeBool(struct.direct);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StreamInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.output_fields = new ArrayList<String>(_list21.size);
        for (int _i22 = 0; _i22 < _list21.size; ++_i22)
        {
          String _elem23; // required
          _elem23 = iprot.readString();
          struct.output_fields.add(_elem23);
        }
      }
      struct.set_output_fields_isSet(true);
      struct.direct = iprot.readBool();
      struct.set_direct_isSet(true);
    }
  }

}

