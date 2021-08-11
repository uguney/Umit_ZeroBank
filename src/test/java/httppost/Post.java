package httppost;

import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

public class Post {
    public static void main(String[] args) throws IOException {
        {
            System.out.println("şüişi");
        }
        OkHttpClient client = new OkHttpClient();

        String[] values ={"js","nodejs","react"};

        for (String value:values) {
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"name\":\""+value+"\"}");
            Request request = new Request.Builder()
                    .url("http://localhost:3000/courses")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "60d81132-e9c0-d506-b943-dea1e514733a")
                    .build();

            Response response = client.newCall(request).execute();

            try{
                if(response.toString().contains("Bad Request"))
                    System.out.println(response.body().string());


            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }

    }
}
