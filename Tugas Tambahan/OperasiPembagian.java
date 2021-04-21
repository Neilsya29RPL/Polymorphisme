
package TugasTambahan;

public class OperasiPembagian extends OperasiBilanganAbs{
    @Override
    protected void set_A(double a){
        this.a = a;
    }
    @Override
    protected double get_A(){
        return a;
    }
    @Override
    protected void set_B(double b){
        this.b = b;
    }
    @Override
    protected double get_B(){
        return b;
    }
    @Override
    protected void set_C(){
        this.c = this.a - this.b;
    }
    @Override
    protected double get_C(){
        return c;
    }
    @Override
    protected void tampil(){
        System.out.println("=====Operasi Pembagian=====");
        System.out.println(get_A() + " : " + get_B() + " = " + (get_A() / get_B()));
    }  
}
