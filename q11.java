// ORM class for table 'q11'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Jul 15 22:14:05 PDT 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class q11 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String job_title;
  public String get_job_title() {
    return job_title;
  }
  public void set_job_title(String job_title) {
    this.job_title = job_title;
  }
  public q11 with_job_title(String job_title) {
    this.job_title = job_title;
    return this;
  }
  private java.math.BigDecimal percentage;
  public java.math.BigDecimal get_percentage() {
    return percentage;
  }
  public void set_percentage(java.math.BigDecimal percentage) {
    this.percentage = percentage;
  }
  public q11 with_percentage(java.math.BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }
  private Integer total_count;
  public Integer get_total_count() {
    return total_count;
  }
  public void set_total_count(Integer total_count) {
    this.total_count = total_count;
  }
  public q11 with_total_count(Integer total_count) {
    this.total_count = total_count;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof q11)) {
      return false;
    }
    q11 that = (q11) o;
    boolean equal = true;
    equal = equal && (this.job_title == null ? that.job_title == null : this.job_title.equals(that.job_title));
    equal = equal && (this.percentage == null ? that.percentage == null : this.percentage.equals(that.percentage));
    equal = equal && (this.total_count == null ? that.total_count == null : this.total_count.equals(that.total_count));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof q11)) {
      return false;
    }
    q11 that = (q11) o;
    boolean equal = true;
    equal = equal && (this.job_title == null ? that.job_title == null : this.job_title.equals(that.job_title));
    equal = equal && (this.percentage == null ? that.percentage == null : this.percentage.equals(that.percentage));
    equal = equal && (this.total_count == null ? that.total_count == null : this.total_count.equals(that.total_count));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.job_title = JdbcWritableBridge.readString(1, __dbResults);
    this.percentage = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.total_count = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.job_title = JdbcWritableBridge.readString(1, __dbResults);
    this.percentage = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.total_count = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(job_title, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(percentage, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(total_count, 3 + __off, 4, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(job_title, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(percentage, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(total_count, 3 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.job_title = null;
    } else {
    this.job_title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.percentage = null;
    } else {
    this.percentage = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.total_count = null;
    } else {
    this.total_count = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.job_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, job_title);
    }
    if (null == this.percentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.percentage, __dataOut);
    }
    if (null == this.total_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total_count);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.job_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, job_title);
    }
    if (null == this.percentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.percentage, __dataOut);
    }
    if (null == this.total_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total_count);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(job_title==null?"null":job_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percentage==null?"null":percentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_count==null?"null":"" + total_count, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(job_title==null?"null":job_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percentage==null?"null":percentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_count==null?"null":"" + total_count, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.job_title = null; } else {
      this.job_title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percentage = null; } else {
      this.percentage = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_count = null; } else {
      this.total_count = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.job_title = null; } else {
      this.job_title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percentage = null; } else {
      this.percentage = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_count = null; } else {
      this.total_count = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    q11 o = (q11) super.clone();
    return o;
  }

  public void clone0(q11 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("job_title", this.job_title);
    __sqoop$field_map.put("percentage", this.percentage);
    __sqoop$field_map.put("total_count", this.total_count);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("job_title", this.job_title);
    __sqoop$field_map.put("percentage", this.percentage);
    __sqoop$field_map.put("total_count", this.total_count);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("job_title".equals(__fieldName)) {
      this.job_title = (String) __fieldVal;
    }
    else    if ("percentage".equals(__fieldName)) {
      this.percentage = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("total_count".equals(__fieldName)) {
      this.total_count = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("job_title".equals(__fieldName)) {
      this.job_title = (String) __fieldVal;
      return true;
    }
    else    if ("percentage".equals(__fieldName)) {
      this.percentage = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("total_count".equals(__fieldName)) {
      this.total_count = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
