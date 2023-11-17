package sprawdzian;

import java.lang.reflect.Constructor;

public class Tool {
    String type;

    public Tool(String type) {
        this.type = type;
    }
    public void useTool(){
        System.out.println(type);
    }
}
