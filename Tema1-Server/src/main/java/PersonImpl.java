import io.grpc.stub.StreamObserver;
import proto.PersonGrpc;
import proto.PersonOuterClass;

public class PersonImpl extends PersonGrpc.PersonImplBase
{
    @Override
    public void returnPersonData(PersonOuterClass.PersonRequest request,
                                 StreamObserver<PersonOuterClass.Reply> responseObserver)
    {
        
    }
}
