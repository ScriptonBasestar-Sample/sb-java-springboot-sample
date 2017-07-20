// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.scriptonbasestar.helloworld;

/**
 * Protobuf type {@code helloworld.HelloResponse}
 */
public  final class HelloResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.HelloResponse)
    HelloResponseOrBuilder {
  // Use HelloResponse.newBuilder() to construct.
  private HelloResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloResponse() {
    responseType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HelloResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            responseType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scriptonbasestar.helloworld.HelloWorldProto.internal_static_helloworld_HelloResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scriptonbasestar.helloworld.HelloWorldProto.internal_static_helloworld_HelloResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scriptonbasestar.helloworld.HelloResponse.class, com.scriptonbasestar.helloworld.HelloResponse.Builder.class);
  }

  public static final int RESPONSETYPE_FIELD_NUMBER = 2;
  private int responseType_;
  /**
   * <code>.ResponseType responseType = 2;</code>
   */
  public int getResponseTypeValue() {
    return responseType_;
  }
  /**
   * <code>.ResponseType responseType = 2;</code>
   */
  public com.scriptonbasestar.helloworld.Model.ResponseType getResponseType() {
    com.scriptonbasestar.helloworld.Model.ResponseType result = com.scriptonbasestar.helloworld.Model.ResponseType.valueOf(responseType_);
    return result == null ? com.scriptonbasestar.helloworld.Model.ResponseType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (responseType_ != com.scriptonbasestar.helloworld.Model.ResponseType.SUCCESS.getNumber()) {
      output.writeEnum(2, responseType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseType_ != com.scriptonbasestar.helloworld.Model.ResponseType.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, responseType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.scriptonbasestar.helloworld.HelloResponse)) {
      return super.equals(obj);
    }
    com.scriptonbasestar.helloworld.HelloResponse other = (com.scriptonbasestar.helloworld.HelloResponse) obj;

    boolean result = true;
    result = result && responseType_ == other.responseType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSETYPE_FIELD_NUMBER;
    hash = (53 * hash) + responseType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scriptonbasestar.helloworld.HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.scriptonbasestar.helloworld.HelloResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helloworld.HelloResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.HelloResponse)
      com.scriptonbasestar.helloworld.HelloResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scriptonbasestar.helloworld.HelloWorldProto.internal_static_helloworld_HelloResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scriptonbasestar.helloworld.HelloWorldProto.internal_static_helloworld_HelloResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scriptonbasestar.helloworld.HelloResponse.class, com.scriptonbasestar.helloworld.HelloResponse.Builder.class);
    }

    // Construct using com.scriptonbasestar.helloworld.HelloResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      responseType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scriptonbasestar.helloworld.HelloWorldProto.internal_static_helloworld_HelloResponse_descriptor;
    }

    public com.scriptonbasestar.helloworld.HelloResponse getDefaultInstanceForType() {
      return com.scriptonbasestar.helloworld.HelloResponse.getDefaultInstance();
    }

    public com.scriptonbasestar.helloworld.HelloResponse build() {
      com.scriptonbasestar.helloworld.HelloResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.scriptonbasestar.helloworld.HelloResponse buildPartial() {
      com.scriptonbasestar.helloworld.HelloResponse result = new com.scriptonbasestar.helloworld.HelloResponse(this);
      result.responseType_ = responseType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.scriptonbasestar.helloworld.HelloResponse) {
        return mergeFrom((com.scriptonbasestar.helloworld.HelloResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scriptonbasestar.helloworld.HelloResponse other) {
      if (other == com.scriptonbasestar.helloworld.HelloResponse.getDefaultInstance()) return this;
      if (other.responseType_ != 0) {
        setResponseTypeValue(other.getResponseTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.scriptonbasestar.helloworld.HelloResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.scriptonbasestar.helloworld.HelloResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int responseType_ = 0;
    /**
     * <code>.ResponseType responseType = 2;</code>
     */
    public int getResponseTypeValue() {
      return responseType_;
    }
    /**
     * <code>.ResponseType responseType = 2;</code>
     */
    public Builder setResponseTypeValue(int value) {
      responseType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ResponseType responseType = 2;</code>
     */
    public com.scriptonbasestar.helloworld.Model.ResponseType getResponseType() {
      com.scriptonbasestar.helloworld.Model.ResponseType result = com.scriptonbasestar.helloworld.Model.ResponseType.valueOf(responseType_);
      return result == null ? com.scriptonbasestar.helloworld.Model.ResponseType.UNRECOGNIZED : result;
    }
    /**
     * <code>.ResponseType responseType = 2;</code>
     */
    public Builder setResponseType(com.scriptonbasestar.helloworld.Model.ResponseType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      responseType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ResponseType responseType = 2;</code>
     */
    public Builder clearResponseType() {
      
      responseType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:helloworld.HelloResponse)
  }

  // @@protoc_insertion_point(class_scope:helloworld.HelloResponse)
  private static final com.scriptonbasestar.helloworld.HelloResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scriptonbasestar.helloworld.HelloResponse();
  }

  public static com.scriptonbasestar.helloworld.HelloResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloResponse>
      PARSER = new com.google.protobuf.AbstractParser<HelloResponse>() {
    public HelloResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloResponse> getParserForType() {
    return PARSER;
  }

  public com.scriptonbasestar.helloworld.HelloResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

