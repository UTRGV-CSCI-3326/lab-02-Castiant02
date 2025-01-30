public class MisMatch{
    public static void main(String[] args){
        String vstring = "Hello Java";
        char vchar='A';
        short vshort=32000;
        int vint=100000;
        long vlong=9876543210L;
        float vfloat= 3.14f;
        double vdouble=2.718281828;
        boolean vboolean=true;
        System.out.print(vstring + " string ");
        System.out.print(vchar + " chacacter");
        System.out.print(vshort + " stores whole numbers -32768 to 32768 ");
        System.out.print(vint +" whole number -2 million to 2 million ");
        System.out.print(vlong + " large values in the quintillions ");
        System.out.print(vfloat + " decimal values of 6-7 digits ");
        System.out.print(vdouble + " decimal values form 15-16 digits ");
        System.out.print(vboolean +" sores true or false values ");
        System.out.print("mixing variables"+ vstring +","+ vboolean + "," + vchar + ","+ vfloat);
}

}
