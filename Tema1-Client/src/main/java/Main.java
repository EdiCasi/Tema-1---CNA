import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.PersonGrpc;
import proto.PersonOuterClass;

import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress
                ("localhost", 8999).usePlaintext().build();

        PersonGrpc.PersonStub personStub = PersonGrpc.newStub(channel);

        System.out.println("1) Add a person");
        System.out.println("0) Exit");

        int option = -1;
        while (option != 0)
        {
            
            System.out.print("Introduceti o optiune: ");
            Scanner sc=new Scanner(System.in);
            option=sc.nextInt();


            switch(option)
            {
                case 1:
                    Scanner read = new Scanner(System.in);
                    System.out.print("Introduceti numele: ");
                    String nume = read.nextLine();
                    System.out.print("Introduceti CNP: ");
                    String CNP = read.nextLine();

                    personStub.returnPersonData(
                            PersonOuterClass.PersonRequest.newBuilder().setName(nume).setCNP(CNP).build(),
                            new StreamObserver<PersonOuterClass.Reply>()
                            {
                                @Override
                                public void onNext(PersonOuterClass.Reply reply)
                                {
                                    System.out.println(reply);
                                }

                                @Override
                                public void onError(Throwable throwable)
                                {
                                    System.out.println("Error: " + throwable.getMessage());
                                }

                                @Override
                                public void onCompleted()
                                {

                                }
                            }
                    );
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nu stiu comanda asta!");
                    break;
            }

            }

        channel.shutdown();
    }
}
