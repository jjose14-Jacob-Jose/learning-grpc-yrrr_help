package com.yrrhelp;

import com.yrrhelp.grpc.User;
import com.yrrhelp.grpc.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannelBuilder = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

//        Creating stubs to call server's APIs
        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(managedChannelBuilder);

        User.LoginRequest loginRequest = User.LoginRequest
                .newBuilder()
                .setUsername("RAM")
                .setPassword("RAM")
                .build();

        User.ApiResponse apiResponse = userStub.login(loginRequest);

        System.out.println("Response: "+apiResponse);
    }
}
