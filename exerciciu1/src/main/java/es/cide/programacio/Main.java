//nom: Sergi Hui Amorós Cortés
//data: 25 /09/2025
//DNI: 46395575K

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
    System.out.println("Exercici 1: Indica els identificadors correctes");
        double registro1 = 0;
        System.out.println("registro1= " + registro1);

        //double 1registro;              //No pot començar amb un nombre
        double archivo_3 = 0;
        System.out.println("archivo_3= " + archivo_3);

        //double while;                  //while és una paraula reservada
        double $impuesto = 0;
        System.out.println("$impuesto= " + $impuesto);

        //double año;gtrvgtrtgr
        //double primer apellido;        //No pot contenir espais
        String primer_apellido = "Amorós";
        System.out.println("primer_apellido= " + primer_apellido);

        //double primer-apellido;        //No pot contenir guions
        String primerApellido = "Amorós";
        System.out.println("primerApellido= " + primerApellido);

        //double Tom's;'                 //No pot contenir caràcters especials
        double C3PO = 0;
        System.out.println("C3PO= " + C3PO);

        //double 123#;                   //No pot contenir caràcters especials
        double PesoMáximo = 120.5;
        System.out.println("PesoMáximo= " + PesoMáximo);

        //double %descuento;             //No pot començar amb aquyuest caràcter '%' ja que s'utilitza per a operacions (mòdul)
        double Weight = 12.0;
        System.out.println("Weight= " + Weight);

        double $$precioMínimo = 1204;
        System.out.println("$$precioMínimo= " + $$precioMínimo);

        double _$Único = 3241;
        System.out.println("_$Único= " + _$Único);

        double tamaño_màximo = 43.5;
        System.out.println("tamaño_màximo= " + tamaño_màximo);

        double peso_maximo = 12;
        System.out.println("peso_maximo= " + peso_maximo);

        double Precio___ = 123.45;
        System.out.println("Precio___= " + Precio___);

        //double matrícula?; //El caràcter '?' s¡utilitza
        double cuántoVale = 0;
        System.out.println("cuántoVale= " + cuántoVale);

        double high = 332.4;
        System.out.println("high= " + high);

        double barça = 32.5;
        System.out.println("barça= " + barça);

        double piragüista = 312;
        System.out.println("piragüista= " + piragüista);

        double B_011 = 123;
        System.out.println("B_011= " + B_011);

        double X012AB = 0;
        System.out.println("X012AB= " + X012AB);

        //double 70libro; //No pot començar amb un nombre
        //double nombre&apellido;
        //double 0X1A; //No pot començar amb un nombre
        //double else; //Paraula reservada (utilitzada en diferents funcions com if, switch, etc)


//---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 2: Identifica els literals correctes");
        //1
        double A2 = 0.5;
        System.out.println("A2 " + A2);

        double B2 = .5;
        System.out.println("B2 " + B2);

        double C2 = 9.3e12;
        System.out.println("C2 " + C2);

        double D2 = 9.3e-12;
        System.out.println("D2 " + D2);

        double E2 = 12345678;
        System.out.println("E2 " + E2);

        //double F2 = 12345678_L; //L no s'usa en el fromat hexadecimal
        //System.out.println(F2);

        //double G2 = 0.8E+0.8; //Punt.
        //System.out.println(G2);

        double H2 = 05_15;
        System.out.println("H2 " + H2);

        /*long I2 = 018CDF; //fff
        System.out.println(I2 + " I2");*/

        double J2 = 0XBC5DA;
        System.out.println("J2 " + J2);

        double K2 = 0x87e3a;
        System.out.println("K2 " + K2);

        double L2 = 234567L;
        System.out.println("L2 " + L2);

        /*double M2 = 0_B11; //la barra baixa ha d'estar entre nombres
        System.out.println(M2 + " M2");*/

        double N2 = 010101;
        System.out.println("N2 " + N2);

        double O2 = 0_557;
        System.out.println("O2 " + O2);

        /*double P2 = .00.8E2; //no és vàlid posar dos punts
        System.out.println(P2 + " P2");*/

        double Q2 = .3e3f;
        System.out.println("Q2 " + Q2);

        double R2 = 0b111;
        System.out.println("R2 " + R2);

        double S2 = 12_234L;
        System.out.println("S2 " + S2);

        double T2 = 0Xabcd; //
        System.out.println("T2 " + T2);

        //double U2 = _234; //la barra baixa ha d'estar entre nombres
        //System.out.println(U2 + " U2");

        /*double V2 = 1010B; //'B' no pertany a aquest format
        System.out.println(V2 + " V2");*/

        //21
        double W2 = 0x1010B;
        System.out.println("W2 " + W2);

        double X2 = 1_234.2E-2;
        System.out.println("X2 " + X2);

        /*double Y2 = 1234.2EF; //el punt no hauria de ser aquí
        System.out.println(Y2 + " Y2");*/

        double Z2 = 1234.2E3F;
        System.out.println("Z2 " + Z2);

        double A22 = 1234.2E3F;
        System.out.println("A22 " + A22);

        /*double B22 = 1_1.2e_2; //la barra baixa ha d'estar entre nombres
        System.out.println(B22 + " B22");

        double C22 = 0bABCDL; // 'L' no pertany a aquest format
        System.out.println(C22 + " C22");*/

        double D22 = 0X1A;
        System.out.println("D22 " + D22);

        double E22 = 0X12AL;
        System.out.println("E22 " + E22);

        /*double F22 = abcd; //no és un literal
        System.out.println(F22 + " F22");*/

        double G22 = 0125;
        System.out.println("G22 " + G22);

        double H22 = .01011;
        System.out.println("H22 " + H22);

        double I22 = 3e12;
        System.out.println("I22 " + I22);

        //double J22 = 3_e12; //la barra baixa ha d'estar entre nombres
        //System.out.println(J22 + " J22");

        double K22 = -3E-1_2;
        System.out.println("K22 " + K22);

        //double L22 = 0.8E; //Punttt
        //System.out.println(L22 + " L22");

        //double M22 = 0B1212; //Que
        //System.out.println(M22 + " M22");

        double N22 = 1_2_3;
        System.out.println("N22 " + N22);

        double O22 = 0xedad;
        System.out.println("O22 " + O22);

        double P22 = 0XBE2;
        System.out.println("P22 " + P22);

        double Q22 = 101e2;
        System.out.println("Q22 " + Q22);

        //double R22 = B1101; //'B' no pertany a aquest format
        //System.out.println(R22 + " R22");

        //double S22 = 1.34.5; //Puntttt
        //System.out.println(S22 + " S22");

        double T22 = 12.3E4F;
        System.out.println("T22 " + T22);

        //double U22 = 0X12AG; //'G' no pertany a aquest format
        //System.out.println(U22 + " U22");


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 3: Exercicis de literals del tipus “char”");
        char a3 = 'a';
        System.out.println("a3 " + a3);

        char b3 = '$';
        System.out.println("b3 " + b3);

        char c3 = '\n';
        System.out.println("c3 " + c3);

        //String d3 = '/n'; //són dos caràcters
        char e3 = '\\';
        System.out.println("e3 " + e3);

        //char f3 = '\ñ'; //No existeix el caràcter \ñ
        //System.out.println(f3 + " f3");
        char g3 = 'T';
        System.out.println("g3 " + g3);

        char h3 = 'ñ';
        System.out.println("h3 " + h3);

        //char i3 = 'xyz'; //són tres caràcters
        //System.out.println(i3 + " i3");
        char j3 = '\u0066';
        System.out.println("j3 " + j3);

        //char k3 = 'XYZ'; //són tres caràcters
        //System.out.println(k3 + " k3");
        char l3 = '4';
        System.out.println("l3 " + l3);

        char m3 = '\t';
        System.out.println("m3 " + m3);

        char n3 = '\b';
        System.out.println("n3 " + n3);

        //char o3 = k; //no està entre cometes
        //System.out.println(o3 + " o3");

        //char p3 = +; //no està entre cometes
        //System.out.println(p3 + " p3");

        char q3 = '+';
        System.out.println("q3 " + q3);

        char r3 = '?';
        System.out.println("r3 " + r3);

        char s3 = 'â';
        System.out.println("s3 " + s3);

        char t3 = ':';
        System.out.println("t3 " + t3);


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 4: Exercicis sobre strings");


        //String a4 = '8:15 P.M.'; //es tanca amb cometes dobles
        //System.out.println(a4 + " a4");
        String b4 = "Rojo, Blanco y Azul";
        System.out.println(b4 + " b4");

        //String c4 = "Nombre:; //falta una cometa
        //System.out.println(c4 + " c4");

        //String d4 = "Capítulo \’3\’"; //no és necessari escapar les cometes simples en aquest case
        //System.out.println(d4 + " d4");

        String e4 = "1.3e-1-2";
        System.out.println(e4 + " e4");

        String f4 = "";
        System.out.println(f4 + " f4");

        String g4 = " ";
        System.out.println(g4 + " g4");

        String h4 = "A";
        System.out.println(h4 + " h4");

        //String i4 = "FP';
        //System.out.println(i4 + " i4");

        String j4 = " programación ";
        System.out.println(j4 + " j4");

        //String k4 = "programación "Java""; //falten les  barres invertides. les cometes s'utilitzen per definir strings
        //System.out.println(k4 + " k4");

        //String l4 = programación; //falten les cometes dobles
        //System.out.println(l4 + " l4");

        String m4 = "W";
        System.out.println(m4 + " m4");

        String n4 = "\n";
        System.out.println(n4 + " n4");

        String o4 = "4+5*2";
        System.out.println(o4 + " o4");



        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 5: Declara les següents variables");


        int p=1, q=2;
        System.out.println("p= " + p + ", " + "q= " + q);

        double x1 = 2.1, y1 = 2.3, z1 = 3.1;
        System.out.println("x= " + x1 + ", " + "y= " + y1 + ", " + "z= " + z1);

        char a='A', b='B', c='C';
        System.out.println("a= " + a + ", " + "b= " + b + ", " + "c= " + c);

        double raiz1=300.1, raiz2=200.2;
        System.out.println("raiz1= " + raiz1 + ", " + "raiz2= " + raiz2);

        long contador= 1234567800;
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


        System.out.println("Exercici 6: Declara aquestes variables");
        double edad = 30; //por si acaso e necesario especificar los meses de edad
        System.out.println("edad= " + edad);
        int códigoPostal = 07013;
        System.out.println("códigoPostal= " + códigoPostal);
        double altura1 = 1.75;
        System.out.println("altura= " + altura1);
        char género = 'H';
        System.out.println("género= " + género);
        String nombre1 = "Sergi";
        System.out.println("nombre= " + nombre1);
        byte númeroDeHijos = 2; //suponinendo que no tiene más de 127 hijos
        System.out.println("númeroDeHijos= " + númeroDeHijos);
        byte iva = 21;
        System.out.println("iva= " + iva);
        byte tallaCamisa = 39;
        System.out.println("tallaCamisa= " + tallaCamisa);
        int peso = 75;
        System.out.println("peso= " + peso);
        double precio1 = 19.95;
        System.out.println("precio= " + precio1);
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
        int contador1 = 0;
        System.out.println("contador1= " + contador1);
        boolean mayorDeEdad = true;
        System.out.println("mayorDeEdad= " + mayorDeEdad);
        String tallaCamiseta = "M";
        System.out.println("tallaCamiseta= " + tallaCamiseta);




        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 7: Convertir les expressions algebràiques a algorítmiques");

        //cap misteri, escric literalment el que diu la diapositive, assigno els resultats com a double per si un cas
        
        int a13 = 1, b13 = 2, c13 = 3, d13 = 4;
        int x13 = 1, y13 = 2, z13 = 4;

        double resultat1, resultat2, resultat3, resultat4, resultat5, resultat6, resultat7, resultat8, resultat9, resultat10, resultat11, resultat12, resultat13, resultat14;
        resultat1 = b13/2 - (4*a13*c13);
        System.out.println("resultat1= " + resultat1);

        resultat2 = 3*x13*y13 - 5*x13 +12*x13 - 17;
        System.out.println("resultat2= " + resultat2);

        resultat3 = (b13 + d13)/(c13 + 4);
        System.out.println("resultat3= " + resultat3);

        resultat4 = ((x13*y13)/(y13)) + 2;
        System.out.println("resultat4= " + resultat4);

        resultat5 = (1/y13) + (3*x13/z13) + 1;
        System.out.println("resultat5= " + resultat5);

        resultat6 = 1/(y13 + 3) + x13/y13;
        System.out.println("resultat6= " + resultat6);

        resultat7 = 1/y13 + (3+x13)/(y13 + 1);
        System.out.println("resultat7= " + resultat7);


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 8: Convertir les expressions algebràiques a algorítmiques");

        //cap misteri, escric literalment el que diu la diapositive, assigno els resultats com a double per si un cas

        double f = 5, g = 6, h = 7, j = 8, m = 9, n = 10, r = 13, s = 14, y12 = 4, x12 = 1, e = 6, a12 = 2, b12 = 3, c12 = 4, d12 = 5;
        p = 11;
        q = 12;
        
        resultat1 = 3/2 + 3/4;
        System.out.println("resultat1= " + resultat1);

        resultat2 = (1/(x12 - 5)) - (3*x12*y12)/(4);
        System.out.println("resultat2= " + resultat2);

        resultat3 = (1/2) + 7;
        System.out.println("resultat3= " + resultat3);

        resultat4 = 7 + 1/2;
        System.out.println("resultat4= " + resultat4);

        resultat5 = a12*a12/b12 - c12 + (d12 - e)/(f - (g-h)/j);
        System.out.println("resultat5= " + resultat5);

        resultat6 = m/n + p;
        System.out.println("resultat6= " + resultat6);

        resultat7 = a12*a12/b12*b12 + c12*c12/d12*d12;
        System.out.println("resultat7= " + resultat7);

        resultat8 = (m + n/p) / (q - r/s);
        System.out.println("resultat8= " + resultat8);

        resultat9 = (3*a12 + b12) / (c12 - (d12+ 5*e)/(f+g/2*h));
        System.out.println("resultat9= " + resultat9);

        resultat10 = ((a12*a12) + 2*a12*b12 + b12*b12) /(1/(x12*x12) + 2);
        System.out.println("resultat10= " + resultat10);


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 9: Si a, b y c son variables senceres amb valors a=8, b=3, c=-5, determina el valor de les següents expressions aritmètiques:");

        
        int a1 = 8, b1 = 3, c1 = -5;
        resultat1 = a1 + b1 + c1;
        System.out.println("resultat1= " + resultat1);
        resultat2 = 2 * b1 + 3 * (a1 - c1);
        System.out.println("resultat2= " + resultat2);
        resultat3 = a1/b1;
        System.out.println("resultat3= " + resultat3);
        resultat4 = a1 % b1;
        System.out.println("resultat4= " + resultat4);
        resultat5 = a1 / c1;
        System.out.println("resultat5= " + resultat5);
        resultat6 = a1 % c1; 
        System.out.println("resultat6= " + resultat6);
        resultat7 = a1 * b1 / c1;  
        System.out.println("resultat7= " + resultat7);
        resultat8 = a1 * (b1 / c1);
        System.out.println("resultat8= " + resultat8);
        resultat9 = (a1 * c1) % b1;  
        System.out.println("resultat9= " + resultat9);
        resultat10 = a1 * (c1 % b1);
        System.out.println("resultat10= " + resultat10);
        resultat11 = (3 * a - 2 * b) % (2 * a - c);   
        System.out.println("resultat11= " + resultat11);
        resultat12 = 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println("resultat12= " + resultat12);
        resultat13 = (a - 3 * b) % (c + 2 * a) / (a - c);
        System.out.println("resultat13= " + resultat13);
        resultat14 = a - b - c * 2;
        System.out.println("resultat14= " + resultat14);

//---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 10: Si x, y, z son variables de tipus double amb valors x= 88, y = 3.5, z = -5.2, determina el valor de les següents expressions aritmètiques. Obtén el resultat de cada expressió amb un màxim de quatre decimals:");

        x1 = 88;
        y1 = 3.5;
        z1 = -5.2;
        
        resultat1 = x1 + y1 + z1;
        System.out.println(resultat1);
        resultat2 = 2 * y1 + 3 * (x1 - z1);
        System.out.println(resultat2);
        resultat3 = x1 / y1;
        System.out.println(resultat3);
        resultat4 = x1 % y1;
        System.out.println(resultat4);
        resultat5 = x1 / (y1 + z1);
        System.out.println(resultat5);
        resultat6 = (x1 / y1) + z1;
        System.out.println(resultat6);
        resultat7 = 2 * x1 / 3 * y1;
        System.out.println(resultat7);
        resultat8 = 2 * x1 / (3 * y1);
        System.out.println(resultat8);
        resultat9 = x1 * y1 % z1;
        System.out.println(resultat9);
        resultat10 = x1 * (y1 % z1);
        System.out.println(resultat10);
        resultat11 = 3 * x1 - z1 - 2 * x1;
        System.out.println(resultat11);
        resultat12 = 2 * x1 / 5 % y1;
        System.out.println(resultat12);
        resultat13 = x1 - 100 % y1 % z1;
        System.out.println(resultat13);
        resultat14 = x1 - y1 - z1 * 2;
        System.out.println(resultat14);





        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 11: Determina quin és el tipus de data del resultat de les següents expressions aritmètiques: " );
        byte b2 = 10;
        short s2 = 20;
        long ln = 1000L;
        int i2 = 5, j2 = 8;
        float f2 = 3.5f;
        double d2 = 2.75;
        char c02 = 'A'; 
        //Com que els valors que s'han assignat a les variables són literals, el compilador els reconeix com a tals i els converteix al tipus de dada més gran que hi ha en l'expressió.
        System.out.println(i2 + c02);
        System.out.println(f2 - c02);
        System.out.println(d2 + f2);
        System.out.println(d2 + i2);
        System.out.println(i2 / f2);
        System.out.println(s2 + j2);
        System.out.println(d2 + j2);
        System.out.println(s2 * c02);
        System.out.println(d2 + c02);
        System.out.println(b2 + c02);
        System.out.println(b / c02 + s);
        System.out.println(c02 + c02);
        System.out.println(i2 + ln + d2);
        System.out.println(ln + c02);
        System.out.println(5 / j2);
        System.out.println(5.2 / j2);
        System.out.println(i2 * f2 * 2.5);
        System.out.println(ln * f2 * 2.5F);
        System.out.println(j2 - 4L);
        System.out.println(j2 - 4L * 2.5F);
        System.out.println(b2 - 2.5 * i2  + 35F);
        System.out.println('a' + b2);
        System.out.println('a' + c02);
        System.out.println(c02 + 2);
        System.out.println(c02 - ln / 2);
        System.out.println(2 / i2 + 2.0 /j2);


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 12: Si X, Y y Z son variables de tipus boolean amb valors X = true, Y = false, Z = true, determina el valor de les següents expressions lògiques:");
        
        boolean X1 = true;
        boolean Y = false;
        boolean Z = true;

        System.out.println("a) " + ((X1 && Y) || (X1 && Z))); // true
        System.out.println("b) " + ((X1 || !Y) && (!X1 || Z))); // true
        System.out.println("c) " + (X1 || Y && Z)); // true
        System.out.println("d) " + (!(X1 || Y) && Z)); // false
        System.out.println("e) " + (X1 || Y || X1 && !Z && !Y)); // true
        System.out.println("f) " + (!X1 || !Y || Z && X1 && !Y)); // true


        //---------------------------------------------------------------------------------------------------------------


        System.out.println("Exercici 13: Si W, X i Y son variables de tipus boolean amb valors W = false, X = true, Y = true, Z = false,  determina el valor de les següents expressions lògiques:");

        boolean W = false;
        Y = true;
        Z = false;

        System.out.println("a) " + (W || Y && X1 && W || Z)); // false
        System.out.println("b) " + (X1 && !Y && !X1 || !W && Y)); // true
        System.out.println("c) " + (!(W || !Y) && X1 || Z)); // false
        System.out.println("d) " + (X1 && Y && W || Z || X1)); // true
        System.out.println("e) " + (Y || !(Y || Z && W))); // true
        System.out.println("f) " + (!X1 && Y && (!Z || !X1))); // false







        //---------------------------------------------------------------------------------------------------------------
        System.out.println("Exercici 14: Determina el valor de les següents expressions:");
        int i1 = 8, j1 = 5;
        float x8 = -0.005f, y = -0.01f;
        c3 = 'c';
        char d3 = 'd';

        System.out.println("a) " + (i1 <= j1)); //false
        System.out.println("b) " + (c3 > d3)); //false
        System.out.println("c) " + (x8 >= 0)); //false
        System.out.println("d) " + (x8 < y--)); //false
        System.out.println("e) " + (j1 != 6)); //true
        System.out.println("f) " + (c3 == 99)); //true
        System.out.println("g) " + !(i1 <= j1)); //true
        System.out.println("h) " + !(c3 == 99)); //false
        System.out.println("i) " + !(x8 > 0)); //true
        System.out.println("j) " + (-j1 == i1 - 13)); //true
        System.out.println("k) " + (++x8 > 0)); //true
        System.out.println("l) " + (y-- < 1)); //true
        System.out.println("m) " + (c3 > d3 || c3 > 0)); //true
        System.out.println("n) " + (5 * (i1 + j1) > 'c')); //false
        System.out.println("o) " + (2 * x8 + y == 0)); //false
        //System.out.println("p) " + (2 * x8 + (y == 0))); //no c
        System.out.println("r) " + (x8 < ++y)); //true
        System.out.println("s) " + (-(i1 + j1) != -i1 + j1)); //true
        System.out.println("t) " + (i1 <= j1 && i1 >= c3)); //false
        System.out.println("u) " + (i1 > 0 && j1 < 5)); //false
        System.out.println("v) " + (i1 > 0 || j1 < 5)); //true
        System.out.println("w) " + (x8 > y && i1 > 0 || j1 < 5)); //true
        System.out.println("x) " + ((3 * i1 - 2 * j1) % (2 * d3 - c3) > 3 * d3)); //false
        System.out.println("y) " + (2 * ((i1 / 5) + (4 * (j1 - 3)) % (i1 + j1 - 2)) >= 10)); // true
        System.out.println("z) " + ((i1 - 3 * j1) % (c3 + 2 * d3) / (x8 - y) >= 0)); // false


    }
}