# learning-grpc-yrrr_help
gRPC Java Tutorials code based on YouTube playlist: https://www.youtube.com/watch?v=O8Yu7JwkFLM&amp;list=PLy_6D98if3UJd5hxWNfAqKMr15HZqFnqf&amp;index=3

---

### Running Project
1. Go to directory 'GrpcDemo', in Terminal run ```clean generate-sources compile install```
2. **Server**: Open project in IntelliJ, and run the file [GrpcDemo/src/main/java/com/yrrhelp/GrpcServer.java](GrpcDemo/src/main/java/com/yrrhelp/GrpcServer.java)
3. **Client**: Open project in IntelliJ, and run the file [GrpcDemo/src/main/java/com/yrrhelp/GrpcClient.java](GrpcDemo/src/main/java/com/yrrhelp/GrpcClient.java)

---
#### Postman
- You can also import the .proto file into Postman and hit the URL [localhost:9090/user/login]()
- JSON to be passed in request: ```{
  "username": "alice",
  "password": "bob"
  }```