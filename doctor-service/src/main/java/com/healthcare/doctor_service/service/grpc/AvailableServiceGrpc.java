package com.healthcare.doctor_service.service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AvailableServiceGrpc {

  private AvailableServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "AvailableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest,
      com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse> getAddAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAvailability",
      requestType = com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest.class,
      responseType = com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest,
      com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse> getAddAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest, com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse> getAddAvailabilityMethod;
    if ((getAddAvailabilityMethod = AvailableServiceGrpc.getAddAvailabilityMethod) == null) {
      synchronized (AvailableServiceGrpc.class) {
        if ((getAddAvailabilityMethod = AvailableServiceGrpc.getAddAvailabilityMethod) == null) {
          AvailableServiceGrpc.getAddAvailabilityMethod = getAddAvailabilityMethod =
              io.grpc.MethodDescriptor.<com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest, com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AvailableServiceMethodDescriptorSupplier("AddAvailability"))
              .build();
        }
      }
    }
    return getAddAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest,
      com.healthcare.doctor_service.service.grpc.SlotList> getGetAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailability",
      requestType = com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest.class,
      responseType = com.healthcare.doctor_service.service.grpc.SlotList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest,
      com.healthcare.doctor_service.service.grpc.SlotList> getGetAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest, com.healthcare.doctor_service.service.grpc.SlotList> getGetAvailabilityMethod;
    if ((getGetAvailabilityMethod = AvailableServiceGrpc.getGetAvailabilityMethod) == null) {
      synchronized (AvailableServiceGrpc.class) {
        if ((getGetAvailabilityMethod = AvailableServiceGrpc.getGetAvailabilityMethod) == null) {
          AvailableServiceGrpc.getGetAvailabilityMethod = getGetAvailabilityMethod =
              io.grpc.MethodDescriptor.<com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest, com.healthcare.doctor_service.service.grpc.SlotList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.SlotList.getDefaultInstance()))
              .setSchemaDescriptor(new AvailableServiceMethodDescriptorSupplier("GetAvailability"))
              .build();
        }
      }
    }
    return getGetAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.BookSlotRequest,
      com.healthcare.doctor_service.service.grpc.BookSlotResponse> getBookSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookSlot",
      requestType = com.healthcare.doctor_service.service.grpc.BookSlotRequest.class,
      responseType = com.healthcare.doctor_service.service.grpc.BookSlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.BookSlotRequest,
      com.healthcare.doctor_service.service.grpc.BookSlotResponse> getBookSlotMethod() {
    io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.BookSlotRequest, com.healthcare.doctor_service.service.grpc.BookSlotResponse> getBookSlotMethod;
    if ((getBookSlotMethod = AvailableServiceGrpc.getBookSlotMethod) == null) {
      synchronized (AvailableServiceGrpc.class) {
        if ((getBookSlotMethod = AvailableServiceGrpc.getBookSlotMethod) == null) {
          AvailableServiceGrpc.getBookSlotMethod = getBookSlotMethod =
              io.grpc.MethodDescriptor.<com.healthcare.doctor_service.service.grpc.BookSlotRequest, com.healthcare.doctor_service.service.grpc.BookSlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.BookSlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.BookSlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AvailableServiceMethodDescriptorSupplier("BookSlot"))
              .build();
        }
      }
    }
    return getBookSlotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AvailableServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AvailableServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AvailableServiceStub>() {
        @java.lang.Override
        public AvailableServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AvailableServiceStub(channel, callOptions);
        }
      };
    return AvailableServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AvailableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AvailableServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AvailableServiceBlockingStub>() {
        @java.lang.Override
        public AvailableServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AvailableServiceBlockingStub(channel, callOptions);
        }
      };
    return AvailableServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AvailableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AvailableServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AvailableServiceFutureStub>() {
        @java.lang.Override
        public AvailableServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AvailableServiceFutureStub(channel, callOptions);
        }
      };
    return AvailableServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addAvailability(com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAvailabilityMethod(), responseObserver);
    }

    /**
     */
    default void getAvailability(com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.SlotList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailabilityMethod(), responseObserver);
    }

    /**
     */
    default void bookSlot(com.healthcare.doctor_service.service.grpc.BookSlotRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.BookSlotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookSlotMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AvailableService.
   */
  public static abstract class AvailableServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AvailableServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AvailableService.
   */
  public static final class AvailableServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AvailableServiceStub> {
    private AvailableServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailableServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AvailableServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAvailability(com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailability(com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.SlotList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookSlot(com.healthcare.doctor_service.service.grpc.BookSlotRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.BookSlotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AvailableService.
   */
  public static final class AvailableServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AvailableServiceBlockingStub> {
    private AvailableServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailableServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AvailableServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse addAvailability(com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthcare.doctor_service.service.grpc.SlotList getAvailability(com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthcare.doctor_service.service.grpc.BookSlotResponse bookSlot(com.healthcare.doctor_service.service.grpc.BookSlotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookSlotMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AvailableService.
   */
  public static final class AvailableServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AvailableServiceFutureStub> {
    private AvailableServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailableServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AvailableServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse> addAvailability(
        com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthcare.doctor_service.service.grpc.SlotList> getAvailability(
        com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthcare.doctor_service.service.grpc.BookSlotResponse> bookSlot(
        com.healthcare.doctor_service.service.grpc.BookSlotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_AVAILABILITY = 0;
  private static final int METHODID_GET_AVAILABILITY = 1;
  private static final int METHODID_BOOK_SLOT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_AVAILABILITY:
          serviceImpl.addAvailability((com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse>) responseObserver);
          break;
        case METHODID_GET_AVAILABILITY:
          serviceImpl.getAvailability((com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.SlotList>) responseObserver);
          break;
        case METHODID_BOOK_SLOT:
          serviceImpl.bookSlot((com.healthcare.doctor_service.service.grpc.BookSlotRequest) request,
              (io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.BookSlotResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthcare.doctor_service.service.grpc.AddAvailabilityRequest,
              com.healthcare.doctor_service.service.grpc.AddAvailabilityResponse>(
                service, METHODID_ADD_AVAILABILITY)))
        .addMethod(
          getGetAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthcare.doctor_service.service.grpc.GetAvailabilityRequest,
              com.healthcare.doctor_service.service.grpc.SlotList>(
                service, METHODID_GET_AVAILABILITY)))
        .addMethod(
          getBookSlotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthcare.doctor_service.service.grpc.BookSlotRequest,
              com.healthcare.doctor_service.service.grpc.BookSlotResponse>(
                service, METHODID_BOOK_SLOT)))
        .build();
  }

  private static abstract class AvailableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AvailableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.healthcare.doctor_service.service.grpc.DoctorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AvailableService");
    }
  }

  private static final class AvailableServiceFileDescriptorSupplier
      extends AvailableServiceBaseDescriptorSupplier {
    AvailableServiceFileDescriptorSupplier() {}
  }

  private static final class AvailableServiceMethodDescriptorSupplier
      extends AvailableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AvailableServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AvailableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AvailableServiceFileDescriptorSupplier())
              .addMethod(getAddAvailabilityMethod())
              .addMethod(getGetAvailabilityMethod())
              .addMethod(getBookSlotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
