package mr.he.factory_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static Logistics logistics;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = reader.readLine();
        configure(param);
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        logistics.planDelivery();
    }

    private static void configure(String param) {
        // 使用参数来决定创建哪个具体的工厂
        // 实际应用中，这个参数可能来自配置文件
        if (param.equals("road")) {
            logistics = new RoadLogistics();
        } else if (param.equals("sea")) {
            logistics = new SeaLogistics();
        } else {
            throw new IllegalArgumentException("Unknown parameter");
        }
    }
}
