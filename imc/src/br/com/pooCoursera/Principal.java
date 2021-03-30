package br.com.pooCoursera;

public class Principal {

    public static void main(String[] args) {

       Paciente nome1=new Paciente(95.5,1.71);
       System.out.println(nome1.diagnostico());

        Paciente nome2=new Paciente(135.00,1.71);
        System.out.println(nome2.diagnostico());

        Paciente nome3=new Paciente(60.00,1.75);
        System.out.println(nome3.diagnostico());
    }
}
