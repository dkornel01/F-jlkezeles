
package fájlkezelés;


public class Emberek {
    private String Nev,Varos;
    private byte kor;

    public Emberek(String Nev, byte kor,String Varos) {
        this(Nev+";"+kor+";"+Varos);
    }

    public Emberek(String sor) {
       String[] s=sor.split(";");
       this.Nev=s[0];
       this.kor=Byte.parseByte(s[1]);
       this.Varos=s[2];
    }

    @Override
    public String toString() {
        return "Emberek{" + "Nev=" + Nev + ", Varos=" + Varos + ", kor=" + kor + '}';
    }
    
    
   
    
}
