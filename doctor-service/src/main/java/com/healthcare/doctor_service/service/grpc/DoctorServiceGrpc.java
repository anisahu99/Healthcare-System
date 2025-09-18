package com.healthcare.doctor_service.service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class DoctorServiceGrpc {

  private DoctorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "DoctorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.CreateDoctorRequest,
      com.healthcare.doctor_service.service.grpc.CreateDoctorResponse> getCreateDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDoctor",
      requestType = com.healthcare.doctor_service.service.grpc.CreateDoctorRequest.class,
      responseType = com.healthcare.doctor_service.service.grpc.CreateDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.CreateDoctorRequest,
      com.healthcare.doctor_service.service.grpc.CreateDoctorResponse> getCreateDoctorMethod() {
    io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.CreateDoctorRequest, com.healthcare.doctor_service.service.grpc.CreateDoctorResponse> getCreateDoctorMethod;
    if ((getCreateDoctorMethod = DoctorServiceGrpc.getCreateDoctorMethod) == null) {
      synchronized (DoctorServiceGrpc.class) {
        if ((getCreateDoctorMethod = DoctorServiceGrpc.getCreateDoctorMethod) == null) {
          DoctorServiceGrpc.getCreateDoctorMethod = getCreateDoctorMethod =
              io.grpc.MethodDescriptor.<com.healthcare.doctor_service.service.grpc.CreateDoctorRequest, com.healthcare.doctor_service.service.grpc.CreateDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.CreateDoctorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.CreateDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorServiceMethodDescriptorSupplier("CreateDoctor"))
              .build();
        }
      }
    }
    return getCreateDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.Empty,
      com.healthcare.doctor_service.service.grpc.DoctorList> getGetDoctorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoctors",
      requestType = com.healthcare.doctor_service.service.grpc.Empty.class,
      responseType = com.healthcare.doctor_service.service.grpc.DoctorList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.Empty,
      com.healthcare.doctor_service.service.grpc.DoctorList> getGetDoctorsMethod() {
    io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.Empty, com.healthcare.doctor_service.service.grpc.DoctorList> getGetDoctorsMethod;
    if ((getGetDoctorsMethod = DoctorServiceGrpc.getGetDoctorsMethod) == null) {
      synchronized (DoctorServiceGrpc.class) {
        if ((getGetDoctorsMethod = DoctorServiceGrpc.getGetDoctorsMethod) == null) {
          DoctorServiceGrpc.getGetDoctorsMethod = getGetDoctorsMethod =
              io.grpc.MethodDescriptor.<com.healthcare.doctor_service.service.grpc.Empty, com.healthcare.doctor_service.service.grpc.DoctorList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoctors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.DoctorList.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorServiceMethodDescriptorSupplier("GetDoctors"))
              .build();
        }
      }
    }
    return getGetDoctorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.Specialization,
      com.healthcare.doctor_service.service.grpc.DoctorList> getGetDoctorsBySpecializationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoctorsBySpecialization",
      requestType = com.healthcare.doctor_service.service.grpc.Specialization.class,
      responseType = com.healthcare.doctor_service.service.grpc.DoctorList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.Specialization,
      com.healthcare.doctor_service.service.grpc.DoctorList> getGetDoctorsBySpecializationMethod() {
    io.grpc.MethodDescriptor<com.healthcare.doctor_service.service.grpc.Specialization, com.healthcare.doctor_service.service.grpc.DoctorList> getGetDoctorsBySpecializationMethod;
    if ((getGetDoctorsBySpecializationMethod = DoctorServiceGrpc.getGetDoctorsBySpecializationMethod) == null) {
      synchronized (DoctorServiceGrpc.class) {
        if ((getGetDoctorsBySpecializationMethod = DoctorServiceGrpc.getGetDoctorsBySpecializationMethod) == null) {
          DoctorServiceGrpc.getGetDoctorsBySpecializationMethod = getGetDoctorsBySpecializationMethod =
              io.grpc.MethodDescriptor.<com.healthcare.doctor_service.service.grpc.Specialization, com.healthcare.doctor_service.service.grpc.DoctorList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoctorsBySpecialization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.Specialization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthcare.doctor_service.service.grpc.DoctorList.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorServiceMethodDescriptorSupplier("GetDoctorsBySpecialization"))
              .build();
        }
      }
    }
    return getGetDoctorsBySpecializationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoctorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorServiceStub>() {
        @java.lang.Override
        public DoctorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorServiceStub(channel, callOptions);
        }
      };
    return DoctorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoctorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorServiceBlockingStub>() {
        @java.lang.Override
        public DoctorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorServiceBlockingStub(channel, callOptions);
        }
      };
    return DoctorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoctorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorServiceFutureStub>() {
        @java.lang.Override
        public DoctorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorServiceFutureStub(channel, callOptions);
        }
      };
    return DoctorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDoctor(com.healthcare.doctor_service.service.grpc.CreateDoctorRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.CreateDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDoctorMethod(), responseObserver);
    }

    /**
     */
    default void getDoctors(com.healthcare.doctor_service.service.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.DoctorList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoctorsMethod(), responseObserver);
    }

    /**
     */
    default void getDoctorsBySpecialization(com.healthcare.doctor_service.service.grpc.Specialization request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.DoctorList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoctorsBySpecializationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DoctorService.
   */
  public static abstract class DoctorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DoctorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DoctorService.
   */
  public static final class DoctorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DoctorServiceStub> {
    private DoctorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDoctor(com.healthcare.doctor_service.service.grpc.CreateDoctorRequest request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.CreateDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDoctors(com.healthcare.doctor_service.service.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.DoctorList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoctorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDoctorsBySpecialization(com.healthcare.doctor_service.service.grpc.Specialization request,
        io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.DoctorList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoctorsBySpecializationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DoctorService.
   */
  public static final class DoctorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DoctorServiceBlockingStub> {
    private DoctorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.healthcare.doctor_service.service.grpc.CreateDoctorResponse createDoctor(com.healthcare.doctor_service.service.grpc.CreateDoctorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDoctorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthcare.doctor_service.service.grpc.DoctorList getDoctors(com.healthcare.doctor_service.service.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoctorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthcare.doctor_service.service.grpc.DoctorList getDoctorsBySpecialization(com.healthcare.doctor_service.service.grpc.Specialization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoctorsBySpecializationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DoctorService.
   */
  public static final class DoctorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DoctorServiceFutureStub> {
    private DoctorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthcare.doctor_service.service.grpc.CreateDoctorResponse> createDoctor(
        com.healthcare.doctor_service.service.grpc.CreateDoctorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDoctorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthcare.doctor_service.service.grpc.DoctorList> getDoctors(
        com.healthcare.doctor_service.service.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoctorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthcare.doctor_service.service.grpc.DoctorList> getDoctorsBySpecialization(
        com.healthcare.doctor_service.service.grpc.Specialization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoctorsBySpecializationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOCTOR = 0;
  private static final int METHODID_GET_DOCTORS = 1;
  private static final int METHODID_GET_DOCTORS_BY_SPECIALIZATION = 2;

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
        case METHODID_CREATE_DOCTOR:
          serviceImpl.createDoctor((com.healthcare.doctor_service.service.grpc.CreateDoctorRequest) request,
              (io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.CreateDoctorResponse>) responseObserver);
          break;
        case METHODID_GET_DOCTORS:
          serviceImpl.getDoctors((com.healthcare.doctor_service.service.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.DoctorList>) responseObserver);
          break;
        case METHODID_GET_DOCTORS_BY_SPECIALIZATION:
          serviceImpl.getDoctorsBySpecialization((com.healthcare.doctor_service.service.grpc.Specialization) request,
              (io.grpc.stub.StreamObserver<com.healthcare.doctor_service.service.grpc.DoctorList>) responseObserver);
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
          getCreateDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthcare.doctor_service.service.grpc.CreateDoctorRequest,
              com.healthcare.doctor_service.service.grpc.CreateDoctorResponse>(
                service, METHODID_CREATE_DOCTOR)))
        .addMethod(
          getGetDoctorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthcare.doctor_service.service.grpc.Empty,
              com.healthcare.doctor_service.service.grpc.DoctorList>(
                service, METHODID_GET_DOCTORS)))
        .addMethod(
          getGetDoctorsBySpecializationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthcare.doctor_service.service.grpc.Specialization,
              com.healthcare.doctor_service.service.grpc.DoctorList>(
                service, METHODID_GET_DOCTORS_BY_SPECIALIZATION)))
        .build();
  }

  private static abstract class DoctorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoctorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.healthcare.doctor_service.service.grpc.DoctorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoctorService");
    }
  }

  private static final class DoctorServiceFileDescriptorSupplier
      extends DoctorServiceBaseDescriptorSupplier {
    DoctorServiceFileDescriptorSupplier() {}
  }

  private static final class DoctorServiceMethodDescriptorSupplier
      extends DoctorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DoctorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DoctorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoctorServiceFileDescriptorSupplier())
              .addMethod(getCreateDoctorMethod())
              .addMethod(getGetDoctorsMethod())
              .addMethod(getGetDoctorsBySpecializationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
