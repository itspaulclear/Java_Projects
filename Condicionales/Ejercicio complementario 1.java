import java.util.*;

public class ejercicioEvaluable {
    public static void main(String[] args) throws Exception {
     /* Realizar un programa para una tienda de ropa que tenga un menú principal con las opciones de: productos, carrito de la compra, facturación y salir. 
        Importante:
        Que contenga 3 productos con su precio, que al seleccionar un producto esté en carrito de la compra y que si selecciona facturación (utilizar switch) */

        Scanner tienda = new Scanner(System.in);

        String[] productos = {"camiseta", "vaqueros", "sombrero"};
        double[] precios = {20.75, 19.65, 10.45};

        boolean continuar = true;
        ArrayList<String> carritoDeLaCompra = new ArrayList<>(); 
        

        while(continuar) {
            System.out.printf("%n1. PRODUCTOS%n");
            System.out.printf("2. CARRITO DE LA COMPRA%n");
            System.out.printf("3. FACTURACIÓN%n");
            System.out.printf("4. SALIR%n");
            System.out.println(" ");
            System.out.print("Seleccione una opción: ");
            int opcion = tienda.nextInt();

            switch(opcion) {
                case 1:
                    for(int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i]);
                    }

                    System.out.println(" ");
                    System.out.printf("Escoge un producto: ");
                    int seleccionProducto = tienda.nextInt();
                   
                    if(seleccionProducto == 1) {
                        carritoDeLaCompra.add(productos[0]);
                        System.out.println("Has añadido con éxito el producto" + " '" + productos[0] + "' " + "al carrito de la compra");
                    } else if(seleccionProducto == 2) {
                        carritoDeLaCompra.add(productos[1]);
                        System.out.println("Has añadido con éxito el producto" + " '" + productos[1] + "' " + "al carrito de la compra");
                    } else if(seleccionProducto == 3) {
                        carritoDeLaCompra.add(productos[2]);
                        System.out.println("Has añadido con éxito el producto" + " '" + productos[2] + "' " + "al carrito de la compra");
                    } else {
                        System.out.println("Selección errónea");
                    }
                    break;
                case 2:
                    if(carritoDeLaCompra.isEmpty()) {
                        System.out.println("El carrito está vacío");
                        break;
                    } else{
                        int contador = 1;
                        for(String elemento : carritoDeLaCompra) {
                        System.out.println(contador + ". " + elemento);
                        contador++;
                        }
                        System.out.print("¿Desea entrar a la facturación? ");
                        String opcion3 = tienda.next();
                        if(opcion3.equalsIgnoreCase("Si")) {
                        double suma = 0;
                        double iva = 0;
                        double sumaTotal = 0;
                        for(int i = 0; i < carritoDeLaCompra.size(); i++) {
                            if(carritoDeLaCompra.get(i).equalsIgnoreCase("camiseta")) {
                                suma += precios[0];
                            } else if(carritoDeLaCompra.get(i).equalsIgnoreCase("vaqueros")) {
                                suma += precios[1];
                            } else if(carritoDeLaCompra.get(i).equalsIgnoreCase("sombrero")) {
                                suma += precios[1];
                            } else {
                                System.out.println("ERROR");
                            }
                        }
                        iva = suma * 0.21;
                        sumaTotal = (suma * 0.21) + suma;
                        System.out.println("============================================");
                        System.out.printf("Importe productos: %.2f euros%n", suma);
                        System.out.printf("Importe IVA: %.2f euros%n", iva);
                        System.out.printf("Importe total: %.2f euros%n", sumaTotal);
                        System.out.println("============================================");
                        } else if(opcion3.equalsIgnoreCase("No")) {
                            System.out.println("Continúe con su compra");
                            break;
                        } else {
                            System.out.println("ERROR");
                            break;
                        }
                    }

                    System.out.print("¿Desea salir del proceso de compra? ");
                    String procesoSalir1 = tienda.next();
                    if(procesoSalir1.equalsIgnoreCase("si")) {
                        System.out.println("____Gracias por usar nuestro servicio_____");
                        continuar = false;
                    } else if(procesoSalir1.equalsIgnoreCase("no")) {
                        carritoDeLaCompra.clear();
                        break;
                    } else{
                        System.out.println("ERROR");
                        break;
                    }
                    break;
                case 3:
                    if(carritoDeLaCompra.isEmpty()) {
                        System.out.println("El carrito está vacío");
                        break;
                    } else{
                        double suma = 0;
                        double iva = 0;
                        double sumaTotal = 0;
                        for(int i = 0; i < carritoDeLaCompra.size(); i++) {
                            if(carritoDeLaCompra.get(i).equalsIgnoreCase("camiseta")) {
                                suma += precios[0];
                            } else if(carritoDeLaCompra.get(i).equalsIgnoreCase("vaqueros")) {
                                suma += precios[1];
                            } else if(carritoDeLaCompra.get(i).equalsIgnoreCase("sombrero")) {
                                suma += precios[1];
                            } else {
                                System.out.println("ERROR");
                            }
                        }
                        iva = suma * 0.21;
                        sumaTotal = (suma * 0.21) + suma;
                        System.out.println("============================================");
                        System.out.printf("Importe productos: %.2f euros%n", suma);
                        System.out.printf("Importe IVA: %.2f euros%n", iva);
                        System.out.printf("Importe total: %.2f euros%n", sumaTotal);
                        System.out.println("============================================");
                    }

                    System.out.print("¿Desea salir del proceso de compra? ");
                    String procesoSalir2 = tienda.next();
                    if(procesoSalir2.equalsIgnoreCase("si")) {
                        System.out.println("____Gracias por usar nuestro servicio_____");
                        continuar = false;
                    } else if(procesoSalir2.equalsIgnoreCase("no")) {
                        carritoDeLaCompra.clear(); // Inicia un nuevo proceso de compra, y si lo quitas te mantiene en el mismo proceso de compra
                        break;
                    } else{
                        System.out.println("ERROR");
                        break;
                    }
                    break;
                case 4: 
                    System.out.println("____Gracias por usar nuestro servicio_____");
                    continuar = false;
                    break;
                default:
                    System.out.println("ERROR");
                    break; 
                }   
            }

    }
}

