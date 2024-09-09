package com.yrrhelp.user;

import com.yrrhelp.grpc.User;
import com.yrrhelp.grpc.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {


    @Override
    public void login(User.LoginRequest request, StreamObserver<User.ApiResponse> responseObserver) {
        System.out.println("Inside login");
        String username = request.getUsername();
        String password = request.getPassword();

        User.ApiResponse.Builder response = User.ApiResponse.newBuilder();


        if(username.equalsIgnoreCase(password)) {
//            Login success.
            response.setResponseCode(0).setResponseMessage("Success");
        } else {
//            Failure case.
            response.setResponseCode(100).setResponseMessage("Invalid password");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.ApiResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
