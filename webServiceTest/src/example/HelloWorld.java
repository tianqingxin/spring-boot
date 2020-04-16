package example;


public class HelloWorld {
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) {
      String url = "http://localhost:8089/app/webApp/api";
      String method = "getStr";
      String[] parms = new String[]{"abc"};
      WebSvrClient webClient = new WebSvrClient();

      String svrResult = webClient.CallMethod(url, method, parms);

      System.out.println(svrResult);
  }
}
