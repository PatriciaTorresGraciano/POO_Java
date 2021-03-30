package br.com.pooCoursera;

import java.text.DecimalFormat;

public class Paciente {

    double peso;
    double altura;

    Paciente(double peso, double altura){
        this.peso=peso;
        this.altura=altura;

    }

    double calcularIMC(){
        return peso/(altura * altura);

    }

    String diagnostico() {
        DecimalFormat f = new DecimalFormat("#.##");
        double resultado = this.calcularIMC();
        String msg;

        if(resultado<16) {
            msg = "Seu IMC é " +f.format(resultado)+ ". Baixo peso muito grave";
        } else if(resultado>=16 && resultado<17){
            msg="Seu IMC é " +f.format(resultado)+ ". Baixo peso grave";
        } else if(resultado>=17 && resultado<18.5) {
            msg = "Seu IMC é "+f.format(resultado)+ ". Baixo";
        } else if(resultado>=18.5 && resultado<25){
            msg="Seu IMC é " +f.format(resultado)+ ". Peso normal";
        }else if(resultado>=25 && resultado<30){
            msg="Seu IMC é " +f.format(resultado)+ ". Sobrepeso";
        }else if(resultado>=30 && resultado<35){
            msg="Seu IMC é " +f.format(resultado)+ ". Obesidade grau I";
        }else if(resultado>=35 && resultado<40){
            msg="Seu IMC é "+f.format(resultado)+ ". Obesidade grau II";
        }else{
            msg="Seu IMC é " +f.format(resultado)+ ". Obesidade grau III - Obesidade mórbida";
        }
        return msg;
    }
}



