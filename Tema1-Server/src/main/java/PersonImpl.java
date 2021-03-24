import io.grpc.stub.StreamObserver;
import proto.PersonGrpc;
import proto.PersonOuterClass;

public class PersonImpl extends PersonGrpc.PersonImplBase
{
    @Override
    public void returnPersonData(PersonOuterClass.PersonRequest request,
                                 StreamObserver<PersonOuterClass.Reply> responseObserver)
    {
        PersonOuterClass.Reply.Builder reply = PersonOuterClass.Reply.newBuilder();

        String message = errorMessage(request.getName(), request.getCNP());

        if (message == null)
        {
            reply.setMessage("Nume: " + request.getName() + "; "
                    + "Varsta: " + findAgeFromCNP(request.getCNP()) + "; "
                    + "Gen: " + findGenderFromCNP(request.getCNP())).build();

            System.out.println(reply.getMessage());
        } else
        {
            reply.setMessage(message).build();
            System.out.println(message);
        }

        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();

    }

    private Integer findAgeFromCNP(String CNP)
    {
        Integer varsta;
        varsta = Character.getNumericValue(CNP.charAt(1)) * 10 + Character.getNumericValue(CNP.charAt(2));

        if (CNP.charAt(0) == '1' || CNP.charAt(0) == '2')
            return 2021 - 1900 - varsta;

        if (CNP.charAt(0) == '5' || CNP.charAt(0) == '6')
            return 2021 - 2000 - varsta;

        return null;
    }

    private String findGenderFromCNP(String CNP)
    {
        if (CNP.charAt(0) == '1' || CNP.charAt(0) == '5')
            return "Male";

        if (CNP.charAt(0) == '2' || CNP.charAt(0) == '6')
            return "Female";

        return null;
    }

    public String errorMessage(String name, String CNP)
    {
        if (CNP.length() != 13)
            return "CNP dimmension is wrong";

        if (CNP.charAt(0) != '1' && CNP.charAt(0) != '2' && CNP.charAt(0) != '5' && CNP.charAt(0) != '6')
            return "Your CNP is wrong";

        Integer varsta;
        varsta = Character.getNumericValue(CNP.charAt(1)) * 10 + Character.getNumericValue(CNP.charAt(2));

        if (name == null || name == "")
            return "Name cannot be Empty";

        if (!CNP.matches("[0-9]+"))
            return "Only numeric values is allowed in CNP";

        return null;

    }

}
