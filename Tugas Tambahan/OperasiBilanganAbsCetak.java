
package TugasTambahan;

public final class OperasiBilanganAbsCetak {
    //final method
    private final void cetakSemua (OperasiBilanganAbs[] OB, double a,double b){
        System.out.println("Operasi Bilangan");
        System.out.println("================");
        //polymorphisme
        for(int i = 0;i<OB.length;i++){
            OB[i].set_A(10.5);
            OB[i].set_B(4.5);
            OB[i].tampil();
        }
    }
    public static void main (String[] args){
        OperasiBilanganAbs[] OB = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        
        OperasiBilanganAbsCetak abc = new OperasiBilanganAbsCetak();
        abc.cetakSemua(OB, 10.5, 4.5);
        }
    }
