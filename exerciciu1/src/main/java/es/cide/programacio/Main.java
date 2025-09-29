//nom: Sergi Hui Amorós Cortés
//data: 25 /09/2025
//DNI: 46395575K

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
    System.out.println("Exercici 1: Indica els identificadors correctes");
        double registro1;
        //double 1registro;              //No pot començar amb un nombre
        double archivo_3; 
        //double while;                  //while és una paraula reservada
        double $impuesto;
        //double año;gtrvgtrtgr
        //double primer apellido;        //No pot contenir espais
        double primere_apellido;
        //double primer-apellido;        //No pot contenir guions
        double primerApellido;
        //double Tom's;'                 //No pot contenir caràcters especials
        double C3PO;
        //double 123#;                   //No pot contenir caràcters especials
        double PesoMáximo;
        //double %descuento;             //No pot començar amb aquyuest caràcter '%' ja que s'utilitza per a operacions (mòdul)
        double Weight;
        double $$precioMínimo;
        double _$Único;
        double tamaño_màximo;
        double peso_maximo;
        double Precio___;
        //double matrícula?; //El caràcter '?' s¡utilitza
        double cuántoVale;
        double high;
        double barça;
        double piragüista;
        double B_011;
        double X012AB;
        //double 70libro; //No pot començar amb un nombre
        //double nombre&apellido;
        //double 0X1A; //No pot començar amb un nombre
        //double else; //Paraula reservada (utilitzada en diferents funcions com if, switch, etc)
        System.out.println("Variables correctes");


//---------------------------------------------------------------------------------------------------------------   


        System.out.println("Exercici 2: Identifica els literals correctes");
        //1
        double A2 = 0.5;
        System.out.println(A2 + " A2");
        double B2 = .5;
        System.out.println(B2 + " B2");
        double C2 = 9.3e12;
        System.out.println(C2 + " C2");
        double D2 = 9.3e-12;
        System.out.println(D2 + " D2");
        double E2 = 12345678;
        System.out.println(E2 + " E2");
        //double F2 = 12345678_L; //L no s'usa en el fromat hexadecimal
        //System.out.println(F2);
        //double G2 = 0.8E+0.8; //Punt.
        //System.out.println(G2);
        double H2 = 05_15;
        System.out.println(H2 + " H2");
        /*long I2 = 018CDF; //fff
        System.out.println(I2 + " I2");*/
        double J2 = 0XBC5DA;
        System.out.println(J2 + " J2");
        double K2 = 0x87e3a;
        System.out.println(K2 + " K2");
        double L2 = 234567L;
        System.out.println(L2 + " L2");
        /*double M2 = 0_B11; //la barra baixa ha d'estar entre nombres
        System.out.println(M2 + " M2");*/
        double N2 = 010101;
        System.out.println(N2 + " N2");
        double O2 = 0_557;
        System.out.println(O2 + " O2");
        /*double P2 = .00.8E2; //no és vàlid posar dos punts
        System.out.println(P2 + " P2");*/
        double Q2 = .3e3f;
        System.out.println(Q2 + " Q2");
        double R2 = 0b111;
        System.out.println(R2 + " R2");
        double S2 = 12_234L;
        System.out.println(S2 + " S2");
        double T2 = 0Xabcd; //
        System.out.println(T2 + " T2");
        double U2 = _234;
        System.out.println(U2 + " U2");
        /*double V2 = 1010B; //'B' no pertany a aquest format
        System.out.println(V2 + " V2");*/
        //21
        double W2 = 0x1010B;
        System.out.println(W2 + " W2");
        double X2 = 1_234.2E-2;
        System.out.println(X2 + " X2");
        /*double Y2 = 1234.2EF; //el punt no hauria de ser aquí
        System.out.println(Y2 + " Y2");*/
        double Z2 = 1234.2E3F;
        System.out.println(Z2 + " Z2");
        double A22 = 1234.2E3F;
        System.out.println(A22 + " A22");
        /*double B22 = 1_1.2e_2; //la barra baixa ha d'estar entre nombres
        System.out.println(B22 + " B22");
        double C22 = 0bABCDL; // 'L' no pertany a aquest format
        System.out.println(C22 + " C22");*/
        double D22 = 0X1A;
        System.out.println(D22 + " D22");
        double E22 = 0X12AL;
        System.out.println(E22 + " E22");
        /*double F22 = abcd; //no és un literal
        System.out.println(F22 + " F22");*/
        double G22 = 0125;
        System.out.println(G22 + " G22");
        double H22 = .01011;
        System.out.println(H22 + " H22");
        double I22 = 3e12;
        System.out.println(I22 + " I22");
        double J22 = 3_e12; //la barra baixa ha d'estar entre nombres
        System.out.println(J22 + " J22");
        double K22 = -3E-1_2;
        System.out.println(K22 + " K22");
        double L22 = 0.8E; //Punttt
        System.out.println(L22 + " L22");
        double M22 = 0B1212; //Que
        System.out.println(M22 + " M22");
        double N22 = 1_2_3;
        System.out.println(N22 + " N22");
        double O22 = 0xedad;
        System.out.println(O22 + " O22");
        double P22 = 0XBE2;
        System.out.println(P22 + " P22");
        double Q22 = 101e2;
        System.out.println(Q22 + " Q22");
        double R22 = B1101;
        System.out.println(R22 + " R22");
        double S22 = 1.34.5; //Puntttt
        System.out.println(S22 + " S22");
        double T22 = 12.3E4F;
        System.out.println(T22 + " T22");
        double U22 = 0X12AG; //'G' no pertany a aquest format
        System.out.println(U22 + " U22");
        

        //---------------------------------------------------------------------------------------------------------------   


        System.out.println("Exercici 3: Exercicis de literals del tipus “char”");     
        char a3 = 'a';
        System.out.println(a3 + " a3");
        char b3 = '$';
        System.out.println(b3 + " b3");
        char c3 = '\n';
        System.out.println(c3 + " c3");
        char d3 = '/n'; //l'ús de /n està limitat al salt de línia, s'hauria de fer servir un altre caràcter//
        System.out.println(d3 + " d3");
        char e3 = '\\';
        System.out.println(e3 + " e3");
        char f3 = '\ñ'; //No existeix el caràcter \ñ
        System.out.println(f3 + " f3");
        char g3 = 'T';
        System.out.println(g3 + " g3");
        char h3 = 'ñ';
        System.out.println(h3 + " h3");
        char i3 = 'xyz';
        System.out.println(i3 + " i3");
        char j3 = '\u0066';
        System.out.println(j3 + " j3");
        char k3 = 'XYZ';
        System.out.println(k3 + " k3");
        char l3 = '4';
        System.out.println(l3 + " l3");
        char m3 = '\t';
        System.out.println(m3 + " m3");
        char n3 = '\b';
        System.out.println(n3 + " n3");
        char o3 = k;
        System.out.println(o3 + " o3");
        char p3 = +;
        System.out.println(p3 + " p3");
        char q3 = '+';
        System.out.println(q3 + " q3");
        char r3 = '?';
        System.out.println(r3 + " r3");
        char s3 = 'â';
        System.out.println(s3 + " s3");
        char t3 = ':';


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 4: Exercicis sobre strings");
        String a4 = '8:15 P.M.';
        System.out.println(a4 + " a4");
        String b4 = "Rojo, Blanco y Azul";
        System.out.println(b4 + " b4");
        //String c4 = "Nombre:; //falta una cometa
        System.out.println(c4 + " c4");
        String d4 = "Capítulo \’3\’";
        System.out.println(d4 + " d4");
        String e4 = "1.3e-1-2";
        System.out.println(e4 + " e4");
        String f4 = "";
        System.out.println(f4 + " f4");
        String g4 = " ";
        System.out.println(g4 + " g4");
        String h4 = "A";
        System.out.println(h4 + " h4");
        //String i4 = "FP';
        System.out.println(i4 + " i4");
        String j4 = " programación ";
        System.out.println(j4 + " j4");
        String k4 = "programación "Java"";
        System.out.println(k4 + " k4");
        String l4 = programación;
        System.out.println(l4 + " l4");
        String m4 = "W";
        System.out.println(m4 + " m4");
        String n4 = "\n";
        System.out.println(n4 + " n4");
        String o4 = "4+5*2";    
        System.out.println(o4 + " o4");


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 4: Declara les següents variables");
        int p=1, q=2;
        System.out.println("p= " + p + ", " + "q= " + q);
        float x=2.1, y=2.3, z=3.1;
        System.out.println("x= " + x + ", " + "y= " + y + ", " + "z= " + z);
        char a='A', b='B', c='C';
        System.out.println("a= " + a + ", " + "b= " + b + ", " + "c= " + c);
        double raiz1=300.1, raiz2=200.2;
        System.out.println("raiz1= " + raiz1 + ", " + "raiz2= " + raiz2);
        long contador= 123456789000;
        System.out.println("contador= " + contador);
        short indicador = 127; 
        System.out.println("indicador= " + indicador);
        int indice = 1234123;
        System.out.println("indice= " + indice);
        double precio = 123.45, precioFinal = 234.56;
        System.out.println("precio= " + precio + ", " + "precioFinal= " + precioFinal);
        char car1 = 'S', car2 = 'N';
        System.out.println("car1= " + car1 + ", " + "car2= " + car2);
        byte valor = 100;
        System.out.println("valor= " + valor);
        boolean primero = true, ultimo = false;
        System.out.println("primero= " + primero + ", " + "ultimo= " + ultimo);
        String nombre = "Sergi";
        System.out.println("nombre= " + nombre);


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 5: Declara aquestes variables");
        double edad = 30; //por si acaso e necesario especificar los meses de edad
        System.out.println("edad= " + edad);
        int códigoPostal = 07013; 
        System.out.println("códigoPostal= " + códigoPostal);
        float altura = 1.75;
        System.out.println("altura= " + altura);
        char género = 'H';
        System.out.println("género= " + género);
        String nombre = "Sergi";
        System.out.println("nombre= " + nombre);
        byte númeroDeHijos = 2; //suponinendo que no tiene más de 127 hijos
        System.out.println("númeroDeHijos= " + númeroDeHijos);
        byte iva = 21;
        System.out.println("iva= " + iva);
        byte tallaCamisa = 39;
        System.out.println("tallaCamisa= " + tallaCamisa);
        int peso = 75;
        System.out.println("peso= " + peso);
        double precio = 19.95;
        System.out.println("precio= " + precio);
        boolean alumnoRepetidor = false;
        System.out.println("alumnoRepetidor= " + alumnoRepetidor);
        String mensaje = "Java";
        System.out.println("mensaje= " + mensaje);
        char letra = 'A';
        System.out.println("letra= " + letra);
        boolean mayorEdad = true;
        System.out.println("mayorEdad= " + mayorEdad);
        int minutos = 60;
        System.out.println("minutos= " + minutos);
        int dias = 365;
        System.out.println("dias= " + dias);
        String matriculaCoche = "1234 ABC";
        System.out.println("matriculaCoche= " + matriculaCoche);
        int contador = 0;
        boolean mayorDeEdad = true;
        System.out.println("mayorDeEdad= " + mayorDeEdad);
        String tallaCamiseta = "M";
        System.out.println("tallaCamiseta= " + tallaCamiseta);



        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 6: Convertir les expressions algebràiques a algotímiques");
        int a, b, c;
        double resultat1;
        resultat1 = b/2



    }
}
