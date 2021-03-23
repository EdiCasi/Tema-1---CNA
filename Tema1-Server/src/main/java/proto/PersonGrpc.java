package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: person.proto")
public class PersonGrpc {

  private PersonGrpc() {}

  public static final String SERVICE_NAME = "Person";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.PersonOuterClass.PersonRequest,
      proto.PersonOuterClass.Reply> getReturnPersonDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "returnPersonData",
      requestType = proto.PersonOuterClass.PersonRequest.class,
      responseType = proto.PersonOuterClass.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PersonOuterClass.PersonRequest,
      proto.PersonOuterClass.Reply> getReturnPersonDataMethod() {
    io.grpc.MethodDescriptor<proto.PersonOuterClass.PersonRequest, proto.PersonOuterClass.Reply> getReturnPersonDataMethod;
    if ((getReturnPersonDataMethod = PersonGrpc.getReturnPersonDataMethod) == null) {
      synchronized (PersonGrpc.class) {
        if ((getReturnPersonDataMethod = PersonGrpc.getReturnPersonDataMethod) == null) {
          PersonGrpc.getReturnPersonDataMethod = getReturnPersonDataMethod = 
              io.grpc.MethodDescriptor.<proto.PersonOuterClass.PersonRequest, proto.PersonOuterClass.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Person", "returnPersonData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonOuterClass.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonOuterClass.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonMethodDescriptorSupplier("returnPersonData"))
                  .build();
          }
        }
     }
     return getReturnPersonDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonStub newStub(io.grpc.Channel channel) {
    return new PersonStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonImplBase implements io.grpc.BindableService {

    /**
     */
    public void returnPersonData(proto.PersonOuterClass.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.PersonOuterClass.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getReturnPersonDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReturnPersonDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PersonOuterClass.PersonRequest,
                proto.PersonOuterClass.Reply>(
                  this, METHODID_RETURN_PERSON_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class PersonStub extends io.grpc.stub.AbstractStub<PersonStub> {
    private PersonStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonStub(channel, callOptions);
    }

    /**
     */
    public void returnPersonData(proto.PersonOuterClass.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.PersonOuterClass.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReturnPersonDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonBlockingStub extends io.grpc.stub.AbstractStub<PersonBlockingStub> {
    private PersonBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PersonOuterClass.Reply returnPersonData(proto.PersonOuterClass.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getReturnPersonDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonFutureStub extends io.grpc.stub.AbstractStub<PersonFutureStub> {
    private PersonFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PersonOuterClass.Reply> returnPersonData(
        proto.PersonOuterClass.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReturnPersonDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETURN_PERSON_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETURN_PERSON_DATA:
          serviceImpl.returnPersonData((proto.PersonOuterClass.PersonRequest) request,
              (io.grpc.stub.StreamObserver<proto.PersonOuterClass.Reply>) responseObserver);
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

  private static abstract class PersonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PersonOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Person");
    }
  }

  private static final class PersonFileDescriptorSupplier
      extends PersonBaseDescriptorSupplier {
    PersonFileDescriptorSupplier() {}
  }

  private static final class PersonMethodDescriptorSupplier
      extends PersonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonFileDescriptorSupplier())
              .addMethod(getReturnPersonDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
