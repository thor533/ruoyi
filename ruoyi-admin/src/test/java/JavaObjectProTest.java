import com.ruoyi.framework.web.domain.server.Sys;

/**
 * @Description: TODO
 * @ClassName: JavaObjectProTest
 * @auther: xubin
 * @date: 2020/5/5 上午10:26
 * @Version 1.0
 */
public class JavaObjectProTest {




    JavaObjectProTest at;
    String str;
    byte bt;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean b;
    /**
     * 基本数据类型和引用类型初始值
     */
    public void testInitialize() {
        System.out.println(at+" "+str+" "+bt+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+b+" ");
    }

    JavaObjectProTest[] atA = new JavaObjectProTest[1];
    String[] strA = new String[1];
    byte[] btA = new byte[1];
    short[] sA = new short[1];;
    int[] iA = new int[1];;
    long[] lA = new long[1];;
    float[] fA = new float[1];;
    double[] dA = new double[1];;
    char[] cA = new char[1];;
    boolean[] bA = new boolean[1];;

    public void testInitializeArray() {
        System.out.println(atA[0]+" "+ strA[0]+" "+btA[0]+" "+sA[0]+" "+iA[0]+" "+lA[0]+" "+fA[0]
                +" "+dA[0]+" "+cA[0]+" "+bA[0]+" ");
    }
    /**
     * test
     * @param args
     * output
     * null 0 0 0 0 0.0 0.0  false
     */
    public static void main(String[] args) {
//        JavaObjectProTest at = new JavaObjectProTest();
//        at.testInitialize();
//        at.testInitializeArray();
        Object o = null;
        for (int i=1;i<10;i++){
             o = new Object();
            System.out.println("0="+o);


        }
    }

}
