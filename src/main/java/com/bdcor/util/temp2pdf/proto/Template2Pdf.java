/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.bdcor.util.temp2pdf.proto;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface Template2Pdf {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Template2Pdf\",\"namespace\":\"com.bdcor.util.temp2pdf.proto\",\"types\":[{\"type\":\"record\",\"name\":\"TemplateData\",\"fields\":[{\"name\":\"template\",\"type\":\"bytes\"},{\"name\":\"params2\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]},{\"type\":\"record\",\"name\":\"PdfData\",\"fields\":[{\"name\":\"pdfData\",\"type\":\"bytes\"}]}],\"messages\":{\"convert\":{\"request\":[{\"name\":\"tempData\",\"type\":\"TemplateData\"}],\"response\":\"PdfData\"}}}");
  /**
   */
  com.bdcor.util.temp2pdf.proto.PdfData convert(com.bdcor.util.temp2pdf.proto.TemplateData tempData) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends Template2Pdf {
    public static final org.apache.avro.Protocol PROTOCOL = com.bdcor.util.temp2pdf.proto.Template2Pdf.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void convert(com.bdcor.util.temp2pdf.proto.TemplateData tempData, org.apache.avro.ipc.Callback<com.bdcor.util.temp2pdf.proto.PdfData> callback) throws java.io.IOException;
  }
}