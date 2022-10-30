package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Objects;

public class LambdaHandler implements RequestHandler<Object,String> {

    @Override
    public String handleRequest(Object input, Context context) {

        context.getLogger().log("User Input:" + input);
        return "Hello - " + input;
    }
}
