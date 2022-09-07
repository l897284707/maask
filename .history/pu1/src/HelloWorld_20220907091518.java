import com.sun.xml.internal.ws.wsdl.WSDLOperationFinder;

public class HelloWorld {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        // char --> int
        char sex = '男';
        int sex2 = sex;
        System.out.println(sex2);
        // float 和 double属于近似值
        float f = 20f;
        double d = f;
        System.out.println(f);

        int num = 2147483000;
        float num2 = num;
        System.out.println(num2);
        System.out.printf("热太阳能");
    }
}
