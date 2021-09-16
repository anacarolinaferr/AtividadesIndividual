package com.atividadesindividual.Exercicio3;

public class Retangulo {

    public static void main(String[] args) {

        double areaTotal = calculaArea(4,5);
        System.out.println("A área do retangulo é: "+areaTotal);

        double perimetro = calculaPerimetro(4,5);
        System.out.println("O perímetro do retangulo é: "+perimetro);

        double areaLajota = 0.6*0.6;
        quantidadePiso(areaLajota, areaTotal);

        double comprimentoLajota = 0.6;
        quatidadeRodape(comprimentoLajota,perimetro);

    }

    public static double calculaArea(double ladoA, double ladoB){
        double area = ladoA*ladoB;
        return area;
    }

    public static double calculaPerimetro(double ladoA, double ladoB){
        double perimetro = (ladoA*2)+(ladoB*2);
        return perimetro;
    }

    public static void quantidadePiso(double areaLajota, double areaTotal){
        double qtdPisos = areaTotal/areaLajota;
        System.out.println("Quantidade de pisos é: "+qtdPisos);
    }

    public static void quatidadeRodape(double comprimentoLajota , double perimetro){
        double qtdRodapes = perimetro/comprimentoLajota;
        System.out.println("Quantidades de rodapés: "+qtdRodapes);
    }

}
